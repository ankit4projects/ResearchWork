package ankit.practice.threading.concurrency.threadlocal;

public class Implementation {

	public static void main(String[] args) {
		
		ThreadLocalRunnable threadLocal = new ThreadLocalRunnable();
		
		new Thread(threadLocal).start();
		new Thread(threadLocal).start();
		new Thread(threadLocal).start();
	}
}
