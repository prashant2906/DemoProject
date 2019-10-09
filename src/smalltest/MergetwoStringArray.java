package smalltest;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergetwoStringArray {
	
	public static void main(String args[]){
		
		// Sort two strings
		
		String s1 = "aceg";
		String s2 = "bdfh";
		s1+=s2;
		System.out.println(s1);
		char[] arr= s1.toCharArray();
		Arrays.sort(arr);
		String s3= new String(arr);
		System.out.println(s3);
		
		//Sort a STring array
		String[] strarr = {"Zebra","Ankit","Bob"};	
		
		for ( int i =0;i<strarr.length;i++)
		{
			for ( int j=1;j<strarr.length;j++)
			{
				if (strarr[j-1].compareTo(strarr[j])>0)
					{
						String temp = strarr[j-1];
						strarr[j-1]=strarr[j];
						strarr[j]=temp;
					}
			}
		}
		for (int i = 0; i< strarr.length; i++) { 
            System.out.println(strarr[i] + " "); 
        }
		
		// Add two string array
		String[] strarr1 = {"Zebra","Ankit","Bob"};
		String[] strarr2 = {"Cat","Linda","Dog"};
		int m = strarr1.length;
		int n = strarr2.length;
		
		String[] strarr3= new String[m+n];
		
		
		
	}

}
