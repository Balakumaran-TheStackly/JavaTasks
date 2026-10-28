package day2;

import java.util.Scanner;

public class Tables {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("%nEnter which table you needed%n");
		int table=sc.nextInt();
		System.out.printf("%nEnter starting number%n");
		int start=sc.nextInt();
		System.out.printf("%nEnter the end number%n");
		int end=sc.nextInt();
		
		System.out.printf("%n %5s %-2s",table," Table\n");
		for (int i = start; i <= end; i++) {
			int res=i*table;
			System.out.printf("%n %-2s %-2s %-2s %-2s %-2s",i,"*",table,"=",res);
		}
	}

}
