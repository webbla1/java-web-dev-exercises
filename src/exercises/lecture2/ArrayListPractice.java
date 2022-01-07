package exercises.lecture2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i=0; i<10; i++){
            numbers.add(i);
        }
        int sum = SumIntegers.getSum(numbers);
        System.out.println(sum);

        String phrase = "I would not, could not.";
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(phrase.split(" ")));
        System.out.println("Enter a search word:");
        Scanner input = new Scanner(System.in);
        int numChars = input.nextInt();

    }

    public static void printFiveLetterWord(ArrayList<String> array, int length) {
        for (String word : array) {
            System.out.println(word);
        }
    }
}
