package Exceptions;

public class Trycatch1 

{
  public static void main(String[] args) 
 
  {
	int a = 20;
	int b = 0;
	int c = 0;
	
	
	try 
	{
		System.out.println("Risky code");
		
		c = a/b;
	}
	
	catch (ArithmeticException e)
	{
		b = 2;
		c = a/b;
		System.out.println("Alternative code");
	}
	
	    System.out.println(c);
  } 
  
  
}
