package smalltest;

class A
{ 
	public A(){
		//System.out.println("construct A");
		//run();
	}
	protected void run()
	{
		System.out.println("you are in A");
	}

}
class B extends A
{
	public B(){
		//System.out.println("construct B");
	}
	protected void run()
		{
		    super.run(); 
			System.out.println("you are in B");
		}
}

class C extends B
{
	public C(){
		//System.out.println("construct C");
	}
	public static void main(String[] args){  
			//A a=new A();
			A b=new B();
			C c=new C();
			B bb = new C();

			//a.run();
			b.run();
			//c.run();
			//bb.run();
}
}