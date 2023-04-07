package Inheritance;

public class child1 extends child 
{
 public void Cycle() 
  {
	 System.out.println("Cycle");
	 
  }
	 
   public static void main(String[]args) 
   {
	   child1 x = new child1();
	   x.Bike();
	   x.Car();
	   x.Home();
	   x.Money();
	   x.Cycle();
	   
   }
   
   
}
