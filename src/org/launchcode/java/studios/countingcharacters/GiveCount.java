package org.launchcode.java.studios.countingcharacters;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.lang.Character;

public class GiveCount {
    public static void main(String[] args) throws IOException {
        String testString = new String(Files.readAllBytes(Paths.get("/Users/ArshadGoods/Desktop/LC101/Unit2/java-practice/chapter1/java-web-dev-exercises/src/org/launchcode/java/studios/countingcharacters/test.txt")));
        Scanner input = new Scanner(System.in);
//        String textStr = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you've done that, it's pretty straightforward from there.";
        System.out.println("Please enter text to count the characters of: ");
        //char[] charsInString = input.nextLine().toUpperCase().toCharArray();
        char[] charsInString = testString.toUpperCase().toCharArray();
        input.close();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char i : charsInString){
            if (Character.isLetter(i)) {
                int count = charCount.containsKey(i) ? charCount.get(i) : 0;
                charCount.put(i, count + 1);
            }

        }

        for (Map.Entry<Character, Integer> character : charCount.entrySet()) {
            System.out.println(character.getKey() + ": " + character.getValue());
        }

    }
}
