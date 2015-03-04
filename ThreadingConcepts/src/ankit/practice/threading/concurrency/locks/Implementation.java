package ankit.practice.threading.concurrency.locks;

public class Implementation {

	public static void main(String[] args) {
		LockingSubject subject = new LockingSubject();
		
		
		new Thread(new LockingImplementingThread(subject, "Thread1")).start();
		new Thread(new LockingImplementingThread(subject, "Thread2")).start();
		new Thread(new LockingImplementingThread(subject, "Thread3")).start();
	}
}
