package day2;

import java.util.Scanner;

public class Star_pattern {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Pattern size");
		int size=sc.nextInt();
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				if (i<=j) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
	}
}
