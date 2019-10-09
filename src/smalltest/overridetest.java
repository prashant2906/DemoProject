package smalltest;

public class overridetest extends objectcheck{
	
	public static void main(String[] args) {
		objectcheck ob=new objectcheck();
		overridetest ob1= new overridetest();
		objectcheck ob2= new overridetest();
	
		ob.A();
		ob1.A();
		ob2.A();
		
	}

}
