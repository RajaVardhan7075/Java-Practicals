import java.util.Scanner;

public class LoopingConstructs {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Reverse of a Number using while loop
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            int digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp = temp / 10;
        }

        System.out.println("Reverse = " + reverse);


        // Prime Number using do-while loop
        System.out.print("\nEnter a number to check prime: ");
        int n = sc.nextInt();

        int i = 2;
        boolean isPrime = true;

        if (n <= 1) {
            isPrime = false;
        } else {
            do {
                if (n % i == 0 && i != n) {
                    isPrime = false;
                    break;
                }
                i++;
            } while (i < n);
        }

        if (isPrime) {
            System.out.println(n + " is a Prime Number");
        } else {
            System.out.println(n + " is not a Prime Number");
        }


        // Fibonacci Series using for loop
        System.out.print("\nEnter number of terms for Fibonacci series: ");
        int terms = sc.nextInt();

        int first = 0;
        int second = 1;

        System.out.print("Fibonacci Series: ");

        for (i = 1; i <= terms; i++) {

            System.out.print(first + " ");

            int next = first + second;
            first = second;
            second = next;
        }

        sc.close();
    }
}
