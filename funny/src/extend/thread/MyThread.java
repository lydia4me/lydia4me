package extend.thread;

public class MyThread implements Runnable {

	@Override
	public void run() {
		String test = "1";
		synchronized(test){
			while(true){
				System.out.println("线程唤醒");
				try {
					test.wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
