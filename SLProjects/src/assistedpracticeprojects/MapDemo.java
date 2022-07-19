package assistedpracticeprojects;

	import java.util.*;
	
	public class MapDemo {

		public static void main(String[] args) {
//          map
			
//          Hash map
			HashMap<Integer,String> hm=new HashMap<Integer,String>();      
		      hm.put(1,"Tim");    
		      hm.put(2,"Mercy");    
		      hm.put(3,"Tom");   
		       
		      System.out.println("\nThe elements of Hashmap are ");  
		      for(Map.Entry m:hm.entrySet()){    
		       System.out.println(m.getKey()+" "+m.getValue());    
		      }
		      
//            HashTable
		       
		      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
		      
		      ht.put(4,"Alex");  
		      ht.put(5,"Rosey");  
		      ht.put(6,"Jack");  
		      ht.put(7,"John");  

		      System.out.println("\nThe elements of HashTable are ");  
		      for(Map.Entry n:ht.entrySet()){    
		       System.out.println(n.getKey()+" "+n.getValue());    
		      }
		      
		      
//           TreeMap
		      
		      TreeMap<Integer,String> map=new TreeMap<Integer,String>();    
		      map.put(8,"Annelie");    
		      map.put(9,"Carler");    
		      map.put(10,"Catie");       
		      
		      System.out.println("\nThe elements of TreeMap are ");  
		      for(Map.Entry l:map.entrySet()){    
		       System.out.println(l.getKey()+" "+l.getValue());    
		      }    
		      
		   }  
	}

