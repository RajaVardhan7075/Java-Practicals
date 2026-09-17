class Parent {
    int number = 10;

    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    int number = 20;

    void show() {

        // this keyword
        System.out.println("Child number = " + this.number);

        // super keyword
        System.out.println("Parent number = " + super.number);

        super.display();
    }
}

public class ThisAndSuperDemo {

    public static void main(String[] args) {

        Child obj = new Child();

        obj.show();
    }
}
