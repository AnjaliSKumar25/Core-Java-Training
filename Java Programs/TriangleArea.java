import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base of the triangle: ");
        double base = sc.nextDouble();

        System.out.print("Enter the height of the triangle: ");
        double height = sc.nextDouble();

        // Calculate the area of the triangle
        double area = 0.5 * base * height;

        // Display the area of the triangle
        System.out.println("The area of the triangle is: " + area);

        //sc.close(); // Close the scanner to release resources
    }
}
