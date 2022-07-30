package Threadpriority;

import javax.management.MXBean;

public class MultiThreadPriority extends Thread{
	
	public static void main(String[] args) {
		
		MultiThreadPriority mt1 = new MultiThreadPriority();
		mt1.setName("mt1");
		mt1.setPriority(MIN_PRIORITY);
		mt1.start();
		
		MultiThreadPriority mt2 = new MultiThreadPriority();
		mt2.setName("mt2");
		mt2.setPriority(MAX_PRIORITY);
		mt2.start();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName());
	}
	
}