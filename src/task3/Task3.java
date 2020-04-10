package task3;

import java.util.Scanner;

public class Task3 {
    Scanner sc = new Scanner(System.in);
    public void operation() {
        System.out.println("Now I will prove  you that I can do any task you want from listed below:");
        System.out.println("Press 1. to check whether the given number is prime or not. ");
        System.out.println("Press 2. to check whether the given number is odd or even. ");
        System.out.println("Press 3. to find theb factorial of any number you want. ");

        int choice = sc.nextInt();
        if (choice == 1) {
            checkPrime();
        }
        if (choice == 2) {
            checkEvenOrOdd();
        }
        if (choice == 3) {
            //fcatorial();
        } else {
            System.out.println("Invalid choice!!");
        }

    }

    public void checkPrime() {

        System.out.println("Enter the number to be checked:");
        int userInput = sc.nextInt();
        int c = 0;
        for (int i = 2; i < userInput; i++) {
            if (userInput % i == 0) {
                c++;
            }

        }
        if (c == 0) {
            System.out.println(userInput + " is Prime number");

        } else {
            System.out.println(userInput + " is not a Prime number");

        }

    }

    public void checkEvenOrOdd() {
        System.out.println("Enter the number to be checked:");
        int userInput = sc.nextInt();
        if (userInput % 2 == 0) {
            System.out.println(userInput + " is Even number");
        } else {
            System.out.println(userInput + " is Odd number");
        }

    }
}
