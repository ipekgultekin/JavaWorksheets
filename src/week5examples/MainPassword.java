package week5examples;

import java.util.Scanner;

public class MainPassword {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a password with 7 digit: ");
        String password = input.nextLine();
        try{
            Password password1 = new Password(password);

        } catch (InvalidPasswordException e){
            System.out.println(e);
        }
    }
}
