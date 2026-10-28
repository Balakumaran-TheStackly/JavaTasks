package day2;

import java.util.Scanner;



public class Employee_two_dimension {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.print("Enter No of Employees :");
		int employees=sc.nextInt();
		
		System.out.print("Enter No of Months :");
		int months=sc.nextInt();
		
		int[][] salarys=new int[employees][months];
		String[] name=new String[employees];
		int[] totalSalary = new int[employees];
		String[] position=new String[employees];
        
        
        for (int i = 0; i < employees; i++) {
			System.out.println("\nEnter Name of Employee "+(i+1));
			name[i]=sc.next();
			
			System.out.println("\nEnter "+name[i]+" Position");
			position[i]=sc.next();
			
			System.out.println("\nEnter salaries for "+name[i]+" Employee");
			int total=0;
			
			for (int j = 0; j < months; j++) {
				while (true) {
					 System.out.print("Salary " + (j + 1) + ": ");
	                 int salary = sc.nextInt();
	                 
	                 if (salary > 0) {
						salarys[i][j]=salary;
						total+=salary;
						break;
					}else {
						System.out.println("Invalid!!! Enter proper Salary");
					}
				}
			}
			totalSalary[i]=total;
			
		}
        
        
        //lower Salary
        int low=0;
        for (int i = 1; i < employees; i++) {
			if (totalSalary[i]<totalSalary[low]) {
				low=i;
			}
		}
        
        //high salary
        int high=0;
        for (int i = 1; i < employees; i++) {
			if (totalSalary[i]>totalSalary[high]) {
				high=i;
			}
		}
        
        System.out.println("\n======================FINAL REPORT==========================\n");
        
        System.out.print("ID\t");
        System.out.print("Name\t");
        for (int j = 0; j < months; j++) {
            System.out.print("Mon-" + (j + 1) + "\t");
        }
        System.out.println("Total\tPosition\t");
        
        for (int i = 0; i < employees; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(name[i] + "\t");

            for (int j = 0; j < months; j++) {
                System.out.print(salarys[i][j] + "\t");
            }

            System.out.println(totalSalary[i] + "\t"+position[i]+"\t");
        }
        
 
        //Highest Salary
        System.out.println("\nHighest Salary Employee");
        System.out.println("Employee Id :" + (high + 1));
        System.out.println("Employee Name :" + name[high]);
        System.out.println("Employee Possition :"+position[high]);
        System.out.println("Total Salary for "+months+" Months : " + totalSalary[high]);
        
        //lowest Salary
        System.out.println("\nLowest Salary Employee");
        System.out.println("Employee Id :" + (low + 1));
        System.out.println("Employee Name :" + name[low]);
        System.out.println("Employee Possition :"+position[low]);
        System.out.println("Total Salary for "+months+" months : " + totalSalary[low]);
        
        
        sc.close();

	}

}
