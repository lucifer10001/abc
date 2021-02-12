package day9_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Concurrencydemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service=Executors.newFixedThreadPool(3);
		Runnable runnable=new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());
			}
		};
		for(int i=0;i<5;i++) {
			Thread t=new Thread(runnable);
			service.submit(t);
			
		}
		

	}

}
