package week5examples;

import java.util.Scanner;

public class MainAccount {
    public static void main(String[] args){
      try{
          Scanner input = new Scanner(System.in);

          System.out.println("Enter an account no: ");
          int accountNo = input.nextInt();
          System.out.println("Enter a balance: ");
          int balance = input.nextInt();
          Account_TryCatch account = new Account_TryCatch(accountNo,balance);


      } catch(IllegalArgumentException e){
          System.out.println("Illegal Argument Exception");
      }finally {
          System.out.println("Bye!");
      }

    }
}
