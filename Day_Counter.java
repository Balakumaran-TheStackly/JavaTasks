package day2;

import java.util.Scanner;

public class Day_Counter {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the month to calculate (Ex.March)");
		String month=sc.next();
		
		int days=0;
		switch (month) {
		case "Januvary","March","May","July","August","October","December":
			days=31;
			System.out.printf("-----------Month days Calculator--------------");
			System.out.printf("%n%-15s %-15s%n","Month","No of Days");
			System.out.printf("%n%-15s %-15s",month,days);
			break;
		case "February":
			System.out.println("If Month is feburary, Enter year(Ex: 2000)");
			int year=sc.nextInt();
			if (year%4==0) {
				if (year%100==0) {
					if (year%400==0) {
						days=29;
						System.out.printf("-----------Month days Calculator--------------");
						System.out.printf("%n%-15s %-15s%n","Month","No of Days");
						System.out.printf("%n%-15s %-15s",month,days);
					} else {
						days=28;
						System.out.printf("-----------Month days Calculator--------------");
						System.out.printf("%n%-15s %-15s%n","Month","No of Days");
						System.out.printf("%n%-15s %-15s",month,days);
					}
				} else {
					days=29;
					System.out.printf("-----------Month days Calculator--------------");
					System.out.printf("%n%-15s %-15s%n","Month","No of Days");
					System.out.printf("%n%-15s %-15s",month,days);
				}
				
			} else {
				days=28;
				System.out.printf("-----------Month days Calculator--------------");
				System.out.printf("%n%-15s %-15s%n","Month","No of Days");
				System.out.printf("%n%-15s %-15s",month,days);
			}
			break;
		case "April","June","September","November":
			days=30;
			System.out.printf("-----------Month days Calculator--------------");
			System.out.printf("%n%-15s %-15s%n","Month","No of Days");
			System.out.printf("%n%-15s %-15s",month,days);
			break;
		default:
			System.out.println("Enter Corect Spell of Month");
			break;
		}
	}
}
