public class OperatorsDemo {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        // Arithmetic Operators
        System.out.println("Arithmetic Operators");
        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulus: " + (a % b));

        // Relational Operators
        System.out.println("\nRelational Operators");
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

        // Logical Operators
        System.out.println("\nLogical Operators");
        System.out.println("(a > 5 && b < 10): " + (a > 5 && b < 10));
        System.out.println("(a > 15 || b < 10): " + (a > 15 || b < 10));
        System.out.println("!(a == b): " + !(a == b));

        // Bitwise Operators
        System.out.println("\nBitwise Operators");
        System.out.println("a & b: " + (a & b));
        System.out.println("a | b: " + (a | b));
        System.out.println("a ^ b: " + (a ^ b));
        System.out.println("~a: " + (~a));
        System.out.println("a << 1: " + (a << 1));
        System.out.println("a >> 1: " + (a >> 1));

        // Assignment Operators
        System.out.println("\nAssignment Operators");

        int x = a;

        x += b;
        System.out.println("x += b: " + x);

        x -= b;
        System.out.println("x -= b: " + x);

        x *= b;
        System.out.println("x *= b: " + x);

        // Unary Operators
        System.out.println("\nUnary Operators");

        int y = 10;

        System.out.println("Pre-increment: " + (++y));
        System.out.println("Post-increment: " + (y++));
        System.out.println("Value after post-increment: " + y);

        System.out.println("Pre-decrement: " + (--y));
        System.out.println("Post-decrement: " + (y--));
        System.out.println("Value after post-decrement: " + y);
    }
}
