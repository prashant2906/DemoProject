package smalltest;

public class Thisfuction {

	public static void main(String[] args) {
			
		Thisfuction tf = new Thisfuction();
		tf.funct1();
	}

	public void funct1() {
		
		this.startupfunct();
	}

	public void startupfunct() {
		System.out.println("Hello");
		
	}

}
