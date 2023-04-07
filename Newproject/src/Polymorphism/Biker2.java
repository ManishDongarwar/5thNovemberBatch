package Polymorphism;

public class Biker2 extends Biker
{
  public void margin() 
  {
	  
	  System.out.println("Margin method is running with Implementations");
	  
	  
  }
  
  public static void main(String[]args) 
  {
	 
	  Biker2 x = new Biker2();
	  x.margin();
	  
	  Biker y = new Biker();
	  y.margin();
  }
  
}
