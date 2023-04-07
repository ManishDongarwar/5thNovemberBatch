package Exceptions;

public class Basic 

{
  static void test() 
  {
	 throw new NullPointerException(); 
  }

  static void Demo() 
  
  {
	  throw new ArithmeticException();
  }
  
  public static void main(String[] args) throws InterruptedException 
  {
	  int a = 20;
	  int b = 0;
	  int c = a/b;
	  System.out.println(c);
	  System.out.println("Main method is Running");
	  Demo();
	  test();
	  
	  Thread.sleep(2000);
  }
  
}