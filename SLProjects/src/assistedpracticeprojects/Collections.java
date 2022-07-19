package assistedpracticeprojects;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
//       Creating array list
		System.out.println("ArrayList");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Chennai");//
	      city.add("Hyderabad");    	   
	      System.out.println(city);  
		
//        Creating Vector
	      System.out.println("\n");
	      System.out.println("Vector");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
//        Creating linked list
	      System.out.println("\n");
	      System.out.println("LinkedList");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Max");  
	      names.add("Jack");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
//         creating hash set
	       System.out.println("\n");
	       System.out.println("HashSet");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(102);  
	       set.add(103);
	       set.add(104);
	       System.out.println(set);
	       
//         Creating linked hash set
	       System.out.println("\n");
	       System.out.println("LinkedHashSet");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(12);  
	       set2.add(13);  
	       set2.add(14);
	       set2.add(15);	       
	       System.out.println(set2);
	      	} 
	      }  
	}
