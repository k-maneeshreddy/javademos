package PracticeProject2;

public class AccessModifiers {

	
	public void methodPublic() {
		System.out.println("This is public method");
	}
	
	private void methodPrivate() {
		System.out.println("This is private method");
	}
	
	void methodDefault() {
		System.out.println("This is default method");
	}
	
	protected void methodProtected() {
		System.out.println("This is protected method");
	}
	
	//same class able to acceess all types of modifiers
	public static void main(String [] args) {
		
		AccessModifiers obj= new  AccessModifiers();
		
		obj.methodDefault();
		obj.methodPrivate();
		obj.methodProtected();
		obj.methodPublic();
		
	
	}
}