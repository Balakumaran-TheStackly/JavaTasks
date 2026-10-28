package day2;

import java.util.Scanner;

public class Task_6_Employee {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Employee Name");
		String empname=s.next();
		System.out.println("Enter Employee Id");
		int empid=s.nextInt();
		System.out.println("Enter Employee Department");
		String empdept=s.next();
		System.out.println("Enter Employee Experience");
		double empyoe=s.nextDouble();
		System.out.println("Enter Employee Designation");
		String empdesign=s.next();
		System.out.println("Enter Employee Basic Salary (Ex.40000 per month)");
		int basicsalary=s.nextInt();
		
		int bonus=0;
		int increment=0;
		if (empyoe >= 5 && empdept.equalsIgnoreCase("Tech")) {
			if (empdesign.equalsIgnoreCase("Manager")) {
				bonus=8000;
			} else if (empdesign.equalsIgnoreCase("Team Lead")) {
				bonus=5000;
			} else if (empdesign.equalsIgnoreCase("Designer")) {
				bonus=6000;
			} else if (empdesign.equalsIgnoreCase("Developer")) {
				bonus=4500;
			} else if (empdesign.equalsIgnoreCase("Tester")) {
				bonus=4500;
			} else if (empdesign.equalsIgnoreCase("Engineer")) {
				bonus=4000;
			} else {
				bonus=3000;
			}
		}
		if (empyoe >=3) {
			increment=3000;
		} else if (empyoe >=5) {
			increment=5000;
		} else if (empyoe >=7) {
			increment=7000;
		} else if (empyoe >=8) {
			increment=8000;
		} else if (empyoe >=10) {
			increment=12000;
		} else {
			increment=1500;
		}
		
		int pf=(basicsalary*12)/100;
		int esi=(basicsalary*4)/100;
		int grosspay=basicsalary+pf+esi;
		int netpay=grosspay+bonus+increment;
		System.out.printf("%n-------------------------------------------Employee Details------------------------------------------------%n");
		System.out.printf("%n%-10s %-10s %-13s %-13s %-13s %-13s %-13s %-13s %-13s%n","ID","Name","Department","Experience","designation","Gross Pay","Increment","Bonus","Net Pay");
		
		System.out.printf("%-10s %-10s %-13s %-13s %-13s %-13s %-13s %-13s %-13s",empid,empname,empdept,empyoe,empdesign,grosspay,increment,bonus,netpay);
		
//		System.out.println("Employee Name :"+empname);
//		System.out.println("Employee id :"+empid);
//		System.out.println("Employee department :"+empdept);
//		System.out.println("Employee Experience :"+empyoe);
//		System.out.println("Employee Designation :"+empdesign);
//		System.out.println("Employee Basic Salary"+basicsalary);
//		
//		System.out.println("Employee Gross pay : "+grosspay);
//		System.out.println("Employee netpay : "+netpay);
	}
}
