package com.lydia4me.funny.extend.thread.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Producer implements Runnable {

	@Override
	public void run() {
		int num = 10;
		while(num > 0){
			int newNum = new Random().nextInt(8);
			List<String> newProducts = new ArrayList<String>();
			for(int i = 0; i < newNum; i ++){
				newProducts.add(String.valueOf(i));
			}
			System.out.println("\t\tProducer: 新生产"+newNum+"个产品");
			Store.getInstance().storeIn(newProducts);
			num --;
			try {
				System.out.println("\t\tProducer: 休息3秒钟再说把");
				System.out.println();
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
