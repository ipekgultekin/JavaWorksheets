package week1examples;

import java.util.Scanner;

public class ISBNExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 9-digit ISBN number: ");
        String ISBN = input.nextLine();

        if(ISBN.length() != 9) {
            System.out.println("Not a valid ISBN number");
            return;
        }

        int checkSum = 0;

        for (int i = 0; i < 9; i++) {
            int digit = Character.getNumericValue(ISBN.charAt(i));
            checkSum += digit * (i+1);
        }

        checkSum = checkSum % 11;

        String fullISBN = ISBN + (checkSum == 10 ? "X" : checkSum);

        System.out.println("Full ISBN: " + fullISBN);
    }
}
