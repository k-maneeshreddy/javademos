package JoinDemo;

import java.util.Scanner;

public class joinDemo extends Thread {

	private static int n, sum;
	
	public static void main(String[] args) {
		System.out.println("Sum of first N numbers");
		System.out.println("Enter a value: ");
		Scanner scanner = new Scanner(System.in);
		joinDemo.n = scanner.nextInt();
		
		joinDemo jd = new joinDemo();
		jd.start();
		
		try {
			jd.join();			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Sum of first " + joinDemo.n + " numbers = " + joinDemo.sum);
	}
	
	
	@Override
	public void run() {
		for (int i=1; i<joinDemo.n; i++) {
			joinDemo.sum += i;
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}