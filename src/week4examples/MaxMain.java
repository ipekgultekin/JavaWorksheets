package week4examples;

public class MaxMain {
    public static void main(String[] args){
       Integer[] intArray = {5,55,34,89,100,23};
       String[] strArray = {"one", "two", "three", "eight"};

       Integer maxInt = MaxElement.max(intArray);
       System.out.println("Max integer is " + maxInt);

       String maxStr = MaxElement.max(strArray);
       System.out.println("Max string is " + maxStr);

    }
}
