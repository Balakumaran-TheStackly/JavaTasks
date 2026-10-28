package day2;

public class Task_1_operators {
	public static void main(String[] args) {
		int a=20;
		int b=10;
		int e=3;
		//Type Cast Operator narrowing
		short c=(short)b;
		//widening
		double d=b;
		
		//Arithmatic Operator
		System.out.println("Addition :"+ (a+b));
		System.out.println("Substarction :"+(a-b));
		System.out.println("Division :"+(a/b));
		System.out.println("Multipilication :"+(a*b));
		System.out.println("Modulos :"+(a%e));
		
		//Relational Operator
		System.out.println(a==b);
		System.out.println(a>b);
		System.out.println(a<b);
		System.out.println(a>=b);
		System.out.println(a<=b);
		System.out.println(a!=b);
		
		//Logical Operator
		System.out.println(a>b && a>c); //And 
		System.out.println(a==b || a>=b); //OR
		
		//Conditional Operator
		int res =(a>b)?a:b;
		System.out.println("Largest Number :"+res);
		
		//Increment and Decrement Operator
		int x=a++;  //21
		int x1=++a;  //22
		int y=a--;  //21
		int y1=--a; //20
		
		System.out.println("PreIncrement :"+ x);
		System.out.println("PostIncrement :"+ x1);
		
		System.out.println("PreDecrement :"+ y);
		System.out.println("Postcrement :"+ y1);
		
		//Compound Assignment Operator
		e*=3; //Update Existing values
		System.out.println("Compound Assignment Operator :"+e);
		
	}
}
