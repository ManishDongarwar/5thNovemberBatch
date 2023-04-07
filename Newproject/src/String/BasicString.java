package String;

public class BasicString 
{
  public static void main(String[] args) 
  {
	String a = "Velocity";
	
	String b = "Velocity";
	
	String c = new String("Velocity");
	
	String d = new String("Velocity");
	
	System.out.println(a==b);
	
	System.out.println(c==d);
	
	System.out.println(a==c);
	
	System.out.println("######################");

    b = "Testing";

	System.out.println(a);
	System.out.println(b);
	System.out.println(a==b);

	System.out.println("######################");

    b = "Velocity";
    
    System.out.println(a);
	System.out.println(b);
	System.out.println(a==b);
  }
}
