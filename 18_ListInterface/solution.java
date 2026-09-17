import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> stringList = new ArrayList<>();
        ArrayList<Integer> numberList = new ArrayList<>();

        stringList.add("Java");
        stringList.add("Python");
        stringList.add("C++");

        numberList.add(10);
        numberList.add(20);
        numberList.add(30);

        System.out.println("ArrayList (String):");
        System.out.println(stringList);

        System.out.println("ArrayList (Integer):");
        System.out.println(numberList);

        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.add("HTML");
        linkedList.add("CSS");
        linkedList.add("JavaScript");

        System.out.println("LinkedList:");
        System.out.println(linkedList);
    }
}
