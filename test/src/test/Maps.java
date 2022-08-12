package test;

import java.util.*;

class Maps {
	
	public static void main(String[] args) {
		// map
		
		//Hashmap
		HashMap<Integer,String> test=new HashMap<Integer,String>();      
	      test.put(1,"Arun");    
	      test.put(2,"Ganesh");    
	      test.put(3,"Hari");   

	      System.out.println("\nThe elements of Hashmap are ");  
	      for(Map.Entry m:test.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	     //HashTable
	       
	      Hashtable<Integer,String> obj=new Hashtable<Integer,String>();  
	      
	      obj.put(4,"Vysakh");  
	      obj.put(5,"Dev");  
	      obj.put(6,"Adarsh");  
	      obj.put(7,"Don");  

	      System.out.println("\nThe elements of HashTable are ");  
	      for(Map.Entry n:obj.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> obj2=new TreeMap<Integer,String>();    
	      obj2.put(8,"Ashik");    
	      obj2.put(9,"Anandhu");    
	      obj2.put(10,"Roy");       
	      
	      System.out.println("\nThe elements of TreeMap are ");  
	      for(Map.Entry l:obj2.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   }  

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


