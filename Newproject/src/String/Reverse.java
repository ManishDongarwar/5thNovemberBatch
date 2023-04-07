package String;


public class Reverse 
{
  public static void main(String[] args) 
  {
	
   String a = "Testing";
   
   String reverse = "";
   
   for (int i = a.length()-1;i>=0;i--) 
   {
	reverse = reverse + a.charAt(i);
   }
  
   System.out.println(reverse);
  
  }
  
}
 