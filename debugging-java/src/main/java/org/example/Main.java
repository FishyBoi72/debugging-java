package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0;
        for (int i = 0; i <= numbers.length; i++) { // ArrayIndexOutOfBoundsException
            sum += numbers[i];  // This happens here on line 13, in which case I would put a breakpoint just in case something doesn't work
            System.out.println("Adding " + numbers[i] + ", current sum: " + sum); // Debugging statement
        }

        double average = (double) sum / (numbers.length + 1); // Logic error here on line 17, in which it adds 1 to the length, giving the wrong average. A breakpoint is here just in case something happens
        System.out.println("Total sum: " + sum + ", Number of elements: " + numbers.length);
        System.out.println("Calculated average: " + average);  // Debugging statement

        return average;
    }

    public static void main(String[] args) {
        int[] numbers = null; // NullPointerException
        double average = calculateAverage(numbers); // This happens here on line 26, in which case I would put a breakpoint just in case something doesn't work
        System.out.println("Average: " + average);
    }
}