import java.util.Scanner;

class VowelChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char character = scanner.next().charAt(0);
        character = Character.toLowerCase(character);
     
        switch (character) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(character + " is a vowel.");
                break;
            default:
                System.out.println(character + " is not a vowel.");
        }
    }
}
