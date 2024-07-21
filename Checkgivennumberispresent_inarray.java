package arraysprograms;

public class Checkgivennumberispresent_inarray 
{
	static int no_to_check=15;
    public static void main(String[] args) 
    {
		int no[]= {11, 13, 15, 17, 19};
		for(int i=0;i<no.length;i++)
		{
			if(no_to_check==no[i])
			{
				System.out.println("15 is present in the given array and the index is-> " +i);
			}
		}
	}
}
