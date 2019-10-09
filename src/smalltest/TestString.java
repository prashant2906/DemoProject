package smalltest;

public class TestString {
	
	public static void main(String args[]){
	String str1=new String("Prashant");
	String str2=new String("Prashant");
	
	String s1="Goel";
	String s2="Goel";
	String s3=new String("Goel");
	
	String s5 = "297";
	String s4 = new Integer(297).toString().intern();
	
	if(s4==s5)
	{
		System.out.println("asd");
		
	}
	if(s4.equals(s5))
	{
		System.out.println("asdadsa");
	}
	if(str1==str2)
	{
		System.out.println("Compared");
	}

	if(str1.equals(str2))
	{
		System.out.println("Compared1");
	}
	
	if(s1==s2)
	{
		System.out.println("Compared2");
	}

	if(s1.equals(s2))
	{
		System.out.println("Compared3");
	}
	if(s3==s2)
	{
		System.out.println("compared 4 ");
	}
	if (s3.equals(s2))
	{
		System.out.println("Compared 5");
	}
}
}
