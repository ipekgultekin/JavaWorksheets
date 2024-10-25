package week3examples;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

public class MainQuestion4 {
    public static void main(String[] args) {
        Loan loan = new Loan(5.0,10,20000);
        Date date = new Date();
        String str = "Hello world";
        Random rand = new Random();

        GraphObject graphObject = new GraphObject("Sample shape","red",10,20);

        ArrayList<Object> objects = new ArrayList<>();
        objects.add(loan);
        objects.add(date);
        objects.add(str);
        objects.add(rand);
        objects.add(graphObject);

        for(Object object : objects) {
            System.out.println(object);
        }
    }
}
