package typconvrsn;

public class Cnvrsn {
    public static void main(String[] args) {
        // implicit converson
        int num = 20;
        double num1 = num;
        System.out.println(num);
        System.out.println(((Object)num1).getClass().getName());
        //expict or narrowing
        double num2= 30;
        int num3=(int) num2;// force full converting the type
        System.out.print(((Object) num3).getClass().getName());
    }
}
