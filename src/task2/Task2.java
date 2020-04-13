package task2;

public class Task2 {
    private int firstRemainder;
    private int secondRemainder;
    private int thirdRemainder;

    public int getFirstRemainder() {
        return firstRemainder;
    }

    public void setFirstRemainder(int firstRemainder) {
        this.firstRemainder = firstRemainder;
    }

    public int getSecondRemainder() {
        return secondRemainder;
    }

    public void setSecondRemainder(int secondRemainder) {
        this.secondRemainder = secondRemainder;
    }

    public int getThirdRemainder() {
        return thirdRemainder;
    }

    public void setThirdRemainder(int thirdRemainder) {
        this.thirdRemainder = thirdRemainder;
    }

    public Task2(int firstRemainder, int secondRemainder, int thirdRemainder) {
        this.firstRemainder = firstRemainder;
        this.secondRemainder = secondRemainder;
        this.thirdRemainder = thirdRemainder;
    }

    public void guessAge() {

        // formula to calculate age
        int age = (firstRemainder * 70 + secondRemainder * 21 + thirdRemainder * 15) % 105;

        System.out.println("Your age is " + age + "; that's a good time to start programming!. ");

    }
}
