package arraysprograms;

import java.util.Arrays;

public class How_tofindout_digits_letters_specialcharacters_instring 
{
	static int count_of_digit=0;
	static int count_of_letter=0;
	static int count_of_space=0;
    public static void main(String[] args) 
    {
		String s1="my name is 98765 &^%!@(";
		int i1=s1.length();
		System.out.println("The length of the given string is-> " +i1);
		char c1[]=s1.toCharArray();
		System.out.println(Arrays.toString(c1));
		for(int i=0;i<s1.length();i++)
		{
			boolean b1=Character.isDigit(c1[i]);
			if(b1==true)
			{
				count_of_digit++;
			}
			boolean b2=Character.isLetter(c1[i]);
			if(b2==true)
			{
				count_of_letter++;
			}
			boolean b3=Character.isSpaceChar(c1[i]);
			if(b3==true)
			{
				count_of_space++;
			}
		}
		System.out.println("The number of digits in the given string are-> " +count_of_digit++);
		System.out.println("The number of letters in the given string are-> " +count_of_letter++);
		System.out.println("The number of spaces in the given string are-> " +count_of_space++);
		int special_characters = s1.length() - (count_of_digit++ + count_of_letter++ + count_of_space++);
		System.out.println("The number of special characters in the given string are-> " +special_characters);
		
	}
	}
