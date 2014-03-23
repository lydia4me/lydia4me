package com.lydia4me.funny.extend.thread.wakeup;

public class WakeupTest {
	public static void main(String[] args){
		Runnable sleep = new SleepThread();
		new Thread(sleep).start();
		Runnable wakeup = new WakeupThread(sleep);
		new Thread(wakeup).start();
	}
}
