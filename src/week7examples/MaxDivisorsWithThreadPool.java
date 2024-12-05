package week7examples;

import java.util.concurrent.*;

public class MaxDivisorsWithThreadPool {
    private static final int RANGE = 100000; // Range: 1 to 100,000
    private static final int NUM_TASKS = 100; // Divide the range into 100 tasks

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        int rangePerTask = RANGE / NUM_TASKS;
        Future<Result>[] futures = new Future[NUM_TASKS];

        long startTime = System.currentTimeMillis();

        // Submit tasks to executor
        for (int i = 0; i < NUM_TASKS; i++) {
            int start = i * rangePerTask + 1;
            int end = (i == NUM_TASKS - 1) ? RANGE : (i + 1) * rangePerTask;
            futures[i] = executor.submit(new DivisorTask(start, end));
        }

        // Combine results
        int maxDivisors = 0;
        int numberWithMaxDivisors = 0;

        for (Future<Result> future : futures) {
            Result result = future.get();
            if (result.maxDivisors > maxDivisors) {
                maxDivisors = result.maxDivisors;
                numberWithMaxDivisors = result.numberWithMaxDivisors;
            }
        }

        executor.shutdown();
        long endTime = System.currentTimeMillis();

        System.out.println("Elapsed time: " + (endTime - startTime) + " milliseconds");
        System.out.println("Number with the largest number of divisors: " + numberWithMaxDivisors);
        System.out.println("Number of divisors: " + maxDivisors);
    }

    // Task for calculating the maximum divisors in a range
    static class DivisorTask implements Callable<Result> {
        private final int start;
        private final int end;

        public DivisorTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public Result call() {
            int maxDivisors = 0;
            int numberWithMaxDivisors = 0;

            for (int i = start; i <= end; i++) {
                int divisorCount = countDivisors(i);
                if (divisorCount > maxDivisors) {
                    maxDivisors = divisorCount;
                    numberWithMaxDivisors = i;
                }
            }

            return new Result(maxDivisors, numberWithMaxDivisors);
        }

        // Function to count the divisors of a number
        private int countDivisors(int num) {
            int count = 0;
            for (int i = 1; i <= Math.sqrt(num); i++) {
                if (num % i == 0) {
                    if (i == num / i) {
                        count++; // If divisors are equal (e.g., for a perfect square)
                    } else {
                        count += 2; // Count both divisors (i and num/i)
                    }
                }
            }
            return count;
        }
    }

    // Helper class to store results
    static class Result {
        int maxDivisors;
        int numberWithMaxDivisors;

        public Result(int maxDivisors, int numberWithMaxDivisors) {
            this.maxDivisors = maxDivisors;
            this.numberWithMaxDivisors = numberWithMaxDivisors;
        }
    }
}
