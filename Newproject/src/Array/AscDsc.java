package Array;

import java.util.Arrays;

public class AscDsc 

{
  public static void main(String[] args) 
  
  {
	 int a[] =  {14,59,45,92,63,61}; // Declaration of Array
	 
	 System.out.println("@@@@@ info in Array@@@@@");
	  for(int i = 0; i <=a.length-1;i++) 
	  {
		  System.out.println(a[i]);
	  }
	  
	  Arrays.sort(a);
		 System.out.println("@@@@@Ascending info in Array@@@@@");
		 for(int i = 0; i <=a.length-1;i++) 
		  {
			  System.out.println(a[i]);
		  }
		 
		 System.out.println("@@@@@ Descending info in Array@@@@@");
		 for(int i = a.length-1; i>=0;i--) 
		  {
			  System.out.println(a[i]);
		  }
	  
  }
  
}
