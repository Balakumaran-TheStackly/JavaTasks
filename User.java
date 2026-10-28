package day2;

import java.util.Scanner;

public class User {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter User Name");
		String userName=s.next();
		System.out.println("Enter your Password");
		String password=s.next();
		System.out.println("Enter your Phone Number");
		String phoneNumber= s.next();
		
		if (userName.equalsIgnoreCase("Bala")) {
			if (password.matches(".*[a-z].*") && password.matches(".*[A-Z].*") && password.matches(".*[^a-zA-Z0-9].*") && password.matches(".*[0-9].*")) {
				if (phoneNumber.matches("[6-9][0-9]{9}")) {
					System.out.println("Your Creadentials are Valid \n");
					System.out.println("------------------User Details-------------------");
					System.out.printf("%-13s %-13s %-13s%n","User Name","Password","Phone Number");
					System.out.printf("%-13s %-13s %-13s%n",userName,password,phoneNumber);
				} else {
					System.out.println("Your Mobile Number not Valid, Must be 10 digits");
				}
			} else {
				System.out.println("Your Password is not valid,It should contain One Upper case, one lower case Letter and one special character");
			}
		} else {
			System.out.println("Your user name is not valid");
		}
	}

}
