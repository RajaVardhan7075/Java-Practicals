class Student {
    int id;
    String name;

    // Default Constructor
    Student() {
        id = 0;
        name = "Unknown";
    }

    // Parameterized Constructor
    Student(int i, String n) {
        id = i;
        name = n;
    }

    // Method to display student details
    void display() {
        System.out.println("Student ID = " + id);
        System.out.println("Student Name = " + name);
    }
}

public class ConstructorDemo {

    public static void main(String[] args) {

        // Object using Default Constructor
        Student s1 = new Student();
        System.out.println("Default Constructor:");
        s1.display();

        // Object using Parameterized Constructor
        Student s2 = new Student(101, "Siddu");
        System.out.println("\nParameterized Constructor:");
        s2.display();
    }
}
