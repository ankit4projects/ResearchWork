package ankit.practice.threading.concurrency.semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoreUsage {
	
	private Semaphore semaphore = null;
	
	public SemaphoreUsage(int noOfThreadAtOneTime) {
		semaphore = new Semaphore(noOfThreadAtOneTime);
	}
	
	public void useButTwoAtOneTime(int timeInMilliSecs) {
		try {
			System.out.println("Waiting for permit for " + timeInMilliSecs + " Thread.");
			
			semaphore.acquire();
			
			System.out.println("Acquired permit for " + timeInMilliSecs + " Thread.");
			Thread.sleep(timeInMilliSecs);
			
			semaphore.release();
			
			System.out.println("Release permit for " + timeInMilliSecs + " Thread.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
