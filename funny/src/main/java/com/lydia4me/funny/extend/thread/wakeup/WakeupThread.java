package com.lydia4me.funny.extend.thread.wakeup;

public class WakeupThread implements Runnable {
	private Runnable sleepThread;
	

	public WakeupThread(Runnable sleepThread) {
		super();
		this.sleepThread = sleepThread;
	}

	public void run() {
		int i = 0;
		while(i < 3){
			System.out.println("起床啦");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			i ++;
		}
		synchronized(sleepThread){
			sleepThread.notify();
		}
	}

}
