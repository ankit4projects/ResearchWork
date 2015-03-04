package ankit.practice.threading.concurrency.threadlocal;

public class ThreadLocalRunnable implements Runnable{

	ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
		public Integer initialValue() {
			return -1;
		}
	};
	
	public void run() {
		threadLocal.set((int) (Math.random() * 100D));
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Thread Local set value: " + threadLocal.get());
	}
}
