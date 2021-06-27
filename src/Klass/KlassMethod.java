package Klass;
 class BoxDemo0{
    double width;
    double height;
    double depth;

    void volume(){
        System.out.print("volume of Your Class : \n"+ width*height*depth +"\n");
    }

        }
public class KlassMethod {
     public static void main(String[] args){
         // object create
         BoxDemo0 box1 =new BoxDemo0();
         BoxDemo0 box2 = new BoxDemo0();
         // Assign value in box1
         box1.width= 10;
         box1.height=9;
         box1.depth=2;
         //Assign value in box2
         box2.height=6;
         box2.width=5;
         box2.depth=1;
         // volume()
         box1.volume();
         box2.volume();

     }
}
