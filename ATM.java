package day2;

import java.util.Scanner;

public class ATM {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		int id=1004;
		String pswd="Bala@1";
		
		System.out.println("Enter user ID");
		int userid=sc.nextInt();
		System.out.println("Enter password");
		String password=sc.next();
		if (userid == id && password.equals(pswd)) {
			System.out.println("Welcome to Mariyyamman Bank");
			String name="Bala";
			double balance=25000;
			long accno=1236547890l;
			String ifsc="MRM00123";
			System.out.println("Select a Option");
			System.out.println("1.Deposit \n2.Withdrawn \n3.Account Details \n4.View Balance \n5.Change User ID/Password");
			int option=sc.nextInt();
			
			switch (option) {
			case 1:
				System.out.printf("%n------------Deposit-------------%n");
				System.out.printf("%nEnter the Deposit Amount%n");
				double dep=sc.nextDouble();
				if (dep>0) {
					balance+=dep;
					System.out.printf("%nAmount Deposited Successfully%n");
					System.out.printf("%n%-15s %-15s %-18s %-15s %-15s %-15s%n","User ID","Name","Account Number","IFSC Code","Deposit","Current Balance");
					System.out.printf("%-15s %-15s %-18s %-15s %-15s %-15s",id,name,accno,ifsc,dep,balance);
				} else {
					System.out.printf("%nInvalid Deposit Amount%n");
				}
				break;
			case 2:
				System.out.printf("%n------------Withdrawn-------------%n");
				System.out.printf("%nEnter the Withdrawn Amount%n");
				double with=sc.nextDouble();
				if (with>0 && with<=balance ) {
					balance-=with;
					System.out.printf("%nAmount Withdrawn Successfully%n");
					System.out.printf("%n%-15s %-15s %-18s %-15s %-15s %-15s%n","User ID","Name","Account Number","IFSC Code","Withdrawn","Current Balance");
					System.out.printf("%-15s %-15s %-18s %-15s %-15s %-15s",id,name,accno,ifsc,with,balance);
				} else if (with>balance) {
					System.out.printf("%nWithdrawn amount is higher than Balance%n");
					System.out.printf("%n%-15s %-15s %-18s %-15s %-15s%n","User ID","Name","Account Number","IFSC Code","Current Balance");
					System.out.printf("%-15s %-15s %-18s %-15s %-15s",id,name,accno,ifsc,balance);
				} else {
					System.out.printf("%nInvalid Withdrawn Amount%n");
				}
				break;			
			case 3:
				System.out.printf("%n------------Account Details-------------%n");
				System.out.printf("%n%-15s %-15s %-18s %-15s %-15s%n","User ID","Name","Account Number","IFSC Code","Current Balance");
				System.out.printf("%-15s %-15s %-18s %-15s %-15s",id,name,accno,ifsc,balance);
				break;
			case 4:
				System.out.printf("%n------------Balance Details-------------%n");
				System.out.printf("%n%-15s %-15s %-15s%n","User ID","Name","Current Balance");
				System.out.printf("%-15s %-15s %-15s",id,name,balance);
				break;
			case 5:
				System.out.printf("%nEnter a option to Change \n1.User ID \n2.Password%n");
				int op=sc.nextInt();
				if (op==1) {
					System.out.printf("%nEnter new User ID%n");
					int newid=sc.nextInt();
					id=newid;
					System.out.printf("%nUser Id Changed successfully%n");
					System.out.printf("%n%-15s %-15s %-18s %-15s %-15s%n","User ID","Name","Account Number","IFSC Code","Current Balance");
					System.out.printf("%-15s %-15s %-18s %-15s %-15s",id,name,accno,ifsc,balance);
				} else if (op==2) {
					System.out.printf("%nEnter new Password%n");
					String newpswd=sc.next();
					pswd=newpswd;
					System.out.printf("%nPassword Changed successfully%n");
					System.out.printf("%n%-15s %-15s %-15s %-18s %-15s %-15s%n","User ID","Password","Name","Account Number","IFSC Code","Current Balance");
					System.out.printf("%-15s %-15s %-15s %-18s %-15s %-15s",id,pswd,name,accno,ifsc,balance);
				} else {
					System.out.printf("%nInvalid Entry%n");
				} 
				break;
				
			default:
				System.out.printf("%nInvalid Entry%n");
				break;
			}
			
		
		} else {
			System.out.println("Wrong Credentials");
		}
		
	}

}
