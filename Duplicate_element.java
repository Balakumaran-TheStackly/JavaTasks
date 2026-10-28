package day2;

import java.util.Scanner;

public class Duplicate_element {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int [] a= {2,3,7,4,2,7,9,3};
		
		int count;
		for (int i = 0; i < a.length; i++) {
			count=1;
			for (int j = i+1; j < a.length; j++) {
				if (a[i]==a[j]&&a[j]!=-1) {
					count++;
					a[j]=-1;
				}
			}
			if (a[i]!=-1&& count>1) {
				System.out.println("Dupilicate Element is :"+a[i]);
			}
		}
	}

}
