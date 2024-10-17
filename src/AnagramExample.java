//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Arrays;
import java.util.Scanner;

public class AnagramExample {
    public static boolean isAnagram(String s1, String s2){ //method
        s1 = s1.replaceAll("\\s", "").toLowerCase();
        s2 = s2.replaceAll("\\s", "").toLowerCase();

        if(s1.length() != s2.length()){
            return false;
        }

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the string 1: ");
        String string1 = scanner.nextLine();

        System.out.println("Enter the string 2: ");
        String string2 = scanner.nextLine();

        if (isAnagram(string1, string2)) {
            System.out.println("Anagram");
        }
        else {
            System.out.println("Not Anagram");
        }

    }
}