package Klass;
   // Simple class
 class  Box{
     double width;
     double height;
     double depth;
 }

public class Klass {
    public static void main(String[] args) {
        Box box1 = new Box();
        // Assign the value

        box1.width=10;
        box1.height=20;
        box1.depth=25;
        // output
        System.out.print("Volume of you Box: \n" + box1.width* box1.height* box1.depth);
    }
}
