package arraysprograms;

import java.util.Arrays;

public class how_tofindout_anagram_instring 
{
    public static void main(String[] args) 
    {
		String s1="elbow";
		String s2="below";
		if(s1.length()!=s2.length())
		{
			System.out.println("Its not a anagram");
		}
		else
		{System.out.println("Eligible to become anagram but need to see...");
		char c1[]=s1.toCharArray();
		char c2[]=s2.toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(Arrays.toString(c1));
		System.out.println(Arrays.toString(c2));
		boolean myfinalanswer=Arrays.equals(c1, c2);
		if(myfinalanswer==true)
		{
			System.out.println("hey the given 2 strings are anagram");
		}
		else
		{
			System.out.println("hey the given two strings are not anagram");
		}
		}
	}
}
