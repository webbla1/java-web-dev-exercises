package exercises.lecture1;

import java.util.Scanner;

public class Mpg {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles have you driven:");
        Integer miles = input.nextInt();
        System.out.println("How many gallons of gas have you used:");
        Integer gas = input.nextInt();
        Integer milesPerGallon = miles / gas;
        System.out.println("Your car is using " + milesPerGallon + " miles per gallon");
        input.close();
    }
}
