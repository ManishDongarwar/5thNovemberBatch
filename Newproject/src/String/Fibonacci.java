package String;

public class Fibonacci 

{
 public static void main(String[] args) 
  {
	 int a = 3;
	 int b = 5;
	 
	 int total = 10;
	 
	 int c;
	 
	 System.out.print(a +" "+ b);
	 
	 for (int i = 2;i<total;i++)
	 {
	     c = a + b ; // 0 + 1 = 1
	 
	 System.out.print(" "+ c);
	 
	 a = b; //1
	 b = c; //1
	 
	 }
	
  }


}
