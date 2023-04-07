package package1;

public class classB 

{
    public static void main(String[]args) 
    
    {
    	classA z = new classA();
    	
    	System.out.println(z.a);//Calling variable with public access specifier
    	//System.out.println(z.b); cannot be called in other class as the the specifier is Private 
    	System.out.println(z.c);//Calling variable with protected access specifier
        System.out.println(z.d);//Calling variable with Default access specifier


    	
    	
    	
    	
    }
    
}
