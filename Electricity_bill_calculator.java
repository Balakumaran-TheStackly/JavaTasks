package day2;

import java.util.Scanner;

public class Electricity_bill_calculator {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("%n----------Electricity Bill Calculator for months---------- %n");
		System.out.println("Enter Number of months");
		int months=sc.nextInt();
		double totalAmount=0;
		for (int i = 1; i <= months; i++) {
			System.out.println("Enter "+i+" month bill amount");
			double bill=sc.nextDouble();
			totalAmount+=bill;
		}
		System.out.printf("%n %-10s %-10s %n","Months","Total Bill");
		System.out.printf("%n %-10s %-10s %n",months,totalAmount);
	}
}
