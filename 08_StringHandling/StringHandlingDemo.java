public class StringHandlingDemo {

    public static void main(String[] args) {

        // String
        String str = "Hello";

        System.out.println("String:");
        System.out.println("Original String = " + str);
        System.out.println("Length = " + str.length());
        System.out.println("Uppercase = " + str.toUpperCase());
        System.out.println("Lowercase = " + str.toLowerCase());
        System.out.println("Character at index 1 = " + str.charAt(1));
        System.out.println("Concatenation = " + str.concat(" Java"));

        // StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");

        System.out.println("\nStringBuffer:");
        System.out.println("Original StringBuffer = " + sbf);

        sbf.append(" Java");
        System.out.println("After append = " + sbf);

        sbf.insert(6, "World ");
        System.out.println("After insert = " + sbf);

        sbf.replace(6, 11, "Programming");
        System.out.println("After replace = " + sbf);

        sbf.delete(6, 18);
        System.out.println("After delete = " + sbf);

        sbf.reverse();
        System.out.println("After reverse = " + sbf);

        // StringBuilder
        StringBuilder sbd = new StringBuilder("Hello");

        System.out.println("\nStringBuilder:");
        System.out.println("Original StringBuilder = " + sbd);

        sbd.append(" Java");
        System.out.println("After append = " + sbd);

        sbd.insert(6, "World ");
        System.out.println("After insert = " + sbd);

        sbd.replace(6, 11, "Programming");
        System.out.println("After replace = " + sbd);

        sbd.delete(6, 18);
        System.out.println("After delete = " + sbd);

        sbd.reverse();
        System.out.println("After reverse = " + sbd);
    }
}
