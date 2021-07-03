package Inheritance.superclass.superdemo;

import Inheritance.accessprotected.Animal;

class AnimalDemo{
    //Super class
    public void display(){
        System.out.println("Hey I am Super class Method ");
    }
}
class DogDemo extends Animal{
    @Override
    public void display(){
        System.out.println("Hey I'm OverRiding Method ");
    }

   public void printMessage(){
        display();
        // this calls overridden method
       super.display();
   }
}
//Main Method
public class SuperCallSupercallMethod {
  public static void main(String[] args){
      DogDemo germa =new DogDemo();
      germa.printMessage();
  }
}
