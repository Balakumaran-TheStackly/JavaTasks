package day2;

import java.util.Scanner;

public class Number_Pattern {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Size of Pattern");
		int size=sc.nextInt();
		
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i>=j) {
					System.out.print(i +" ");
				}
				
			}
			System.out.println();
		}
	}
}
