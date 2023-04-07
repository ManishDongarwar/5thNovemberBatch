package Casting;

public class Implicit 

{
    public static void main(String[] args) 
    {
		byte a = 50;
		System.out.println(a);  //memory Size is 1 BYTE
		
		
		int b = a;
		System.out.println(b);  //memory Size is 4 BYTE

		double c = b;
		System.out.println(c);  //memory Size is 8 BYTE
    	
    	
	}
    
}
