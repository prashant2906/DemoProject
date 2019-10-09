package smalltest;

public class firstchrtoLowercase {

	public static void main(String[] args) {
		String str = "Hi My Name is Prashant Goel";
		char[] charr=str.toCharArray();
		charr[0]=Character.toLowerCase(str.charAt(0));
		System.out.println(charr);

	}

}
