package intrface;
// The main purpose of interface to achieve Multiple Inheritance
interface Polygon{
    void getArea(int length, int breadth);
}
interface Name{
    void getName(String name);
}
// Using interface in class
class Rectangle implements Polygon{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of rectangle is " + (length*breadth));
    }
}
//different interface
class Your implements Name{
    @Override
    public void getName(String name) {
        System.out.println("My name is "+ name);
    }
}
//Multiple Inheritance
class Main implements Polygon,Name{
    @Override
    public void getName(String name) {
        System.out.println("This is multiple " + name);
    }

    @Override
    public void getArea(int length, int breadth) {
        System.out.print("The area of " +(length*breadth));
    }
}
public class DemoInterface {
    public static void main(String[] args){
        Rectangle obj =new Rectangle();
        obj.getArea(4,4);
        Your name=new Your();
        name.getName("Shivam Raj");

        //
        Main multi= new Main();
        multi.getName("Shivam Raj");
        multi.getArea(10,21);
    }
}
