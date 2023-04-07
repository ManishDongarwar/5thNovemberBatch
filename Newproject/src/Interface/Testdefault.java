package Interface;

public class Testdefault implements Default

{
    public void show() 
    {
    	System.out.println("Show Method is Running");
    }
      
    public void Mart() 
    {
    	System.out.println(" All Shops");
    }
    
    public static void main(String[] args) 
    
    {
		 Testdefault y = new Testdefault();
		 y.Mart();
	}
    
    
}
