package org.example;

public class Resolved {
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int number : numbers) {
            sum += number; // Resolved issue in line 10
            System.out.println("Adding " + number + ", current sum: " + sum);  // Debugging statement
        }

        double average = (double) sum / numbers.length; // Resolved issue here
        System.out.println("Total sum: " + sum + ", Number of elements: " + numbers.length);  // Debugging statement
        System.out.println("Calculated average: " + average);  // Debugging statement

        return average;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        double average = calculateAverage(numbers); // Resolved issue in line 23
        System.out.println("Average: " + average);
    }
}