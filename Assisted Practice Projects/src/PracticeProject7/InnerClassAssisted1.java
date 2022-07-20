package PracticeProject7;

public class InnerClassAssisted1 {

	 private String msg="Welcome"; 
	 
	 class Inner{  
	  void hello(){System.out.println(msg+", Let's start learning Inner Classes");}  
	 }  


	public static void main(String[] args) {

		InnerClassAssisted1 obj=new InnerClassAssisted1();
		InnerClassAssisted1.Inner in=obj.new Inner();  
		in.hello();  
	}
}