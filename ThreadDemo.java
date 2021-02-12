package day9_thread;

class MyRunnable implements Runnable{

	@Override
	public void run() {
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("going to be run by a thread: " + Thread.currentThread().getName());
	}
	
}

public class ThreadDemo {

	public static void main(String[] args) {
		
		// Create a thread object
		Runnable runnable = new MyRunnable();
		Thread t = new Thread(runnable);
		// start the thread
		t.start();
		
		Thread t1 = new Thread(runnable);
		// start th	e thread
		t1.start();
		
		System.out.println("going to be run by main thread: " + Thread.currentThread().getName() );

	}

}
