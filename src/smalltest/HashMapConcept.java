package smalltest;
import java.util.*; 
import java.util.Map.Entry;
 
public class HashMapConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Creating an empty HashMap 
		HashMap hash_map = new HashMap(); 
		  
        // Mapping string values to int keys 
        hash_map.put(10, "Geeks"); 
        hash_map.put(15, "4"); 
        hash_map.put(20, "Geeks"); 
        hash_map.put(25, "Welcomes"); 
        hash_map.put(30, "You"); 
        hash_map.put(30, "ABC");
  
        // Displaying the HashMap 
        System.out.println("Initial Mappings are: " + hash_map); 
  
        // Getting the value of 25 
        System.out.println("The Value is: " + hash_map.get(25)); 
  
        // Getting the value of 10 
        System.out.println("The Value is: " + hash_map.get(10)); 
        
       Iterator<Integer> itr = hash_map.keySet().iterator(); 
//        Set keys = hash_map.keySet();
//        Iterator itr = keys.iterator();
        	while(itr.hasNext())
        	{
        		//String value=itr.next().toString();
        		
        		Integer key =itr.next();
        		String value=  (String) hash_map.get(key);
        		System.out.println(key+"="+value);
        		
        	}
//        	 for(Entry<Integer, String> etr : hash_map.entrySet()){
//             	//if(has.equals(etr.getValue()))
//             		System.out.println(etr.getKey());
        	
        	System.out.println("***********");
        	Map hm= new HashMap();
        	hm.put(1, "Test");
        	hm.put(2, 'L');
        	hm.put(3, 24);
        	Employee e1 = new Employee("Tom", 29);
           	hm.put(4, e1);
           
           	Iterator<Object> it= hm.keySet().iterator();
           	for(Object et:hm.entrySet())
           	{
           		System.out.println(et);
//           		System.out.println(et.hashCode());
           
           	System.out.println("*****************");
//           	for(Object o: it.hasNext())
//           	{
//           		
//           	}
	}

	}
}
