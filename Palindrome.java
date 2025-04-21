package firstassesment;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int number;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number:");
        number = scanner.nextInt();

        int rev = 0;
        int originalNumber = number;

        while (number != 0) {
            int digit = number % 10;
            rev = rev * 10 + digit;
            number = number / 10;
        }

        if (originalNumber == rev) {
            System.out.println(originalNumber + " is a palindrome number.");
        } else {
            System.out.println(originalNumber + " is not a palindrome number.");
        }
    }
}
