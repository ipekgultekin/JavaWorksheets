package week4examples;

public class BinaryMain {
    public static void main(String[] args){
        Integer[] intArray = {2,4,6,8,10,12,14};
        String[] strArray = {"two", "four", "six", "ten", "twelve", "fourteen"};

        int intIndex = BinarySearch.binarySearch(intArray,8);
        System.out.println("Index of 8 in intArray is " + intIndex);

        int strIndex = BinarySearch.binarySearch(strArray,"ten");
        System.out.println("Index of 'ten' in strArray is " + strIndex);

        int notFoundIndex = BinarySearch.binarySearch(intArray,5);
        System.out.println("Index of 5 in intArray is " + notFoundIndex);
    }
}
