package day2;

import java.util.Scanner;

public class Prime_number {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number to check if it is a prime Number or not");
		int num=sc.nextInt();
		
		int count=0;
		
		for (int i = 1; i <= num; i++) {
			if (num%i==0) {
				count++;
			}
		}
		if (count==2) {
			System.out.printf("%n %5s %-1s",num," is a Prime Number");
		} else {
			System.out.printf("%n %5s %-1s",num," is not a Prime Number");
		}
	}

}
