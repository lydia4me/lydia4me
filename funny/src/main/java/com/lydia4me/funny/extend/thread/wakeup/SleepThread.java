package com.lydia4me.funny.extend.thread.wakeup;

public class SleepThread implements Runnable {

	public void run() {
		System.out.println("我得睡一个小时!");
		synchronized(this){
			try {
				this.wait(1000L*60*60);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("睡醒了~~");
	}

}
