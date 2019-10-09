package smalltest;

public class Regexexpression {

	public static void main(String[] args) {
		
		String s1="Prashant12Goel34@$!";
		String s2=s1.replaceAll("[^0-9]", "");
		System.out.println(s2);
	}
}
