// Demonstration of different types of inheritance in Java

// A) Single Inheritance
class Animal {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

// B) Multilevel Inheritance
class Grandparent {
    void showGrandparent() {
        System.out.println("Grandparent class");
    }
}

class Parent extends Grandparent {
    void showParent() {
        System.out.println("Parent class");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("Child class");
    }
}

// C) Hierarchical Inheritance
class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void driveCar() {
        System.out.println("Car is driving");
    }
}

class Bike extends Vehicle {
    void rideBike() {
        System.out.println("Bike is riding");
    }
}

// D) Hybrid Inheritance using interfaces
class Person {
    void displayPerson() {
        System.out.println("Person class");
    }
}

interface Student {
    void study();
}

interface Sports {
    void play();
}

class CollegeStudent extends Person implements Student, Sports {

    public void study() {
        System.out.println("Student is studying");
    }

    public void play() {
        System.out.println("Student is playing");
    }
}

// Main class
public class InheritanceDemo {

    public static void main(String[] args) {

        // Single Inheritance
        System.out.println("A) Single Inheritance");
        Dog d = new Dog();
        d.eat();
        d.bark();

        // Multilevel Inheritance
        System.out.println("\nB) Multilevel Inheritance");
        Child c = new Child();
        c.showGrandparent();
        c.showParent();
        c.showChild();

        // Hierarchical Inheritance
        System.out.println("\nC) Hierarchical Inheritance");
        Car car = new Car();
        car.start();
        car.driveCar();

        Bike bike = new Bike();
        bike.start();
        bike.rideBike();

        // Hybrid Inheritance
        System.out.println("\nD) Hybrid Inheritance");
        CollegeStudent cs = new CollegeStudent();
        cs.displayPerson();
        cs.study();
        cs.play();
    }
}
