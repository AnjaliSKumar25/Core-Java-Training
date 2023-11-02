import java.util.Scanner;

class AddFloatAndInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a float number: ");
        float floatNumber = sc.nextFloat();

        System.out.print("Enter an integer number: ");
        int integerNumber = sc.nextInt();

        // Calculate the sum of the two numbers
        float result = floatNumber + integerNumber;

        // Display the result
        System.out.println("The sum of " + floatNumber + " and " + integerNumber + " is: " + result);

        //sc.close(); // Close the scanner to release resources
    }
}
