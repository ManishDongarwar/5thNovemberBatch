package Array;

public class SwappingArray 

{
   public static void main(String[] args) 
   {
	   int a[]= {10,20,30,40,50,60};
	   System.out.println("@@@@@Before Swapping@@@@@");
	    
	   for(int i = 0;i<=a.length-1;i++) 
	   {
		   System.out.println(a[i]);
		   
	   }
	    
	   System.out.println("@@@@@After Swapping@@@@@");
       
	   for(int i = 0;i<a.length/2;i++) 
	   {
		   int c;
		   c = a[i];
		   a[i]= a[(a.length-1)-i];
		   a[(a.length-1)-i] = c;
	   }
	   System.out.println();
	    
	   for(int i = 0;i<=a.length-1;i++) 
	   {
		   System.out.println(a[i]);
		   
	   }

	   
	   
   }
   
}
