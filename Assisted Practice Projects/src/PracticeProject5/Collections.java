package PracticeProject5;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
//        creating array list
		System.out.println("Array List :");
		ArrayList<String> city=new ArrayList<String>();   
	      city.add("Chennai");//
	      city.add("Mumbai");    	   
	      System.out.println(city);  
		
//          creating vector
	      System.out.println("\n");
	      System.out.println("Vector :");
	      Vector<Integer> vec = new Vector();
	      vec.addElement(15); 
	      vec.addElement(30); 
	      System.out.println(vec);
		
//       creating linked list
	      System.out.println("\n");
	      System.out.println("Linked List :");
	      LinkedList<String> names=new LinkedList<String>();  
	      names.add("Jack");  
	      names.add("John");  	      
	      Iterator<String> itr=names.iterator();  
	      while(itr.hasNext()){  
	       System.out.println(itr.next());  
	       
//         creating hash set
	       System.out.println("\n");
	       System.out.println("HashSet :");
	       HashSet<Integer> set=new HashSet<Integer>();  
	       set.add(101);  
	       set.add(102);  
	       set.add(103);
	       set.add(104);
	       System.out.println(set);
	       
//         creating linked hash set
	       System.out.println("\n");
	       System.out.println("Linked HashSet :");
	       LinkedHashSet<Integer> set2=new LinkedHashSet<Integer>();  
	       set2.add(01);  
	       set2.add(02);  
	       set2.add(03);
	       set2.add(04);	       
	       System.out.println(set2);
	      	} 
	      }  
	}

