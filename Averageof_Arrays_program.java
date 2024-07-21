package arraysprograms;

public class Averageof_Arrays_program 
{
	static int sum=0;
	static double average=0;
     public static void main(String[] args) 
    {
		int no[]=new int[5];
		no[0]=9;
		no[1]=10;
		no[2]=11;
		no[3]=12;
		no[4]=13;
		for(int i=0;i<no.length;i++)
		{
			sum=sum+no[i];
		}
		System.out.println("The addition of 5 numbers in array-> "+sum);
		average = sum/no.length;
		System.out.println("The average value is-> "+average);
	}
}
