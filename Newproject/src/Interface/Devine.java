package Interface;

public class Devine implements User 

{
    public void Memo()  // Complete or Implemented method 
    {
    	System.out.println("Memo Method is running");
    	
    	
    }
    
    
    
    public void Demo() // Complete or Implemented method 
    {
    	System.out.println("Demo Method is running");

    	
    }
    
    public static void main(String[]args) 
    
    {
    	 Devine x = new Devine();
    	 
    	 x.Memo();
    	 x.Demo();
    }
    
}
