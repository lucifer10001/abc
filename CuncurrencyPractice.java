package day9_thread;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class CuncurrencyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExecutorService service = new ThreadPoolExecutor(2, 7, 0,TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2));
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				System.out.println(Thread.currentThread().getName());	
			}	
		};
		for(int i =0;i<10;i++) {
			// No thread creation here
			service.submit(runnable);
		}
		
		service.shutdown();
		
	}

}
