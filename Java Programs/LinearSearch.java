import java.util.Scanner;

public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array
        int[] arr = {10, 23, 5, 18, 4, 35, 12, 7};

        System.out.print("Enter the element to search for: ");
        int target = scanner.nextInt();

        int result = linearSearch(arr, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }

        scanner.close();
    }
}
