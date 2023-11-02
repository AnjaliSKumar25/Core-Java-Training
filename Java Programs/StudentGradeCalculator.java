import java.util.Scanner;

class StudentGradeCalculator {
    public static void main(String[] args) {
		
           Scanner scanner = new Scanner(System.in);
           System.out.print("Enter the total marks: ");
           int totalMarks = scanner.nextInt();

			char grade;

			if (totalMarks < 0 || totalMarks > 100) {
				grade = 'I';
			} else if (totalMarks < 40) {
				grade = 'F'; 
			} else if (totalMarks <= 60) {
				grade = 'D';
			} else if (totalMarks <= 70) {
				grade = 'C';
			} else if (totalMarks <= 80) {
				grade = 'B';
			} else {
				grade = 'A';
			}
		 
			if (grade == 'I') {
				System.out.println("Invalid total marks. Please enter a value between 0 and 100.");
			} else {
				System.out.println("Grade: " + grade);
			}
    }
}
