package ankit.practice.threading.concurrency.barrier;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class CyclicBarrierRunnableEx1 implements Runnable{

	CyclicBarrier barrier1;
	CyclicBarrier barrier2;
	int timeToSleepinMilliSecs;
	
	public CyclicBarrierRunnableEx1(CyclicBarrier barrier1, CyclicBarrier barrier2, int timeToSleepinMilliSecs) {
		this.barrier1 = barrier1;
		this.barrier2 = barrier2;
		this.timeToSleepinMilliSecs = timeToSleepinMilliSecs;
	}
	
	public void run() {
		
		try {
			
			Thread.sleep(timeToSleepinMilliSecs);
			System.out.println(timeToSleepinMilliSecs + " - Thread, No. of Threads waiting on barrier1: " + barrier1.getNumberWaiting());
			barrier1.await();
			System.out.println(timeToSleepinMilliSecs + " - Thread, barrier1 is completed");
			
			
			Thread.sleep(timeToSleepinMilliSecs);
			System.out.println(timeToSleepinMilliSecs + " - Thread, No. of Threads waiting on barrier2: " + barrier2.getNumberWaiting());
			barrier2.await();
			System.out.println(timeToSleepinMilliSecs + " - Thread, barrier2 is completed");
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
