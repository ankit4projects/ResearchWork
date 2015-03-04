package ankit.practice.threading.concurrency.semaphores;

public class SemaphoreUsageThread implements Runnable{

	SemaphoreUsage sub = null;
	int timeInMilliSecs = 0;
	
	public SemaphoreUsageThread(SemaphoreUsage sub, int timeInMilliSecs) {
		this.sub = sub;
		this.timeInMilliSecs = timeInMilliSecs;
	}
	
	public void run() {
		sub.useButTwoAtOneTime(timeInMilliSecs);
	}
}
