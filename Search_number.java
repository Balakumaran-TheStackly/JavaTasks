package day2;

import java.util.Scanner;

public class Search_number {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int[] a= {4,2,8,6,5,3};
		System.out.println("Enter the Element to search its Index");
		int value=sc.nextInt();
		int index=0;
		for (int i = 0; i < a.length; i++) {
			if (a[i]==value) {
				index=i;
				break;
			}
		}
		System.out.println("Index for the Element is : "+index);
	}

}
