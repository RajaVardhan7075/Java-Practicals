public class HelloWorldDemo {

    public static void main(String[] args) {

        // Hello World
        System.out.println("Hello, World!");

        // Variables and Primitive Data Types
        int age = 19;
        float percentage = 89.5f;
        double salary = 25000.75;
        char grade = 'A';
        boolean isStudent = true;

        // Display Variable Values
        System.out.println("\n--- Variables and Data Types ---");
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);
        System.out.println("Salary     : " + salary);
        System.out.println("Grade      : " + grade);
        System.out.println("Student    : " + isStudent);

        // Implicit Type Casting
        int number = 100;
        double implicitCast = number;

        // Explicit Type Casting
        double value = 99.99;
        int explicitCast = (int) value;

        // Display Type Casting
        System.out.println("\n--- Type Casting ---");
        System.out.println("Implicit Casting (int to double): " + implicitCast);
        System.out.println("Explicit Casting (double to int): " + explicitCast);
    }
}
