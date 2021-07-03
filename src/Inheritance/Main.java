package Inheritance;
//The super keyword in Java is used in subclasses to access superclass members (attributes, constructors and methods).

public class Main {
    public static void main(String[] args) {
        // Creating object of the SubClass
        Dog german = new Dog();
        //Accessing field of superclass
        german.name = "Rocket";
        german.display();
        german.eat();
        german.leg();
    }
}