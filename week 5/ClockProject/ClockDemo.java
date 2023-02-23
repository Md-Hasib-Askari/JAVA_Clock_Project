package ClockProject;

import java.util.Scanner;

public class ClockDemo {
    public static void main(String[] args) {
        // Taking input for first clock object in seconds
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter time (in seconds): ");
        int inp = sc.nextInt();

        // Initializing first object with seconds
        Clock firstClock = new Clock(inp);
        // Looping 10 times by calling tick() method and printing
        for (int i = 0; i < 10; i++) {
            firstClock.tick();
            System.out.println(firstClock);
        }

        // Taking inputs for secondClock object in hours, minutes and seconds
        System.out.print("Hours: ");
        int hr = sc.nextInt();
        System.out.print("Minutes: ");
        int min = sc.nextInt();
        System.out.print("Seconds: ");
        int sec = sc.nextInt();

        // Initializing first object with seconds
        Clock secondClock = new Clock(hr, min, sec);
        // Looping 10 times by calling tick() method and printing
        for (int i = 0; i < 10; i++) {
            secondClock.tick();
            System.out.println(secondClock);
        }

        // Adding secondClock object in firstClock object using addClock() Method
        firstClock.addClock(secondClock);

        // Printing both objects using toString() Method
        System.out.println();
        System.out.println("First Clock (after adding second clock): "+firstClock);
        System.out.println("Second Clock: "+secondClock);

        // Initializing with a third object thirdClock
        Clock thirdClock = firstClock.subtractClock(secondClock);
        // Printing the thirdClock Object
        System.out.println();
        System.out.println("Difference: "+thirdClock);

    }
}
