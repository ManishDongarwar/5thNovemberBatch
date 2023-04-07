package Interface;

public interface Default  

{
    public default void Mart() 
    {
    	System.out.println("Shops"); // Default method of interface
    	
    	                             // default is a keyword not Access specifier
    	
    }                                // Mart method is by default Public
    
    public static void XYZ() 
    {
    	
    	System.out.println("Static method of interface is running");//Static method if interface
    }
     
    public void show();     // incomplete method of interface
} 
