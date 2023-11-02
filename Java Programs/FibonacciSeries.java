import java.util.Scanner;

class FibonacciSeries {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int numTerms = scanner.nextInt();

     
       
        int term1 = 0, term2 = 1;

   
        System.out.print("Fibonacci Series: " + term1 + " " + term2);

      
        for (int i = 2; i < numTerms; i++) {
            int nextTerm = term1 + term2;
            System.out.print(" " + nextTerm);
            term1 = term2;
            term2 = nextTerm;
        }

        System.out.println(); 
    }
}
