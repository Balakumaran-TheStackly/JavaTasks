package day2;

import java.util.Scanner;

public class Odd_Even_Elements {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter size of elements");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the "+(i+1)+" Element");
			a[i]=sc.nextInt();
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2!=0) {
				System.out.println("Odd Elements : "+"a["+i+"] = "+a[i]);
			} 
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i]%2==0) {
				System.out.println("Even Elements : "+"a["+i+"] = "+a[i]);
			} 
		}
		
	}

}
