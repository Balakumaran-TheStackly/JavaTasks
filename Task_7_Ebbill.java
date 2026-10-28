package day2;

import java.util.Scanner;

public class Task_7_Ebbill {
	static Scanner s=new  Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter the Connection Id");
		int id=s.nextInt();
		System.out.println("Enter connection Name");
		String name=s.next();
		System.out.println("Enter previous Unit");
		int previousUnit=s.nextInt();
		System.out.println("Enter the Current Unit");
		int currentUnit=s.nextInt();
		System.out.println("Enter Type Of Building(Ex: Home/Shop)");
		String building=s.next();
		
		int amount=0;
		int totalUnits=previousUnit+currentUnit;
		int freeUnits=200;
		
		if (building.equalsIgnoreCase("Home")) {
			totalUnits-=freeUnits;
			if (totalUnits<=100 && totalUnits>0) {
				amount=totalUnits*7;    //per unit 7 
			} else if (totalUnits>100 && totalUnits<=200) {
				amount=totalUnits*8;    //per unit 8 more than 100
			} else if (totalUnits>200 && totalUnits<=300) {
				amount=totalUnits*10;    //per unit 10 more than 200
			} else if (totalUnits>300 && totalUnits<=400) {
				amount=totalUnits*13;    //per unit 13  more than 300
			} else if (totalUnits>400 && totalUnits<=500) {
				amount=totalUnits*15;    //per unit 15 more than 400
			} else {
				amount=totalUnits*20;   //per unit 20 more than 500
			}
		} else if (building.equalsIgnoreCase("Shop")) {
			if (totalUnits<=100 && totalUnits>0) {
				amount=totalUnits*14;    //per unit 14 
			} else if (totalUnits>100 && totalUnits<=200) {
				amount=totalUnits*18;    //per unit 18 more than 100
			} else if (totalUnits>200 && totalUnits<=300) {
				amount=totalUnits*22;    //per unit 22 more than 200
			} else if (totalUnits>300 && totalUnits<=400) {
				amount=totalUnits*26;    //per unit 26  more than 300
			} else if (totalUnits>400 && totalUnits<=500) {
				amount=totalUnits*30;    //per unit 30 more than 400
			} else {
				amount=totalUnits*35;   //per unit 355 more than 500
			}
		} else{
			System.out.println("Invalid Bulding Type");
		}
		
		
		System.out.printf("%n-------------------------------------------Electricity Bill Details------------------------------------------------%n");
		System.out.printf("%n%-10s %-10s %-13s %-13s %-13s%n","ID","Name","Total Unit","Building","Amount");
		
		System.out.printf("%-10s %-10s %-13s %-13s %-13s",id,name,totalUnits,building,amount);
		
		
		
//		System.out.println("Connection Id : "+id);
//		System.out.println("Connection Name :"+name);
//		System.out.println("Previous Unit :"+previousUnit);
//		System.out.println("Current Unit :"+currentUnit);
//		System.out.println("Building Type :"+building);
	}
}
