package week3examples;

import java.util.Scanner;

public class MainGeometricObject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the side1 of triangle: ");
        int side1 = input.nextInt();
        System.out.println("Enter the side2 of triangle: ");
        int side2 = input.nextInt();
        System.out.println("Enter the side3 of triangle: ");
        int side3 = input.nextInt();

        System.out.println("Enter color of the triangle: ");
        String color = input.next();
        System.out.println("Is the triangle filled (true or false) ? : ");
        boolean filled = input.nextBoolean();



        Triangle triangle = new Triangle(color,filled,side1,side2,side3);

        System.out.println("Area: " + triangle.getArea());
        System.out.println("Perimeter: " + triangle.getPerimeter());
        System.out.println("Color: " + triangle.getColor());
        System.out.println("Filled: " + triangle.isFilled());

    }
}
