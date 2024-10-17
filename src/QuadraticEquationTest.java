import java.util.Scanner;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a:");
        int a = input.nextInt();
        System.out.println("Enter b:");
        int b = input.nextInt();
        System.out.println("Enter c:");
        int c = input.nextInt();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if(discriminant > 0){
            System.out.println("The equation has two roots"+ equation.getRoot1() +" and" + equation.getRoot2());
        }
        else if(discriminant == 0){
            System.out.println("The equation has one root"+ equation.getRoot1());
        }
        else{
            System.out.println("The equation has no roots");
        }


    }
}
