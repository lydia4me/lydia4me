package com.lydia4me.funny.extend.thread.store;

public class StoreTest {
	public static void main(String[] args){
		Thread customer = new Thread(new Customer());
		customer.start();
		Thread producer = new Thread(new Producer());
		producer.start();
	}
}
