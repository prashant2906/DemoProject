package smalltest;

import java.util.*;

public class ListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List li = new ArrayList();
		li.add("Test");
		li.add('L');
		li.add(24);
		Employee e1=new Employee("Prashant", 29);
		li.add(e1);
		
		for(Object o:li){
			System.out.println(o);
			
		}

	}

}
