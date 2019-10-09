package smalltest;

import java.util.List;

public class reversePreserveSpaces {

	public static void main(String[] args) {
	
		 String str = "hi welcome to Tutorialspoint";
		 StringBuffer sb= new StringBuffer(str);
		 sb.reverse();
		 for ( int i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)==' ')
			 {
				 sb.insert(i," ");
			 }
		 }
		 System.out.println(sb);
		 
		 String str1= "My name is Prashant";
		 String[] li = str1.split(" ");
		 for (int i=0; i<li.length;i++)
		 {
			 System.out.print(li[i]);
		 }
		 
	}

}
