package task4;

import java.util.Scanner;

public class Task4 {
    public void test() {
        System.out.println("Let's test your calculation speed");
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        System.out.println(num1 + " * " + num2 + " = ");
        Scanner sc = new Scanner(System.in);

        int d = 0;
        while (d != 1) {
            int res = sc.nextInt();
            if (res != num1 * num2) {
                System.out.println("Please, try again.");

            } else {
                d = 1;
                System.out.println("Good Job!!");


            }
        }

        System.out.println("Let's test your programming knowledge.");
        System.out.println("Why do we use methods?");
        System.out.println("1. To repeat a statement multiple times.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of a program.");
        System.out.println("4. To interrupt the execution of a program.");
        int c = 0;
        while (c != 1) {
            int choice = sc.nextInt();
            if (choice != 2) {
                System.out.println("Please, try again.");

            } else {
                c = 1;
            }
        }
    }

}
