import java.util.Scanner;

class NameAndAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        // Display your name and age
        System.out.println("Your name is: " + name);
        System.out.println("Your age is: " + age);

        //sc.close(); // Close the scanner to release resources
    }
}
