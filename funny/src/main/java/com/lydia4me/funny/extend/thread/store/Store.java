package com.lydia4me.funny.extend.thread.store;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Store {
	private static Store store;
	private List<String> productList;
	private Store(){
		productList = new ArrayList<String>();
	}
	public static Store getInstance(){
		if(store == null){
			synchronized(Store.class){
				if(store == null){
					store = new Store();
				}
			}
		}
		return store;
	}
	public synchronized void storeIn(Collection<String> products){
		System.out.println("Store in: 入库" + products.size() + "个产品！");
		productList.addAll(products);
		this.notify();
	}
	public synchronized Collection<String> storeOut(int num){
		System.out.println("Store out: 需要出库" + num + "个产品！");
		while(num > productList.size()){
			System.out.println("Store out: 库存不足，需要"+num+"个，只有"+productList.size()+"个。开始等待");
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Store out: 库存够"+num+"个了，开始出库！");
		List<String> out = new ArrayList<String>(num);
		for(int i = num - 1; i >= 0; i --){
			out.add(productList.remove(i));
		}
		System.out.println("Store out: 出库"+num+"个产品成功！");
		return out;
	}
}
