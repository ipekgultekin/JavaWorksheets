package week5examples;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int[] intArray = new int[50];
        Random randomSource = new Random();

        for (int i = 0; i < 50; i++) {
            intArray[i] = randomSource.nextInt();
        }

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the index[0-49]: ");
        int index = input.nextInt();
        try{
            int randomInt = intArray[index];
            System.out.println("Element at index " + index + " is " + randomInt);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index is out of bounds.");
        } catch (Exception e){
            System.out.println("Something else is wrong.");
        } finally {
            System.out.println("Thank you");
        }
    }
}
