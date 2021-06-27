package Klass;
   // Here we declare a class with method that have return type
class  BoxDemo1{
    double width;
    double height;
    double depth;

    double volume(){
        return width*height*depth;
    }
   }
public class KlassMethod0 {
   public static  void main(String[] args){
       BoxDemo1 box1 = new BoxDemo1();
       BoxDemo1 box2 = new BoxDemo1();
       double val;

       // ASSign the Value;

       box1.width=22;
       box1.height=12;
       box1.depth=15;

       box2.depth=16;
       box2.height=8;
       box2.width=9;

       // stored value in variable
       val = box1.volume();
       System.out.println("Your first box1 Volume is: " + val);
       // second box
       val = box2.volume();
       System.out.print("Your second box2 Volume is: " + val);

   }



}
