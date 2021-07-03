package Inheritance.superclass;

public class Dog extends Animal{
    public void eat(){
        super.eat();
      System.out.println("No , I'm dog only Dog food.");
    }
    public void bark(){
        System.out.print("I can bark");
    }
}
