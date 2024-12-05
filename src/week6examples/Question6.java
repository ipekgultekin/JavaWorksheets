package week6examples;

import java.io.*;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the file name: ");
        String fileName = input.nextLine();

        File file = new File(fileName);


        if(!file.exists()){
            try(ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream(file))){
                byte[] sampleData = {10,20,30,40,50};

                output.writeObject(sampleData);
                System.out.println("File created and data written.");
            }catch (IOException e){
                System.out.println("Error while writing to the file: " + e.getMessage());
            }
            return;
        }

        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream(file);

            int byteRead;
            System.out.println("Byte's decimal representation: ");
            while ((byteRead=fileInputStream.read()) != -1){
                System.out.println(byteRead + " ");
            }

        } catch (Exception e){
            System.out.println("Error reading the file: " + e.getMessage());
        } finally {
            if(fileInputStream != null){
                try {
                    fileInputStream.close();
                }catch (Exception e){
                    System.out.println("Error closing the file: " + e.getMessage());
                }
            }
        }

    }
}
