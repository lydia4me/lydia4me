package com.lydia4me.funny.extend.thread.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest implements Callable<String> {
	@Override
	public String call() throws Exception {
		System.out.println("call sleep");
		Thread.sleep(3000L);
		System.out.println("call return");
		return "running in callable";
	}
	
	public static void main(String[] args){
		ExecutorService service = Executors.newSingleThreadExecutor();
		Future<String> fu = service.submit(new CallableTest());
		Future<String> fu2 = service.submit(new CallableTest());
		try {
			System.out.println(fu.get());
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
		
		fu2.cancel(true);
		service.shutdown();
	}
}
