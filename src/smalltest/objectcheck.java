package smalltest;

public class objectcheck {
	public String str1=null;
	public String str2=null;
	public String str3=null;
	public void A()
	{
		str1="This is a good product";
		str2="DEF";
		str1+=str2;
		System.out.println(str1);	
		int t=str1.indexOf("goood");
			System.out.println(t);
			if(t==-1){
				System.out.println("Test Failed");
			}
	}
	public static void main(String args[])
	{
		objectcheck ob=new objectcheck();
		ob.A();
		
	}
}
