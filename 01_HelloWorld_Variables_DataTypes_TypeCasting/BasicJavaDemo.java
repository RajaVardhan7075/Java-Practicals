public class BasicJavaDemo {

    public static void main(String[] args) {

        // Hello World
        System.out.println("Hello, World!");

        // Variables and Primitive Data Types
        int age = 19;
        float percentage = 89.5f;
        double salary = 25000.75;
        char grade = 'A';
        boolean isStudent = true;

        System.out.println("\n--- Variables and Data Types ---");
        System.out.println("Age        : " + age);
        System.out.println("Percentage : " + percentage);
        System.out.println("Salary     : " + salary);
        System.out.println("Grade      : " + grade);
        System.out.println("Student    : " + isStudent);


        // Size of Primitive Data Types
        System.out.println("\n--- Size of Data Types ---");
        System.out.println("Byte   : " + Byte.BYTES + " Bytes (" + Byte.SIZE + " Bits)");
        System.out.println("Short  : " + Short.BYTES + " Bytes (" + Short.SIZE + " Bits)");
        System.out.println("Int    : " + Integer.BYTES + " Bytes (" + Integer.SIZE + " Bits)");
        System.out.println("Long   : " + Long.BYTES + " Bytes (" + Long.SIZE + " Bits)");
        System.out.println("Float  : " + Float.BYTES + " Bytes (" + Float.SIZE + " Bits)");
        System.out.println("Double : " + Double.BYTES + " Bytes (" + Double.SIZE + " Bits)");
        System.out.println("Char   : " + Character.BYTES + " Bytes (" + Character.SIZE + " Bits)");


        // Range of Primitive Data Types
        System.out.println("\n--- Range of Data Types ---");
        System.out.println("Byte   : " + Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println("Short  : " + Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println("Int    : " + Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println("Long   : " + Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println("Float  : " + Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println("Double : " + Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        System.out.println("Char   : " + (int)Character.MIN_VALUE + " to " + (int)Character.MAX_VALUE);


        // Type Casting
        System.out.println("\n--- Type Casting ---");

        int number = 100;

        // Implicit Casting (int to double)
        double implicitCast = number;
        System.out.println("Implicit Casting (int to double): " + implicitCast);

        // Explicit Casting (double to int)
        double value = 99.99;
        int explicitCast = (int)value;
        System.out.println("Explicit Casting (double to int): " + explicitCast);


        // Converting Integer to String
        String stringValue = String.valueOf(number);
        System.out.println("Integer to String: " + stringValue);


        // Converting String to Integer
        String text = "20";
        int convertedNumber = Integer.parseInt(text);
        System.out.println("String to Integer: " + convertedNumber);


        // Multiplication Table
        System.out.println("\n--- Multiplication Table of 2 ---");

        for (int i = 1; i <= 10; i++) {
            System.out.println("2 x " + i + " = " + (2 * i));
        }
    }
}
