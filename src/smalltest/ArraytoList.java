package smalltest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraytoList {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Iterator itr;
		String[] arr= {"b","a"};

		String[] ar=new String[5];

		//arr[0]="Test";
		//arr[1]="Test1";
		for (String s:arr)
		System.out.println(s+"********");
		List<String> li = new ArrayList<String>();
		li=Arrays.asList(arr);
		itr=li.iterator();
		while(itr.hasNext())
		System.out.println(itr.next().toString());
		ar= (String[]) li.toArray();
		System.out.println("********");
		for (String str:ar)
		System.out.println(str);
//		Collections.sort(li);
//		System.out.println(li);
		
	}

}
