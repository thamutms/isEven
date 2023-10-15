import java.util.InputMismatchException;
import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number which you want to test,here!!??");
        try {
            int A;
            String name;
            A = input.nextInt();
            name= input.next();
            isEven(A);
            isPrime(A);
            isPalindrome(name);
            isPalindromeWithInBuilt(name);
        }
        catch (InputMismatchException e)
        {
            System.out.println("The input which you have entered is of not correct type");
        }

    }

    private static void isPalindromeWithInBuilt(String name) {
        String rev = name;
        StringBuffer reverseString = new StringBuffer(rev);
        reverseString = reverseString.reverse();
      //  System.out.println(reverseString);
        if (rev.equals(reverseString.toString()))
        {
            System.out.println("Its a Palindrome");
        }
        else {
            System.out.println("Its not a Palindrome");
        }

    }

    private static void isPalindrome(String name) {
        String rev ="";
        for(int i = name.length()-1 ;i>=0 ; i--) {
             rev = rev + name.charAt(i);
        }
        if(rev.equals(name))
        {
            System.out.println(name+ " is palindrome");
        }
        else {
            System.out.println(name+ " not a palindrome");
        }

    }

    private static void isEven(int a) {
        {

            if(a%2 == 0) {
                System.out.println("The number is even");
            }
            else{
                System.out.println("The number is odd");
            }
        }
    }

    private static void isPrime(int num) {
        if (num < 2) {
            System.out.println("This is not a prime number");
        } else {
            for(int i = 2; i < num; i++) {
                if (num % i == 0) {
                    System.out.println("the number is not a prime number");
                }
                return;
            }
            System.out.println("the number is a prime number");
        }
    }
}






