package arraysprograms;

import java.util.Arrays;

public class Array_Reverse_andstoreinanotherarray 
{
	static int k=0;
    public static void main(String[] args) 
    {
		int rollno[]= {11,12,13,14,15};
		int rollno_reverse[]=new int[rollno.length];
		for(int i=rollno.length-1;i>=0;i--)
		{
			rollno_reverse[k]=rollno[i];
			k++;
		}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno_reverse));
	}
}
