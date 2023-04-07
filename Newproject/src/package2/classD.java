package package2;

import package1.classA;

public class classD extends classA // Using Inheritance

{
	public static void main(String[]args) {
	
     classD x = new classD();
     
     System.out.println(x.a); // calling Variable with public access specifier
     System.out.println(x.c); // calling Variable with private access specifier

	}
	
}
