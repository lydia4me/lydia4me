package extend.thread;

public class ThreadDriver {
	public static void main(String[] args){
		MyThread thread = new MyThread();
		thread.run();
		System.out.println("Thread start!");
		for(int i = 1; i < 30; i ++){
			try {
				Thread.sleep(i * 1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("before notify");
			thread.notify();
		}
	}
}
