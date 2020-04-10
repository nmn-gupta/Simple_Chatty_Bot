package main;

import task1.Task1;
import task2.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Task1 task1 = new Task1();
        task1.greet("Aid", 2018);
        Scanner sc = new Scanner(System.in);
        int firstRemainder = sc.nextInt();
        int secondRemainder = sc.nextInt();
        int thirdRemainder = sc.nextInt();
        Task2 task2 = new Task2(firstRemainder, secondRemainder, thirdRemainder);
        task2.guessAge();




    }
}
