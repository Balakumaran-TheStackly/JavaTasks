
package day2;

import java.util.Scanner;

public class TemperatureReadings {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.print("Enter No of Patients: ");
        int patients = sc.nextInt();

        System.out.print("Enter No of temperatures taken: ");
        int temps = sc.nextInt();

        if (patients <= 0 || temps <= 0) {
            System.out.println("Enter valid patient and temperature counts.");
            sc.close();
            return;
        }

        double[][] temperatures = new double[patients][temps];
        String[] name = new String[patients];
        double[] totalTemp = new double[patients];
        double[] averageTemp = new double[patients];
        char[] admit = new char[patients];

        for (int i = 0; i < patients; i++) {

            System.out.println("\nEnter Name of Patient " + (i + 1));
            name[i] = sc.next();

            System.out.println("Enter temperatures for " + name[i]);

            double total = 0;

            for (int j = 0; j < temps; j++) {

                while (true) {

                    System.out.print("Temperature " + (j + 1) + ": ");
                    double temp = sc.nextDouble();

                    if (temp > 50 && temp < 150) {
                        temperatures[i][j] = temp;
                        total += temp;
                        break;
                    } else {
                        System.out.println(
                            "Invalid! Enter temperature between 50 and 150."
                        );
                    }
                }
            }

            totalTemp[i] = total;
            averageTemp[i] = total / temps;

            if (averageTemp[i] >= 100) {
                admit[i] = 'Y';
            } else {
                admit[i] = 'N';
            }
        }

        
        System.out.println("\n========== FINAL REPORT ==========");

        System.out.print("ID\tName\t");

        for (int j = 0; j < temps; j++) {
            System.out.print("Temp" + (j + 1) + "\t");
        }

        System.out.println("Total\tAverage\tAdmission");

        for (int i = 0; i < patients; i++) {

            System.out.print((i + 1) + "\t");
            System.out.print(name[i] + "\t");

            for (int j = 0; j < temps; j++) {
                System.out.printf("%.2f\t", temperatures[i][j]);
            }

            System.out.printf("%.2f\t%.2f\t%c%n",
                    totalTemp[i], averageTemp[i], admit[i]);
        }

        
        System.out.println("\n========== ADMISSION REPORT ==========");

        for (int i = 0; i < patients; i++) {

            if (admit[i] == 'Y') {
                System.out.println("\nPatient ID: " + (i + 1));
                System.out.println("Patient Name: " + name[i]);
                System.out.printf("Total Temperature: %.2f%n", totalTemp[i]);
                System.out.printf("Average Temperature: %.2f%n",
                        averageTemp[i]);
                System.out.println("Admission Flag: " + admit[i]);
            }
        }

        sc.close();
    }
}
