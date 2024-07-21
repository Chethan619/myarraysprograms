package arraysprograms;

import java.util.Arrays;
import java.util.Scanner;

public class Sendvaluefromscannerclass_Andperform_Storing_Students_rollnumberstogether 
{
    /* public static void main(String[] args) 
    {
		Scanner s1=new Scanner(System.in);
		int i1=s1.nextInt();
		int rollno[]=new int[5];
		rollno[0]=s1.nextInt();
		rollno[1]=s1.nextInt();
		rollno[2]=s1.nextInt();
		rollno[3]=s1.nextInt();
		rollno[4]=s1.nextInt();
		System.out.println(Arrays.toString(rollno));
	} */
    
	public static void main(String[] args) 
    {
		int rollno[]=new int[5];
		System.out.println("Please enter the five values");
		for(int i=0;i<=4;i++)
		{
		Scanner s1=new Scanner(System.in);
		rollno[i]=s1.nextInt();
		}
		System.out.println(Arrays.toString(rollno));
	}
}
