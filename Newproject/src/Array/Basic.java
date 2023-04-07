package Array;

import java.util.Arrays;

public class Basic 
{

public static void main(String[]args)

{

   int a[] = { 20 , 10, 40, 30 , 75};


          a[0] = 20;
          a[1] = 10;
          a[2] = 40;
          a[3] = 30;
	  a[4] = 75;   //manager did changes

for (int i = 0; i <=4;i++)
{
  System.out.println(a[i]);
}
    System.out.println();
   Arrays.sort (a);

for (int i = 0; i <=4;i++)
{
	System.out.println(a[i]);
}
}


}
