package day2;

import java.util.Scanner;

public class ATMSystem {
	static Scanner sc= new Scanner(System.in);
	
	
	
	public void deposit(double balance,int id,String name,String ifsc,long accno) {
		System.out.printf("%n------------Deposit-------------%n");
		System.out.printf("%nEnter the Deposit Amount%n");
		double dep=sc.nextDouble();
		if (dep>0) {
			balance +=dep;
			System.out.printf("%nAmount Deposited Successfully%n");
			System.out.printf("%n%-15s %-15s %-18s %-15s %-15s %-15s%n","User ID","Name","Account Number","IFSC Code","Deposit","Current Balance");
			System.out.printf("%-15s %-15s %-18s %-15s %-15s %-15s",id,name,accno,ifsc,dep,balance);
		} else {
			System.out.printf("%nInvalid Deposit Amount%n");
		}
	}
	
	public void withdrawn(double balance,int id,String name,String ifsc,long accno) {
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
	}
	
	public void change(int id, String name, long accno, String ifsc, double balance,String pswd) {
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
		
	}

	public void balance(int id, String name, double balance) {
		System.out.printf("%n------------Balance Details-------------%n");
		System.out.printf("%n%-15s %-15s %-15s%n","User ID","Name","Current Balance");
		System.out.printf("%-15s %-15s %-15s",id,name,balance);
	}

	public void details(int id, String name, long accno, String ifsc, double balance) {
		System.out.printf("%n------------Account Details-------------%n");
		System.out.printf("%n%-15s %-15s %-18s %-15s %-15s%n","User ID","Name","Account Number","IFSC Code","Current Balance");
		System.out.printf("%-15s %-15s %-18s %-15s %-15s",id,name,accno,ifsc,balance);
		
	} 
	
	public static void main(String[] args) {

	    int id = 1004;
	    String pswd = "Bala@1";
	    String name = "Bala";
	    double balance = 25000;
	    long accno = 1236547890L;
	    String ifsc = "MRM00123";

	    ATMSystem atm = new ATMSystem();

	    System.out.println("Enter User ID:");
	    int userid = sc.nextInt();

	    System.out.println("Enter Password:");
	    String password = sc.next();

	    if (userid == id && password.equals(pswd)) {

	        System.out.println("Welcome to Mariyyamman Bank");

	        int option;

	        do {
	            System.out.println("\n========== ATM MENU ==========");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Account Details");
	            System.out.println("4. View Balance");
	            System.out.println("5. Change User ID/Password");
	            System.out.println("6. Exit");
	            System.out.print("Select an Option: ");

	            option = sc.nextInt();

	            switch (option) {
	                case 1:
	                    atm.deposit(balance, id, name, ifsc, accno);
	                    break;

	                case 2:
	                    atm.withdrawn(balance, id, name, ifsc, accno);
	                    break;

	                case 3:
	                    atm.details(id, name, accno, ifsc, balance);
	                    break;

	                case 4:
	                    atm.balance(id, name, balance);
	                    break;

	                case 5:
	                    atm.change(id, name, accno, ifsc, balance, pswd);
	                    break;

	                case 6:
	                    System.out.println("Thank you for using Mariyyamman Bank!");
	                    break;

	                default:
	                    System.out.println("Invalid Option!");
	            }

	        } while (option != 6);

	    } else {
	        System.out.println("Wrong Credentials");
	    }

	    sc.close();
	}	
	
}
