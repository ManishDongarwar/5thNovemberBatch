package Casting;

public class Testupcasting 
{
   public static void main(String[] args) 
   
   {
	
	   System.out.println("@@@@@ Methods of Superclass @@@@@");
	     Upcasting.StaticCast();
  
	   Upcasting x = new Upcasting();
	     x.demo();
	     x.set();
	     
		   System.out.println("@@@@@ Methods of Subclass @@@@@");
		     Upcasting.StaticCast();

         Upcast1 y = new Upcast1();
         y.demo();
         y.subclass();
         y.set();
         
		   System.out.println("@@@@@ Casting Methods @@@@@");
		     Upcasting.StaticCast();

		   Upcasting z = new Upcast1();
		    //(Super class Ref variable = new Sub class)
		   
		   z.set();
		   z.demo();
		   
		   Upcast1 p = (Upcast1) new Upcasting();
		   
		   p.demo();
		   p.set();
		   p.StaticCast();
		   p.subclass();
   
         
         
	     
	   
	   
   }
}
