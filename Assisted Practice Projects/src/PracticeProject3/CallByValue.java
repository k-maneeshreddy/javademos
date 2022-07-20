package PracticeProject3;

public class CallByValue {

	int val=200;

	int operation(int val) {
		val =val*10/100;
		return(val);
	}

	public static void main(String args[]) {
		CallByValue d = new CallByValue();
		System.out.println("Before operation value of data is "+d.val);
		d.operation(200);
		System.out.println("After operation value of data is "+d.val);
		}
	}


