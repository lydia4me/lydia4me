package com.lydia4me.funny.extend.thread.store;

import java.util.Random;

public class Customer implements Runnable {

	@Override
	public void run() {
		int num = 5;
		while(num > 0){
			int buyNum = new Random().nextInt(10);
			System.out.println("Customer: 我要购买"+buyNum+"个产品");
			Store.getInstance().storeOut(buyNum);
			System.out.println("Customer: 购买"+buyNum+"个产品成功");
			num --;
			try {
				System.out.println();
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
