package Interface;

public class Newimplements implements Staticinterface 

{
  public void show()
  
  {
	  System.out.println(" Show Method is Running");
  }
  
  
  public static void main(String[] args) 
  {
	 Newimplements x = new Newimplements();
	 x.show();
	 
	 
	  Staticinterface.XYZ();
  }
  
}
