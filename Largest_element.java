package day2;

import java.util.Scanner;

public class Largest_element {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number of elements");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the "+(i+1)+" Element");
			a[i]=sc.nextInt();
		}
		
		int largest=a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (largest<a[i]) {
				largest=a[i];
			}
		}
		System.out.printf("%n%-10s %-10d","Largest Elements is ",largest);
	}

}
