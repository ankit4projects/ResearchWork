package ankit.practice.threading.concurrency.semaphores;

public class Implementation {

	public static void main(String[] args) {
		
		SemaphoreUsage semaphoreSubject = new SemaphoreUsage(1);
		
		new Thread(new SemaphoreUsageThread(semaphoreSubject, 4000)).start();
		new Thread(new SemaphoreUsageThread(semaphoreSubject, 8000)).start();
		new Thread(new SemaphoreUsageThread(semaphoreSubject, 12000)).start();
	}
}
