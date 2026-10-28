package day2;

import java.util.Scanner;

public class Resort {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.printf("%n---------------BK Resorts---------------%n");
		System.out.printf("%nEnter your name%n");
		String name=sc.next();
		System.out.printf("%nEnter your mobile Number%n");
		long mobile=sc.nextLong();
		
		System.out.printf("%nSelect Room Type%n");
		System.out.printf("%n1.Suite Room %n2.Premium AC/Non-AC %n3.Family AC/Non-AC %n4.Deluxe AC/Non-AC %n5.Party Hall %n");
		int option=sc.nextInt();
		System.out.printf("%nEnter No of rooms%n");
		int rooms=sc.nextInt();
		double rent=1;
		double totalbill=1;
		String roomType="";
		int days=0;
		
		
		switch (option) {
		case 1:
			roomType="Suite Room";
			System.out.printf("%nEnter no of days to book rooms %n1.(1 to 3 days) %n2.(4 to 6 days) %n3.(7 to 10 days) %n4.(11 to 15 days)%n");
			days=sc.nextInt();
			
			switch (days) {
			case 1:
				rent=15000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 2:
				rent=20000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 3:
				rent=25000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 4:
				rent=30000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;

			default:
				System.out.printf("%nCan not Book on those Days%n");
				break;
			}
			System.out.printf("%n----------Suite Room------------%n");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n","Name","Mobile","Type of Room","no of rooms","rent","Total Amount");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n",name,mobile,roomType,rooms,rent,totalbill);
			break;
			
		case 2:
			roomType="Premium Room";
			System.out.printf("%nEnter no of days to book rooms %n1.(1 to 3 days) %n2.(4 to 6 days) %n3.(7 to 10 days) %n4.(11 to 15 days)%n");
			days=sc.nextInt();
			
			switch (days) {
			case 1:
				rent=10000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 2:
				rent=13000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 3:
				rent=16000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 4:
				rent=20000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;

			default:
				System.out.printf("%nCan not Book on those Days%n");
				break;
			}
			System.out.printf("%n----------Premium Room------------%n");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n","Name","Mobile","Type of Room","no of rooms","rent","Total Amount");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n",name,mobile,roomType,rooms,rent,totalbill);

			break;
		case 3:
			roomType="Family Room";
			System.out.printf("%nEnter no of days to book rooms %n1.(1 to 3 days) %n2.(4 to 6 days) %n3.(7 to 10 days) %n4.(11 to 15 days)%n");
			days=sc.nextInt();
			
			switch (days) {
			case 1:
				rent=11000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 2:
				rent=14000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 3:
				rent=17000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 4:
				rent=22000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;

			default:
				System.out.printf("%nCan not Book on those Days%n");
				break;
			}
			System.out.printf("%n----------Family Room------------%n");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n","Name","Mobile","Type of Room","no of rooms","rent","Total Amount");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n",name,mobile,roomType,rooms,rent,totalbill);

			break;
		case 4:
			roomType="Deluxe Room";
			System.out.printf("%nEnter no of days to book rooms %n1.(1 to 3 days) %n2.(4 to 6 days) %n3.(7 to 10 days) %n4.(11 to 15 days)%n");
			days=sc.nextInt();
			
			switch (days) {
			case 1:
				rent=5000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 2:
				rent=8000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 3:
				rent=10000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 4:
				rent=13000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;

			default:
				System.out.printf("%nCan not Book on those Days%n");
				break;
			}
			System.out.printf("%n----------Deluxe Room------------%n");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n","Name","Mobile","Type of Room","no of rooms","rent","Total Amount");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n",name,mobile,roomType,rooms,rent,totalbill);

			break;
		case 5:
			roomType="Party Hall";
			System.out.printf("%nEnter no of days to book rooms %n1.(1 to 3 days) %n2.(4 to 6 days) %n3.(7 to 10 days) %n4.(11 to 15 days)%n");
			days=sc.nextInt();
			
			switch (days) {
			case 1:
				rent=20000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 2:
				rent=23000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 3:
				rent=25000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;
			case 4:
				rent=30000;
				totalbill=rent*rooms;
				System.out.printf("%n----------Rooms Booked Successfully------------%n");
				break;

			default:
				System.out.printf("%nCan not Book on those Days%n");
				break;
			}
			System.out.printf("%n----------Party Hall------------%n");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n","Name","Mobile","Type of Room","no of rooms","rent","Total Amount");
			System.out.printf("%n%-15s %-15s %-15s %-15s %-15s %-15s%n",name,mobile,roomType,rooms,rent,totalbill);

			break;
		default:
			System.out.printf("%n----------Invalid Option------------%n");
			break;
		}
	}

}
