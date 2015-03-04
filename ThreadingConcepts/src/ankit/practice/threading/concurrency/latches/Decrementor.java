package ankit.practice.threading.concurrency.latches;

import java.util.concurrent.CountDownLatch;

public class Decrementor implements Runnable{

	private CountDownLatch latch;
	
	public Decrementor(CountDownLatch latch) {
		this.latch = latch;
	}
	
	public void run() {
		System.out.println("Decrementor Thread - Waiting...");
		
		try {
			Thread.sleep(5000);
			System.out.println("Decrementor Thread - " + latch.getCount());
			latch.countDown();
			
			Thread.sleep(5000);
			System.out.println("Decrementor Thread - " + latch.getCount());
			latch.countDown();
			
			Thread.sleep(5000);
			System.out.println("Decrementor Thread - " + latch.getCount());
			latch.countDown();
			
			Thread.sleep(5000);
			System.out.println("Decrementor Thread - " + latch.getCount());
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("Decrementor completed...");
	}
}
