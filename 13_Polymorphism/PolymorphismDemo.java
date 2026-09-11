class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    // Method overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismDemo {

    public static void main(String[] args) {

        // Runtime polymorphism
        Animal animal = new Dog();

        animal.sound();
    }
}
