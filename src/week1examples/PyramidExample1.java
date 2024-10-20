package week1examples;

import java.util.Scanner;

public class PyramidExample1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a limit: ");
        int limit = input.nextInt();

        if(limit > 20 || limit < 2){
            System.out.println("Invalid limit. You have to enter between 2 and 20." );
            System.exit(0);
        }

        for(int i=1; i<=limit; i++){
            for(int j=limit-i; j>0; j--){
                System.out.printf("  ");

            }
            for(int k=i; k>=1; k--){
                System.out.printf(k + " ");
            }

            for(int l=2; l<=i ; l++){
                System.out.printf(l + " ");
            }
            System.out.println();
        }

    }
}
