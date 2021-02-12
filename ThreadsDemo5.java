package day9_thread;

 
import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		List<Thread> l1=new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Thread t=new Thread(runnable);
			t.start();
			l1.add(t);
			//t.join();
			
		}
		for(Thread t:l1) {
			t.join();
		}
		System.out.println(Thread.currentThread().getName());
	}

}
