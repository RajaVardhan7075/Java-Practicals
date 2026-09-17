abstract class Animal {

    // Abstract method
    abstract void sound();

    // Concrete method
    void eat() {
        System.out.println("Animal is eating");
    }
}

interface Pet {

    void play();
}

class Dog extends Animal implements Pet {

    // Implementing abstract class method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }

    // Implementing interface method
    @Override
    public void play() {
        System.out.println("Dog is playing");
    }
}

public class AbstractionDemo {

    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
        d.eat();
        d.play();
    }
}
