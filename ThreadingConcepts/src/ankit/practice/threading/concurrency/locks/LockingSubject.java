package ankit.practice.threading.concurrency.locks;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockingSubject {

	Lock lock = new ReentrantLock();
	
	public void restrictCodeConcurrent(String threadName) {
		
		try {
			System.out.println(threadName + ", Going to acquire lock.");
			lock.lock();
			System.out.println(threadName + ", Entered the critical block.");
			Thread.sleep(5000);
			lock.unlock();
			System.out.println(threadName + ", Release the lock.");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
