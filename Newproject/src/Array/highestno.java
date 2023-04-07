package Array;

public class highestno 

{
	public static void main(String[]args)
	{

	int max = 0;

	int a[] = { 15,20,45,78,21};

	for (int i = 0; i<a.length;i++)

	if (a[i]>max)
	    {

	     max = a[i];

	    }


	System.out.println("the Largest no. is : " + max);


	}
}
