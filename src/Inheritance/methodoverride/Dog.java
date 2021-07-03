package Inheritance.methodoverride;

public class Dog extends Animal{

    //override
    @Override
    public void eat(){
        System.out.println("I eat dog food!");
    }

    public void bark(){
        System.out.print("I can bark");
    }

}
