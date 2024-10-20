package week1examples;

public class ConverterExample {
    public static void main(String[] args) {
        //command line program

        if(args.length != 1) {
            System.out.println("Please provide centimeters");
            System.exit(1);
        }

        double centimeters = Double.parseDouble(args[0]);

        System.out.println(centimeters + " centimeters " + convertToInches(centimeters));
        System.out.println("Byee!");
    }

    public static double convertToInches (double centimeters){
        return centimeters*0.3937;
    }
}
