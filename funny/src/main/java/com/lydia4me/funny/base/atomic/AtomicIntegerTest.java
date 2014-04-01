package com.lydia4me.funny.base.atomic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerTest {
	public static int normal = 0;
	public static AtomicInteger atomicInt = new AtomicInteger(0);
	public static void main(String[] args) {
		List<Thread> threads = new ArrayList<Thread>();
		for(int i = 0; i < 100; i ++){
			Thread thread = new Thread(new Runnable(){
				@Override
				public void run() {
					for(int j = 0; j < 100; j ++){
						normal++;
						atomicInt.incrementAndGet();
						Thread.yield();
					}
				}
			});
			thread.start();
			threads.add(thread);
		}
		for(Thread thread : threads){
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println(normal);
		System.out.println(atomicInt.get());
	}
}
