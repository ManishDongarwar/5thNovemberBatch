package String;

public class Armstrong 

{
  public static void main(String[] args) 
  
  {
	int orignal = 153;
	 int add = 0;
	 for(int i = orignal;i > 0;i = i/10) 
	 {
		 int remainder = i%10;
		 
		 add = add + (remainder*remainder*remainder);
		 
		 //System.out.println(add);
	 }
	 
	 if (orignal==add) 
	 {
		 System.out.println("Given no. is Armstrong");
	 }
	 else
	 {
		 System.out.println("Given no. is not Armstrong");

	 }
  }
}
