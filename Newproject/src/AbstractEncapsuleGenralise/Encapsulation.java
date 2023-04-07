package AbstractEncapsuleGenralise;

public class Encapsulation 

{
   private int a = 50;  // Declared  data members(Variables) as Private
   
   private int b = 20;
   
   
   Encapsulation()
   {
	   a = 80;
	   
	   b= 65;
	   
	   int d = 75;
   }
   
   Encapsulation(int c , int d)
   {
	    
	   a = c;
	   b = d;
   }   
	   
  public void Demo() 
	   {
		   int c = a+b;
		   System.out.println(c);
	   }
   
  public static void main(String[] args) 
       {
	       Encapsulation x = new Encapsulation();
	       x.Demo();
	       
	       
       }
  
   }

