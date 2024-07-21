package arraysprograms;

import java.util.Arrays;

public class Copyvalueofonearray_toanotherarray 
{
    /* public static void main(String[] args) 
    {
		int rollno[]= new int[5];
		rollno[0]=9;
		rollno[1]=10;
		rollno[2]=11;
		rollno[3]=12;
		rollno[4]=13;
		int rollno_copied[]=new int[rollno.length];
				for(int i=0;i<rollno.length;i++)
				{
					rollno_copied[i]=rollno[i];
				}
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno_copied));
		System.out.println(Arrays.equals(rollno, rollno_copied));
	} */
	
	public static void main(String[] args) 
    {
		int rollno[]= new int[5];
		rollno[0]=9;
		rollno[1]=10;
		rollno[2]=11;
		rollno[3]=12;
		rollno[4]=13;
		int rollno_copied[]=new int[rollno.length];
		rollno_copied[0]=9;
		rollno_copied[1]=11;
		rollno_copied[2]=11;
		rollno_copied[3]=12;
		rollno_copied[4]=13;	
		System.out.println(Arrays.toString(rollno));
		System.out.println(Arrays.toString(rollno_copied));
		System.out.println(Arrays.equals(rollno, rollno_copied));
	}
}
