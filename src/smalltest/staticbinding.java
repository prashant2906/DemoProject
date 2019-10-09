package smalltest;

 class superclass	 
	{ 
		 static void print() 
		{ 
			System.out.println("print in superclass."); 
		} 
	} 

	 class subclass extends superclass 
	{ 
		 static void print() 
		{ 
			System.out.println("print in subclass."); 
		} 
	}
	 public class staticbinding {
			public static void main(String[] args) 
			{ 
				superclass A = new superclass(); 
				superclass B = new subclass(); 
				A.print(); 
				B.print(); 
			} 
		}