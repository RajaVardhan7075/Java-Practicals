import java.util.Scanner;

public class StringPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        String reverse = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reverse = reverse + word.charAt(i);
        }

        System.out.println("Original Word = " + word);
        System.out.println("Reversed Word = " + reverse);

        if (word.equalsIgnoreCase(reverse)) {
            System.out.println("The word is a Palindrome");
        } else {
            System.out.println("The word is not a Palindrome");
        }

        sc.close();
    }
}
