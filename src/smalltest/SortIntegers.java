package smalltest;

public class SortIntegers {

	public static void main(String[] args) {
		int[] i={5,3,6,1,8,2};
		
		for (int a=0;a<i.length;a++)
		{
			for (int b=1;b<i.length;b++)
			{
				if(i[b-1]>i[b])
				{
					int t = i[b-1];
					i[b-1]= i[b];
					i[b]= t;
				}
			}
		}
		for (int j=0;j<i.length;j++)
		{
			System.out.println(i[j]);
		}

	}

}
