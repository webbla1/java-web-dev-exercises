package exercises.lecture1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the length of the rectangle:");
        Integer length = input.nextInt();
        System.out.println("What is the width of the rectangle:");
        Integer width = input.nextInt();
        Integer area = width * length;
        System.out.println("The area of the rectangle is " + area);
        input.close();
    }
}
