package smalltest;

import java.util.Hashtable;

public class HashConcept {

	public static void main(String[] args) {
		Hashtable<String, Integer> hash_table =  new Hashtable<String, Integer>(); 
		  
		    
		        hash_table.put("Geeks", 10); 
		        hash_table.put("4", 15); 
		        hash_table.put("Geeks", 20); 
		        hash_table.put("Welcomes", 25); 
		        hash_table.put("You", 30); 
		        hash_table.put("",50);
		        // Displaying the Hashtable 
		        System.out.println("Initial Table is: " + hash_table); 
		  
		        // Checking for the Value '10' 
		        System.out.println("Is the value '10' present? " +  
		        hash_table.containsValue(10)); 
		  
		        // Checking for the Value '30' 
		        System.out.println("Is the value '30' present? " +  
		        hash_table.containsValue(30)); 
		  
		        // Checking for the Value '40' 
		        System.out.println("Is the value '40' present? " +  
		        hash_table.containsValue(40)); 

	}

}
