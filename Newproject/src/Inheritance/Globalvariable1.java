package Inheritance;

public class Globalvariable1 extends Globalvariable 
  {
    int a = 41;                       // Global Variable 
    
    public void Memo()               // non static method 
    
    {
    	int a = 36;                  // local Variable
    	System.out.println(a);
    	System.out.println(this.a);   //   calling Local variable from different class
    	System.out.println(super.a); // calling global variable from different class
    
    }
    
    public void Golf() 
    
    {
    	int a = 69;                   // local Variable
    	System.out.println(a);        // calling local Variable from same method
    	System.out.println(super.a); //  calling global variable from different class

    	
    }
    
    public static void main(String[]args) 
    {
        Globalvariable1 x =  new Globalvariable1(); // object Creation using constructor
        
    	x.Memo(); // method calling 
    	x.Golf(); // method calling 
    	
    }
    
	
  }
