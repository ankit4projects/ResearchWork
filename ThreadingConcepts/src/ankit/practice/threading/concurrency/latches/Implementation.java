package ankit.practice.threading.concurrency.latches;

import java.util.concurrent.CountDownLatch;

public class Implementation {

	public static void main(String[] args) {
		
		CountDownLatch latch = new CountDownLatch(3);
		
		Waiter waiter = new Waiter(latch);
		Decrementor decre = new Decrementor(latch);
		
		new Thread(waiter).start();
		new Thread(decre).start();
		

	}
}
