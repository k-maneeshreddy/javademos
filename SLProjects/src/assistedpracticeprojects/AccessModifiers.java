package assistedpracticeprojects;

public class AccessModifiers {

		
		public void methodPublic() {
			System.out.println("This is public");
		}
		
		private void methodPrivate() {
			System.out.println("This is private");
		}
		
		void methodDefault() {
			System.out.println("This is default");
		}
		
		protected void methodProtected() {
			System.out.println("This is protected ");
		}
		
		//same class able to access all types of modifiers
		public static void main(String [] args) {
			
			AccessModifiers obj= new  AccessModifiers();
			
			obj.methodDefault();
			obj.methodPrivate();
			obj.methodProtected();
			obj.methodPublic();
			
		
		}
	}
