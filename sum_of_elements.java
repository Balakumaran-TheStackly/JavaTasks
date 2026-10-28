package day2;


import java.util.Scanner;

public class sum_of_elements {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter number of elements");
		int size=sc.nextInt();
		
		int [] a=new int[size];
		
		int sum=0;
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the "+(i+1)+" Element");
			a[i]=sc.nextInt();
		}
		//sum
		System.out.println("\nElements : ");
		for (int i = 0; i < size; i++) {
			sum+=a[i];
			System.out.print(a[i]+" ");
		}
		System.out.printf("%nSum of Elements : "+sum);
	}

}
