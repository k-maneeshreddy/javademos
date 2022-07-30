package practiceprojects;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class p01ValidationOfEmail {
	
    public static void main(String[] args) 
    { 
    	
      ArrayList<String> list= new ArrayList<String>();
     // String[] strArray = new String[6];
      list.add("sai@gmail.com");
      list.add("saimaneesh@gmail.com"); 
      list.add("maneeshkumar@gmail.com"); 
      list.add("maneeshreddy@gmail.com"); 
      list.add("manish@gmail.com");
      list.add("saimaneeshkumar@gmail.com"); 
      
    
        
      String searchElement;
      System.out.println("E-mail: ");
      Scanner scanner = new Scanner(System.in);
      searchElement = scanner.nextLine();
      String regex = "^(.+)@(.+)$";
      Matcher matcher = Pattern.compile(regex).matcher(searchElement);
      if (matcher.matches() && list.stream().anyMatch(mail -> mail.equals(searchElement))) {
          System.out.println(searchElement + " = is present");
      } else {
          System.out.println("Invalid or is not present");
      }
                   }
                
    }