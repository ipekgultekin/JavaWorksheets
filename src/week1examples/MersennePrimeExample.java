package week1examples;

import java.util.Scanner;

public class MersennePrimeExample {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter positive number: ");
        int p = input.nextInt();

        System.out.println("p   2^p-1");
        for(int i=p; i<=25; i++){
            int mersenne = (int) Math.pow(2,i)-1;
            System.out.println(i + " " + mersenne);
        }

    }
}
