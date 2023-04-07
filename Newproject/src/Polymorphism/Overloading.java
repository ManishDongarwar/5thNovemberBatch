package Polymorphism;

public class Overloading 

{
   public void addition(int a , int b) 
   {
	 System.out.println(a+b);
	   
   }
   
   public void addition(int a , int b, int c) 
   
   {
	   System.out.println(a+b+c);
	   
   }
   
   public static void main(String[]args) 
   
   {
	   Overloading x = new Overloading();
	   x.addition(10,20);
		 System.out.println();
       x.addition(30,40,50);
	   
   }
   
}
