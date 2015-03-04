package ankit.practice.threading.concurrency.latches;

import java.util.concurrent.CountDownLatch;

public class Waiter implements Runnable{

	private CountDownLatch latch;
	
	public Waiter(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void run() {
		System.out.println("Waiter Thread - Waiting...");
		
		try {
			latch.await();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Waiting completed...");
	}
}
