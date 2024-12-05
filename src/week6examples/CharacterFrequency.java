package week6examples;

import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CharacterFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        File file = new File(fileName);

        if (!file.exists()) {
            System.out.println("The file does not exist.");
            return;
        }

        // HashMap to store character frequencies
        Map<Character, Integer> frequencyMap = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            int charCode;
            while ((charCode = reader.read()) != -1) { // Read each character
                char character = (char) charCode; // Convert to char
                if (character != '\n' && character != '\r') { // Ignore newline characters
                    frequencyMap.put(character, frequencyMap.getOrDefault(character, 0) + 1);
                }
            }
        } catch (IOException e) {
            System.out.println("Error while reading the file: " + e.getMessage());
            return;
        }

        // Display character frequencies
        System.out.println("Character frequencies in the file:");
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            System.out.println("'" + entry.getKey() + "' -> " + entry.getValue());
        }
    }
}