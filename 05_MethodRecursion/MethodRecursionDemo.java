import java.util.Scanner;

class MethodRecursionDemo {

    // Method to display a message
    void display() {
        System.out.println("Demonstration of Methods and Recursion");
    }

    // Recursive method to find factorial
    int factorial(int n) {
        if (n == 0 || n == 1)
            return 1;
        else
            return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        MethodRecursionDemo obj = new MethodRecursionDemo();

        // Calling normal method
        obj.display();

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = obj.factorial(num);

        System.out.println("Factorial = " + result);

        sc.close();
    }
}
