package com.map;

import java.util.*;

public class Maps {
	public static void main(String[] args) {
		
		//HashMap
		System.out.println("1) HashMap................");
		HashMap<Integer,String> hm=new HashMap<Integer,String>();      
	      hm.put(1,"Abc");    
	      hm.put(2,"Def");    //arrange/print like Acsending order
	      hm.put(3,"Ghi");   
	       
	      System.out.println("\nHashmap are: "+hm); //it's like a set of data 
	      for(Map.Entry m:hm.entrySet()){    
	       System.out.println(m.getKey()+" "+m.getValue());    
	      }
	      
	    
	       
	      Hashtable<Integer,String> ht=new Hashtable<Integer,String>();  
	      
	      ht.put(1,"Jkl");  
	      ht.put(2,"Mno"); //arrange/print like descsending order
	      ht.put(3,"Pqr");  
	       

	      System.out.println("\n HashTable are : "+ht);  
	      for(Map.Entry n:ht.entrySet()){    
	       System.out.println(n.getKey()+" "+n.getValue());    
	      }
	      
	      
	      //TreeMap
	      
	      TreeMap<Integer,String> c=new TreeMap<Integer,String>();    
	      c.put(1,"Vwx");    
	      c.put(2,"Yza");    
	      c.put(3,"Bcd");       
	      
	      System.out.println("\nTreeMap are ");  
	      for(Map.Entry l:c.entrySet()){    
	       System.out.println(l.getKey()+" "+l.getValue());    
	      }    
	      
	   } 

}
