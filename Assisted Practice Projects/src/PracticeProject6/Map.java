package PracticeProject6;

import java.util.*;
import java.util.Map.Entry;
public class Map {

	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Tim");    
	      hm.put(2,"Tom");    
	      hm.put(3,"Jack");   
	       
	      System.out.println("\nHashmap Elements ");  
	      for(Entry<Integer, String> m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(4,"Tommy");  
	      ht.put(5,"Calvin");  
	      ht.put(6,"Neon");  
	      ht.put(7,"John");  

	      System.out.println("\nHashTable Elements ");  
	      for(Entry<Integer, String> n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
	      map.put(8,"Annie");    
	      map.put(9,"Carlot");    
	      map.put(10,"Cat");       
	      
	      System.out.println("\nTree Map Elements : ");  
	      for(Entry<Integer, String> l:map.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  
}

