package task3;

import java.util.Scanner;

public class Task3 {
    public void operation() {
        System.out.println("Now I will prove  you that I can do any task you want from listed below:");
        System.out.println("Press 1. to check whether the given number is prime or not. ");
        System.out.println("Press 2. to check whether the given number is odd or even. ");
        System.out.println("Press 3. to find theb factorial of any number you want. ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
        if (choice == 1) {
            checkPrime();
        }
        if (choice == 2) {
            //checkEvenOrOdd();
        }
        if (choice == 3) {
            //fcatorial();
        } else {
            System.out.println("Invalid choice!!");
        }

    }

    public void checkPrime() {

    }
}
