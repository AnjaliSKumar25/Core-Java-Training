import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        // Print the numbers before the swap
        System.out.println("Before swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

        // Swap the numbers using a temporary variable
        int temp = num1;
        num1 = num2;
        num2 = temp;

        // Print the numbers after the swap
        System.out.println("\nAfter swapping:");
        System.out.println("First number: " + num1);
        System.out.println("Second number: " + num2);

       // sc.close(); // Close the scanner to release resources
    }
}
