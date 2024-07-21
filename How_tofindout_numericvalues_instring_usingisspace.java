package arraysprograms;

import java.util.Arrays;

public class How_tofindout_numericvalues_instring_usingisspace 
{
	public static void main(String[] args) 
    {
		String s1="50cent is correct";
		char c1[]=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
			boolean b1=Character.isSpaceChar(c1[i]);
			System.out.println(b1);
		}
	}
}
