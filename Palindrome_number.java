package day2;

import java.util.Scanner;

public class Palindrome_number {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the number to check whether its a palindrome or not");
		int num=sc.nextInt();
		int copy=num,rev=0,rem=0;
		while (num>0) {
			rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		System.out.println("The Reversed Number of "+copy+" is :"+rev);
		if (rev==copy) {
			System.out.printf("%n %5s %-1s",copy," is a Palindrome Number");
		} else {
			System.out.printf("%n %5s %-1s",copy," is not a Palindrome Number");
		}
	}

}
