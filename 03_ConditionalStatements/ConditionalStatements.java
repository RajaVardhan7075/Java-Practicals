import java.util.Scanner;

public class ConditionalStatements {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Even or Odd using if-else
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println(num + " is Even");
        } else {
            System.out.println(num + " is Odd");
        }


        // Largest of Three Numbers using nested if-else
        System.out.print("\nEnter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        if (a > b) {
            if (a > c) {
                System.out.println(a + " is Largest");
            } else {
                System.out.println(c + " is Largest");
            }
        } else {
            if (b > c) {
                System.out.println(b + " is Largest");
            } else {
                System.out.println(c + " is Largest");
            }
        }


        // Week Day using switch
        System.out.print("\nEnter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Sunday");
                break;

            case 2:
                System.out.println("Monday");
                break;

            case 3:
                System.out.println("Tuesday");
                break;

            case 4:
                System.out.println("Wednesday");
                break;

            case 5:
                System.out.println("Thursday");
                break;

            case 6:
                System.out.println("Friday");
                break;

            case 7:
                System.out.println("Saturday");
                break;

            default:
                System.out.println("Invalid Day");
        }


        sc.close();
    }
}
