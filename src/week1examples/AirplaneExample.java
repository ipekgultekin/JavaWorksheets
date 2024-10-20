package week1examples;

import java.util.Scanner;

public class AirplaneExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter v and a = ");
        int v = input.nextInt();
        double a = input.nextDouble();

        System.out.println("The minimum runway length fort his airplane is " + calculate(v,a));
    }

    public static double calculate(int v, double a) {
        return (v*v)/(2*a);
    }
}
