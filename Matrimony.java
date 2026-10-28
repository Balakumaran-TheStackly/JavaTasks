
package day2;

import java.util.Scanner;

public class Matrimony {

    static Scanner sc = new Scanner(System.in);

    String name;
    int age;

    public Matrimony(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void checkEligible(int age, String name) throws NotEligible {

        if (age >= 18) {
            System.out.println("Welcome to Namma Matrimony!");
            System.out.println("Name : "+name);
            System.out.println("Age : "+age);
        } else {
            throw new NotEligible("You are too soon for Hell!");
        }
    }

    public static void main(String[] args) {

        System.out.println("Welcome to Namma Matrimony");

        System.out.print("Enter your name: ");
        String name = sc.next();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        Matrimony person = new Matrimony(name, age);

        try {
            checkEligible(person.age,person.name);
        } catch (NotEligible e) {
            System.out.println(e.getMessage());
        } finally {
            sc.close();
        }
    }
}
