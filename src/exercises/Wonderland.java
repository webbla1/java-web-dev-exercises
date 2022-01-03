package exercises;

import java.util.Scanner;

public class Wonderland {
    public static void main(String[] args){
        String paragraph = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";
        Scanner input = new Scanner(System.in);
        System.out.println("What word would you like to search for:");
        String searchWord = input.nextLine();
        String paragraphUpper = paragraph.toUpperCase();
        String searchUpper = searchWord.toUpperCase();
        boolean searchResult = paragraphUpper.contains(searchUpper);
        int searchIndex = paragraphUpper.indexOf(searchUpper);
        int searchLength = searchWord.length();
        String newParagraph1 = paragraph.substring(0,searchIndex);
        String newParagraph2 = paragraph.substring(searchIndex + searchLength);
        System.out.println("Was " + searchWord + " contained? " + searchResult);
        System.out.println(newParagraph1 + newParagraph2);
        input.close();
    }
}
