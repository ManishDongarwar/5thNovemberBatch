package Polymorphism;

public class Overloading1 

{
    public static void addition(int a , int b) 
    {
    	System.out.println(a+b);
    }
    
    
    public static void addition(int z, int y, int x) 
    {
    	System.out.println(z+y+x);
    }
    
    
    public static void main(String[]args) 
    
    {
    	Overloading1.addition(37, 49);
    	Overloading1.addition(36, 52, 12);
    	
    }
}
