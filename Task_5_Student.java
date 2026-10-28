package day2;

import java.util.Scanner;

public class Task_5_Student {
	static Scanner s=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter Your Name");
		String name=s.next();
		System.out.println("Enter Your Class");
		String cl=s.next();
		System.out.println("Enter your Tamil Subject marks");
		int tamil=s.nextInt();
		System.out.println("Enter your English Subject marks");
		int english=s.nextInt();
		System.out.println("Enter your maths Subject marks");
		int maths=s.nextInt();
		
		String grade="";
		int totalMarks=tamil+english+maths;
		double average=totalMarks/3;
		
		if (average > 90) {
			grade="A";
		} else if (average > 75 && average <=90) {
			grade="B";
		} else if (average > 50 && average <=75) {
			grade="C";
		} else if (average > 35 && average <=50) {
			grade="D";
		} else if (average < 35) {
			grade ="Faill";
		} else {
			grade ="Invalid Marks Entered";
		}
		System.out.println("---------------------Student Details------------------");
		System.out.printf("%-10s %-10s %-15s %-15s %-15s%n", "Name","Class","Total Marks","Average Marks","Grade");
		System.out.printf("%-10s %-10s %-15s %-15s %-15s%n",name,cl,totalMarks,average,grade);
		
		
//		System.out.println("Student Name : "+name);
//		System.out.println("Student CLass : "+cl);
//		System.out.println("Tamil Marks : "+tamil);
//		System.out.println("English Marks : "+english );
//		System.out.println("Maths Marks : "+maths);
//		System.out.println("Total Marks in 3 Subjects : "+(totalMarks));
//		System.out.println("Average Marks in 3 Subjects :"+ average);
//		System.out.println(grade);
	}

}
