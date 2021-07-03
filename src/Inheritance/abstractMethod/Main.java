package Inheritance.abstractMethod;
//      Key Points to Remember
//
//    We use the abstract keyword to create abstract classes and methods.
//    An abstract method doesn't have any implementation (method body).
//    A class containing abstract methods should also be abstract.
//    We cannot create objects of an abstract class.
//    To implement features of an abstract class, we inherit subclasses from it and create objects of the subclass.
//    A subclass must override all abstract methods of an abstract class. However, if the subclass is declared abstract, it's not mandatory to override abstract methods.
//    We can access the static attributes and methods of an abstract class using the reference of the abstract
 public class Main {
    public static void main(String[] args){
    //    Main obj = new Main();
        AbsMethod obj1=new AbsMethod();
        obj1.displayDemo();

    }
}
