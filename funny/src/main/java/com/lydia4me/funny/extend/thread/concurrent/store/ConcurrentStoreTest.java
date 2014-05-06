package com.lydia4me.funny.extend.thread.concurrent.store;

import java.util.NoSuchElementException;
import java.util.Random;
import java.util.concurrent.*;

public class ConcurrentStoreTest {
	private static LinkedBlockingQueue<String> msgQueue = new LinkedBlockingQueue<String>(2);

	public static void main(String[] args) {
		ExecutorService producerService = Executors.newFixedThreadPool(2);
		CompletionService<String> completionService = new ExecutorCompletionService<String>(producerService);
        completionService.submit(new Producer("1"));
        completionService.submit(new Producer("2"));
        producerService.shutdown();

        ExecutorService customerService = Executors.newFixedThreadPool(2);
        CompletionService<String> completionCustomerService = new ExecutorCompletionService<String>(customerService);
        completionCustomerService.submit(new Customer("a"));
        completionCustomerService.submit(new Customer("b"));
        customerService.shutdown();
	}

    private static class Producer implements Callable<String>{
        private String name;
        public Producer(String name){
            this.name = name;
        }
        @Override
        public String call() {
            while (true){
                try {
                    String msg = System.currentTimeMillis()+""+new Random().nextInt(20);
                    System.out.println("Producer "+name+" : add "+msg);
                    msgQueue.put(msg);
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static class Customer implements Callable<String>{
        private String name;
        public Customer(String name){
            this.name = name;
        }
        @Override
        public String call() {
            while (true){
                try {
                    String msg = msgQueue.poll(6000, TimeUnit.MILLISECONDS);
                    System.out.println("Customer "+name+" : poll "+msg);
                    Thread.sleep(4000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
