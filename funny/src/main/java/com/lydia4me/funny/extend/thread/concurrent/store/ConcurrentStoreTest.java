package com.lydia4me.funny.extend.thread.concurrent.store;

import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentStoreTest implements Callable<String> {
	private static ConcurrentLinkedQueue<String> msgQueue = new ConcurrentLinkedQueue<String>();
	private int count = 0;
	private String name;
	
	public ConcurrentStoreTest(String name) {
		super();
		this.name = name;
	}

	@Override
	public String call() throws Exception {
		while(true){
			try{
				msgQueue.remove();
				count ++;
			}catch(NoSuchElementException e){
				return "Thread:"+name+"; loaded "+count + "";
			}
			Thread.sleep(10L);
		}
	}
	
	public static void main(String[] args) {
		Thread createThread = new Thread(new Runnable(){
			@Override
			public void run() {
				for(int i = 0; i < 10000; i ++){
					msgQueue.add(System.currentTimeMillis() + "");
				}
			}
		});
		createThread.start();
		try {
			createThread.join();
		} catch (InterruptedException e1) {
			e1.printStackTrace();
		}
		
		ExecutorService service = Executors.newFixedThreadPool(10);
		CompletionService<String> completionService = new ExecutorCompletionService<String>(service);
		for(int i = 0; i < 10; i ++){
			completionService.submit(new ConcurrentStoreTest(i+""));
		}
		service.shutdown();
		try {
			for(int i = 0; i < 10; i ++){
				System.out.println(completionService.take().get());
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}
