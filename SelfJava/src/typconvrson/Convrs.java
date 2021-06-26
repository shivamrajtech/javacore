package typconvrson;

public class Convrs {
    public static void main(String[] args) {
      // implicit converson
        int num = 20;
        double num1 = num;
        System.out.println(num);

        //expict or narrowing
        double num2= 30;
        int num3=(int) num2;// force full converting the type
    }
}
