import java.util.Scanner;

class Practical6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // One-Dimensional Array
        int arr[] = new int[5];
        int sum = 0;

        System.out.println("Enter 5 elements:");
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum += arr[i];
        }

        System.out.println("\nOne-Dimensional Array Elements:");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println("\nSum of elements = " + sum);

        // Multi-Dimensional Array
        int matrix[][] = new int[2][2];

        System.out.println("\nEnter elements for 2x2 Matrix:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMatrix Elements:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
