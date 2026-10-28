package day2;

import java.util.Scanner;

public class Calculator {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Calculator");
		System.out.println("1. Additon \n2. Subtraction \n3. Multipilication \n4. Division \n5. Modulas");
		System.out.println("Enter the action");
		int action=sc.nextInt();
		
		System.out.println("Enter the First Number");
		double first=sc.nextDouble();
		System.out.println("Enter the Second Number");
		double second=sc.nextDouble();
		double res=0;
		switch (action) {
		case 1:
			System.out.printf("%n-----------------Addition------------------%n");
			res=first+second;
			System.out.printf("%n%-15s %-15s %-15s %-15s%n","First Number","Action","Second Number","Result");
			System.out.printf("%-15s %-15s %-15s %-15s",first,"+",second,res);
			break;
		case 2:
			res=0;
			System.out.printf("%n-----------------Subtraction------------------%n");
			res=first-second;
			System.out.printf("%n%-15s %-15s %-15s %-15s%n","First Number","Action","Second Number","Result");
			System.out.printf("%-15s %-15s %-15s %-15s",first,"-",second,res);
			break;
		case 3:
			res=1;
			System.out.printf("%n-----------------Multipilication-------------------%n");
			res=first*second;
			System.out.printf("%n%-15s %-15s %-15s %-15s%n","First Number","Action","Second Number","Result");
			System.out.printf("%-15s %-15s %-15s %-15s",first,"*",second,res);
			break;
		case 4:
			res=1;
			System.out.printf("%n---------------------Division------------------------%n");
			res=first/second;
			System.out.printf("%n%-15s %-15s %-15s %-15s%n","First Number","Action","Second Number","Result");
			System.out.printf("%-15s %-15s %-15s %-15s",first,"/",second,res);
			break;
		case 5:
			res=1;
			System.out.printf("%n---------------------Modulas------------------------%n");
			res=first%second;
			System.out.printf("%n%-15s %-15s %-15s %-15s%n","First Number","Action","Second Number","Result");
			System.out.printf("%-15s %-15s %-15s %-15s",first,"%",second,res);
			break;

		default:
			System.out.println("Enter correct Action");
			break;
		}
	}
}
