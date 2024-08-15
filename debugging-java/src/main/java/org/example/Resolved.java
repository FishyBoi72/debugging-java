package org.example;

public class Resolved { // Declares a public class named 'Resolved'
    
    // Declares a public static method 'calculateAverage' that takes an array of integers as input and returns a double
    public static double calculateAverage(int[] numbers) {
        // Checks if the input array is null or empty, and throws an IllegalArgumentException if true
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }

        int sum = 0; // Initializes a variable 'sum' to store the total sum of the array elements
        // Iterates over each element in the array 'numbers'
        for (int number : numbers) {
            sum += number; // Adds the current element 'number' to 'sum'
            System.out.println("Adding " + number + ", current sum: " + sum);  // Prints the current element and the updated sum (for debugging purposes)
        }

        // Calculates the average by dividing the total sum by the number of elements in the array
        double average = (double) sum / numbers.length; 
        // Prints the total sum and the number of elements (for debugging purposes)
        System.out.println("Total sum: " + sum + ", Number of elements: " + numbers.length);  
        // Prints the calculated average (for debugging purposes)
        System.out.println("Calculated average: " + average);  

        return average; // Returns the calculated average
    }

    // The main method, entry point of the program
    public static void main(String[] args) {
        // Creates an array of integers 'numbers' with values {1, 2, 3, 4, 5}
        int[] numbers = {1, 2, 3, 4, 5};
        // Calls the 'calculateAverage' method with the 'numbers' array and stores the result in the 'average' variable
        double average = calculateAverage(numbers); 
        // Prints the final average to the console
        System.out.println("Average: " + average);
    }
}
