package week4examples;

import java.util.Date;

public class Main {
    public static void main(String[] args){
        MinFinder finder = new MindFinderImp1();

        String[] strings = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"};
        System.out.println("Minimum string is " + finder.findMin(strings));

        Integer[] integers = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("Minimum integer is " + finder.findMin(integers));

    }
}
