package day2;

import java.util.Scanner;

public class Loan {
	static Scanner S=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your Name");
		String name=S.next();
		System.out.println("Enter your Salary(If ur not Employeed enter 0)");
		int salary=S.nextInt();
		System.out.println("Enter Your Cibil Score");
		int cibil=S.nextInt();
		
		if (salary >0) {
			if (salary >20000) {
				if (cibil>600) {
					System.out.println("\nCongratulation you are eligible for loan upto 20 laks \n");
					System.out.printf("%-13s %-13s %-13s%n","Name","Salary","Cibil Score");
					System.out.printf("%-13s %-13s %-13s",name,salary,cibil);
				} else {
					System.out.println("You are Not Eligible,Because your Cibil Score is lowwer than 600 ");
				}
			} else {
				System.out.println("You are Not Eligible,Because your Salary is below $20,000");
			}
		} else {
			System.out.println("You are Not Eligible,Because you don't have Salary");
		}
	}

}
