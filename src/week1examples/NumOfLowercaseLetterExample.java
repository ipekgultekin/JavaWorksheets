package week1examples;

import java.util.Scanner;

public class NumOfLowercaseLetterExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();

        int lowercaseCounter = countLowercaseLetter(str);

        System.out.println("Number of lower case letters: " + lowercaseCounter);

    }

    public static int countLowercaseLetter(String str) {
        int count = 0;

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)) {
                count++;
            }
        }
        return count;
    }
}
