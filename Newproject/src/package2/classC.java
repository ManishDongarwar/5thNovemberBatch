package package2;

import package1.classA;

public class classC 

{
 public static void main(String[]args) 
 
 {
	 classA y = new classA();
	 
	 
	 System.out.println(y.a); // calling Variable with public access specifier 
	 //System.out.println(y.b); // Private no Access   [out of scope]
	 //System.out.println(y.c); // protected no access [out of scope]
	 //System.out.println(y.d); //  Default            [out of scope]

	 
 }
 
 
 
 
 
}
