import java.util.Scanner;

public class Palindrome {
    static boolean isPalindrome(int num) {
        int org = num;
        int rev = 0;
        while (num != 0) {
            int rem = num % 10;
            rev = rev * 10 + rem;
            num = num / 10;
        }
        return org == rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isPalindrome(n)) {
            System.out.println("The given number is a palindrome.");
        }
        else {
            System.out.println("The given number is not a palindrome.");
        }
    }
}
