package day2;

import java.util.Scanner;

public class Number_guessing {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("%n--------Number Guessing Game--------%n");
		int attempts=3;
		
		int randomNum = (int)(Math.random() * 10) + 1;
//		System.out.println(randomNum);
		do {
			System.out.printf("%n %3s %2s %3s","-----You have only ",attempts,"attempts left----------");
			System.out.printf("%n %3s %n","------------Guess the Number----------");
			int guess=sc.nextInt();
			if (guess==randomNum) {
				System.out.printf("%n %2s %n","Congratulation You have guessed Correctly!!!!!!!!!!!!");
				break;
			} else {
				System.out.printf("%n %-3s %n","Wrong guessing Try Again");
				if (guess>randomNum) {
					System.out.println("Number is small");
				} else {
					System.out.println("Number is greater");
				}
			}
			
			attempts--;
		} while (attempts>0);
		if (attempts==0) {
			System.out.printf("%n %-3s %n","Sorry you lost the Game");
		}
	}
}
