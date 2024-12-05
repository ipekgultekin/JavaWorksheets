package week6examples;

import java.io.*;
import java.util.Date;

public class Question3 {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("ex5.dat");

        if(!file.exists()){
            try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file));){
              int[] numbers = {1,2,3,4,5,6};
                Date currentDate = new Date();
                double value = 2.7;

                output.writeObject(numbers);
                output.writeObject(currentDate);
                output.writeObject(value);

                System.out.println("The data has been written.");

            } catch (IOException e) {
                System.out.println("Error while writing to the file: " + e.getMessage());

            }
        }

        else{
            System.out.println("The file exists, NO OVERRIDING.");
        }

        ObjectInputStream input = null ;
        try{
            input = new ObjectInputStream(new FileInputStream(file));
            int[] numbers = (int[]) input.readObject();
            Date currentDate = (Date) input.readObject();
            double value = (double) input.readObject();

            System.out.println("The data has been read successfully.");

            System.out.println("The integer array is: ");
            for(int num : numbers){
                System.out.print(num + " ");
            }
            System.out.println("Current date: " + currentDate);
            System.out.println("Double value: " + value);


        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error while reading from the file: " + e.getMessage());

        }

        finally {
            if(input != null){
                try {
                    input.close();
                }
                catch (IOException e){
                    System.out.println("ERROR WHILE CLOSING");
                }
            }
        }
    }
}
