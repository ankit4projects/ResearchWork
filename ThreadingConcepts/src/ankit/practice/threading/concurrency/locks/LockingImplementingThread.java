package ankit.practice.threading.concurrency.locks;

public class LockingImplementingThread implements Runnable{

	LockingSubject subject;
	String threadName;
	
	public LockingImplementingThread(LockingSubject subject, String threadName) {
		this.subject = subject;
		this.threadName = threadName;
	}
	
	public void run() {
		subject.restrictCodeConcurrent(threadName);
	}
}
