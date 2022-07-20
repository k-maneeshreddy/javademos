package practiceprojects;

import java.util.Scanner;

public class p01ValidationOfEmail {
	
    public static void main(String[] args) 
    { 
      String[] strArray = new String[6];
      strArray[0]= "tony@gmail.com";
      strArray[1]= "max@gmail.com"; 
      strArray[2]= "rosey@gmail.com"; 
      strArray[3]= "tim@gmail.com"; 
      strArray[4]= "jones@gmail.com";
      strArray[5]= "jack@gmail.com"; 
      
        boolean found = false;
        int index = 0;
        
        Scanner Str=new Scanner(System.in);
        System.out.println("Enter Email ID:");
        String a= Str.nextLine(); 
       for (int i = 0; i <strArray.length; i++) {
       if(a.equals(strArray[i])) {
            index = i; found = true; 
            }
        }
       if(found)
          System.out.println("\n" +a +" found at the index "+index);
        else
          System.out.println("\n" +a +" not found in the array");
 
    }
}
