package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double radius = 0;
        boolean isNumber;


        System.out.println("Whats the radius of a the circle:");
        do {
            if (input.hasNextInt()) {
                radius = input.nextDouble();
                isNumber = true;
                if (radius < 0) {
                    System.err.print("Please enter a positive number ");
                    radius = input.nextInt();
                }
            } else {
                System.err.print("Please enter a valid number ");
                isNumber = false;
                input.next();
            }
        } while (!(isNumber));
        input.close();

        Object circle = (3.14 * radius * radius);
        System.out.println("The area of the circle is:" + circle);
    }
}

