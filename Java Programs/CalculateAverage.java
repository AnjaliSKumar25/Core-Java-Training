package MyFirstPackage;  // This line defines the package name. In Java, code is often organized into packages to group related classes.

import java.util.Scanner;  // Importing the Scanner class from the java.util package to read user input.

public class CalculateAverage {  // Defining a class named CalculateAverage.

    public static void main(String[] args) {  // The main method, which serves as the entry point for the program.
        Scanner input = new Scanner(System.in);  // Creating a Scanner object to read user input from the console.

        // Calculate the average of three integers
        System.out.println("Enter three integers:");  // Printing a message to the console.
        int int1 = input.nextInt();  // Reading the first integer input from the user.
        int int2 = input.nextInt();  // Reading the second integer input.
        int int3 = input.nextInt();  // Reading the third integer input.
        double intAverage = calculateAverage(int1, int2, int3);  // Calling the calculateAverage method with integer inputs.
        System.out.println("Average of integers: " + intAverage);  // Displaying the average of integers.

        // Calculate the average of three float numbers
        System.out.println("Enter three floating-point numbers:");  // Printing a message to the console.
        float float1 = input.nextFloat();  // Reading the first float input from the user.
        float float2 = input.nextFloat();  // Reading the second float input.
        float float3 = input.nextFloat();  // Reading the third float input.
        double floatAverage = calculateAverage(float1, float2, float3);  // Calling the calculateAverage method with float inputs.
        System.out.println("Average of floating-point numbers: " + floatAverage);  // Displaying the average of float numbers.

        // input.close();  // This line is commented out, but it would close the Scanner if uncommented to release resources.
    }

    // Calculate the average of three integers or floats
    public static double calculateAverage(int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3.0;  // This method takes three integers, calculates their average, and returns the result.
    }

    public static double calculateAverage(float num1, float num2, float num3) {
        return (num1 + num2 + num3) / 3.0;  // This method takes three floats, calculates their average, and returns the result.
    }
}
