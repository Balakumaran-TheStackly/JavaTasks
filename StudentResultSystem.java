package day2;
import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input student & subject count
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        System.out.print("Enter number of subjects: ");
        int subjects = sc.nextInt();

        int[][] marks = new int[students][subjects];
        int[] totals = new int[students];
        double[] averages = new double[students];
        char[] grades = new char[students];
        String[] name=new String[students];

        // Input marks with validation
        for (int i = 0; i < students; i++) {
        	System.out.println("\nEnter Name of the Student " + (i + 1));
        	name[i]=sc.next();
            System.out.println("\nEnter marks for "+name[i]+" Student");
            int total = 0;

            for (int j = 0; j < subjects; j++) {
                while (true) {
                    System.out.print("Subject " + (j + 1) + ": ");
                    int mark = sc.nextInt();

                    if (mark >= 0 && mark <= 100) {
                        marks[i][j] = mark;
                        total += mark;
                        break;
                    } else {
                        System.out.println("Invalid! Enter marks between 0 and 100.");
                    }
                }
            }

            totals[i] = total;
            averages[i] = total / (double) subjects;

            // Grade calculation
            if (averages[i] >= 90)
                grades[i] = 'A';
            else if (averages[i] >= 75)
                grades[i] = 'B';
            else if (averages[i] >= 60)
                grades[i] = 'C';
            else if (averages[i] >= 50)
                grades[i] = 'D';
            else
                grades[i] = 'F';
        }
        //find lower
        int lowerindex=0;
        for (int i = 1; i < students; i++) {
            if (totals[i] < totals[lowerindex]) {
            	lowerindex = i;
            }
        }

        // Find toper
        int topperIndex = 0;
        for (int i = 1; i < students; i++) {
            if (totals[i] > totals[topperIndex]) {
                topperIndex = i;
            }
        }

        // Final Report
        System.out.println("\n===== FINAL REPORT =====");
        System.out.print("Student\t");
        System.out.print("Name\t");
        for (int j = 0; j < subjects; j++) {
            System.out.print("Sub" + (j + 1) + "\t");
        }
        System.out.println("Total\tGrade\tAvg");

        for (int i = 0; i < students; i++) {
            System.out.print((i + 1) + "\t");
            System.out.print(name[i] + "\t");

            for (int j = 0; j < subjects; j++) {
                System.out.print(marks[i][j] + "\t");
            }

            System.out.println(totals[i] + "\t" + grades[i]  + "\t" + averages[i]);
        }

        // Display topper
        
        System.out.println("\nTopper of Students");
        System.out.println("Topper Student Id :" + (topperIndex + 1));
        System.out.println("Topper Student Name :" + name[topperIndex]);
        System.out.println("Total Marks: " + totals[topperIndex]);
        System.out.println("Average: " + averages[topperIndex]);
        System.out.println("Grade: " + grades[topperIndex]);

        System.out.println("\nBottom of Student");
        System.out.println("Bottom Student Id :" + (lowerindex + 1));
        System.out.println("Bottom Student Name :" + name[lowerindex]);
        System.out.println("Total Marks: " + totals[lowerindex]);
        System.out.println("Average: " + averages[lowerindex]);
        System.out.println("Grade: " + grades[lowerindex]);
        
        
        sc.close();
    }
}