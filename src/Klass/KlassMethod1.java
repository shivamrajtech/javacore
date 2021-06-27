package Klass;
class BoxDemo2{
    double width;
    double height;
    double depth;
    double volume(){
        return  width*height*depth ;
    }
    //method for get the value to global var
    void setDim(double w, double h , double d){
        width =w;
        height=h;
        depth =d;
    }

}
public class KlassMethod1 {
    public static void main(String[] args){
        BoxDemo2 box1=new BoxDemo2();
        BoxDemo2 box2=new BoxDemo2();
        double vol;
        //initialize each box
        box1.setDim(21,10,4);
        box2.setDim(24,8,10);
        // get the volume
        vol = box1.volume();
       System.out.println("Volume of your box is: " + vol);
        //
        vol = box2.volume();
        System.out.print("Volume of your box is: " + vol);

    }
}
