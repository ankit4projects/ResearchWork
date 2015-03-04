package ankit.practice.threading.concurrency.barrier;

import java.util.concurrent.CyclicBarrier;

public class Implementation {

	public static void main(String[] args) {
		CyclicBarrier barrier1 = new CyclicBarrier(3, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Barrier 1 - Action Completed...");				
			}
		});
		
		CyclicBarrier barrier2 = new CyclicBarrier(3, new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Barrier 2 - Action Completed...");				
			}
		});
		
		CyclicBarrierRunnableEx1 thread1 = new CyclicBarrierRunnableEx1(barrier1, barrier2, 2000);
		CyclicBarrierRunnableEx1 thread2 = new CyclicBarrierRunnableEx1(barrier1, barrier2, 4000);
		CyclicBarrierRunnableEx1 thread3 = new CyclicBarrierRunnableEx1(barrier1, barrier2, 8000);
		
		new Thread(thread1).start();
		new Thread(thread2).start();
		new Thread(thread3).start();
	}
}
