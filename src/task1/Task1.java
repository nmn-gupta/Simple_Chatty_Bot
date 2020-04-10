package task1;

import java.util.Scanner;

public class Task1 {
    public static String userName;

    public void greet(String assistantName, int birthYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
        String userName = scanner.nextLine();
        System.out.println("What a great name you have, " + userName + "!");
    }

}
