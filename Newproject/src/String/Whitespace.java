package String;

public class Whitespace 
{
 public static void main(String[] args)
 {
	String z = "ASCBN MJKFCD JDFSES GHE FBDFTN";
	
	int total = 0;
	 for(int i = 0; i<=z.length()-1;i++) 
	 {
		 char y = z.charAt(i);
		 //System.out.println(y);
		 
		 if(y ==' ') 
		 {
			 total++;
		 }
	 }
	 System.out.println(total);

 }
 
}
