package package1;

public class classA 

{
   public int a = 50;
   
   private int b = 60;
   
   protected int c = 70;
   
   int d = 80;
   
   
   public static void main(String[]args) 
   
   
   {
	    classA x = new classA();
	    
	    System.out.println(x.a); // Calling variable with public access specifier
	    System.out.println(x.b); // Calling variable with private access specifier
        System.out.println(x.c); // Calling variable with protected access specifier
        System.out.println(x.d); // Calling variable with default access specifier

	    
	   
   }
	
}
