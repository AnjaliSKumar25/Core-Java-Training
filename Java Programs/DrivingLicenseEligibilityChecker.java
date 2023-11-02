import java.util.Scanner;

class DrivingLicenseEligibilityChecker {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
             int age = scanner.nextInt();
        int minimumDrivingAge = 18;
        if (age >= minimumDrivingAge) {
            System.out.println("Congratulations! You are eligible for a driving license.");
        } else {
            System.out.println("Sorry, you are not eligible for a driving license.");
        }
    }
}
