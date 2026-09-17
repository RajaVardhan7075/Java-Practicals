public class MultipleCatchNestedDemo {

    public static void main(String[] args) {

        try {
            int[] numbers = {10, 20, 30};

            try {
                int result = numbers[1] / 0;
                System.out.println("Result: " + result);
            }
            catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero");
            }

            System.out.println("Accessing array element: " + numbers[5]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index is out of bounds");
        }
        catch (Exception e) {
            System.out.println("Outer catch: Some other exception occurred");
        }

        System.out.println("Program continues normally.");
    }
}
