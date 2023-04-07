package Inheritance;

public class This                       // This keyword

{
 
	int a = 75;                         // Global Variable        
	
	public void Test()                  // Non Static method
	{
       int a = 50;                      //Non Static method
       System.out.println(a);           // Local Variable 58
       System.out.println(this.a);      // Global Variable 75

		
	}
	
	public void basic()                // Non Static method
	
	{
		 int a = 80;                   // Local Variable
		 System.out.println(a);        // Local Variable  80
		 System.out.println(this.a);   // Global Variable 75
	
	}
	
	public static void main(String[]args) // Main Method for calling 
	
	{
		This x = new This();             // Object Creation using constructor 
		x.Test();                        //calling Test method
		x.basic();                       // calling basic method
		
		
	}
	 
}
