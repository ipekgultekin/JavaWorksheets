package week7examples;

public class MaxDivisors {
    public static void main(String[] args) {
        int maxDivisors = 0;
        int numberWithMaxDivisors = 0;

        for (int i = 1; i <= 10000; i++) {
            int divisorCount = countDivisors(i);
            if (divisorCount > maxDivisors) {
                maxDivisors = divisorCount;
                numberWithMaxDivisors = i;
            }
        }

        System.out.println("Number with the largest number of divisors: " + numberWithMaxDivisors);
        System.out.println("Number of divisors: " + maxDivisors);
    }

    // Function to count the divisors of a number
    private static int countDivisors(int num) {
        int count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                if (i == num / i) {
                    count++; // If divisors are equal
                } else {
                    count += 2; // Count both divisors (i and num/i)
                }
            }
        }
        return count;
    }
}
