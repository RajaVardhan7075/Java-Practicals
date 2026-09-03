import java.util.Scanner;
import java.util.Arrays;

class Practical7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // a) Maximum and Second Maximum without duplicates
        int arr[] = new int[5];

        System.out.println("Enter 5 integers:");
        for (int i = 0; i < 5; i++)
            arr[i] = sc.nextInt();

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + secondMax);

        // b) Sort names in Ascending Order
        String names[] = {"Ravi", "Anil", "Kiran", "Bharath", "Deepak"};

        Arrays.sort(names);

        System.out.println("\nNames in Ascending Order:");
        for (String name : names)
            System.out.println(name);

        // c) Addition of two 2x2 matrices
        int A[][] = new int[2][2];
        int B[][] = new int[2][2];
        int C[][] = new int[2][2];

        System.out.println("\nEnter elements of Matrix A:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                A[i][j] = sc.nextInt();

        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < 2; i++)
            for (int j = 0; j < 2; j++)
                B[i][j] = sc.nextInt();

        System.out.println("Matrix Addition:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
                System.out.print(C[i][j] + " ");
            }
            System.out.println();
        }

        // d) 3x3 Matrix Multiplication
        int X[][] = new int[3][3];
        int Y[][] = new int[3][3];
        int Z[][] = new int[3][3];

        System.out.println("\nEnter elements of 3x3 Matrix X:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                X[i][j] = sc.nextInt();

        System.out.println("Enter elements of 3x3 Matrix Y:");
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                Y[i][j] = sc.nextInt();

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Z[i][j] = 0;
                for (int k = 0; k < 3; k++) {
                    Z[i][j] += X[i][k] * Y[k][j];
                }
            }
        }

        System.out.println("Matrix Multiplication:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(Z[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
