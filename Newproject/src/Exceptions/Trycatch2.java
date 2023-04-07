package Exceptions;

public class Trycatch2 

{
   public static void main(String[] args) 
   
   {
	   int a = 20;
	   int b = 0;
	   int c = 0;
	   int d[] = {10,25,30,15,21,67};
	   System.out.println("Before Try Block Code Started");
	   
	   try 
	   {
		   System.out.println("Try Block Risky code is Running");
		   c = a/b;
		   System.out.println(d[6]); // Event Genraterd
	   }
	   
	   catch(ArithmeticException e)
	   {
		   System.out.println("Altenative code of Arithmatic is Running");
		   b = 5;
		   c =a/b;
	   }
	   
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println("Altenative code of Index is Running"); 
		   System.out.println(d[3]);
	   }
	   
	   System.out.println(c);    // normal flow
   }
}
