package controlStructure;

public class Firstconif {
    public static void main(String[] args) {
          String customerType = "Regular";
          int quantity = 2;
          int unitPrice = 10;
          int totalCost  ;
          int discount = 5;
          totalCost = unitPrice*quantity ;
          if (customerType.equals("Regular")){
              totalCost = totalCost-(totalCost*discount/100);
              System.out.print("You are the regular coustomer and eligible for 5% discount!"
                      + "\n" + "Total cost: " + totalCost);
          }
          int result1 = max(3,4,1);
    int result2 = max(4,4,1);
		System.out.print(result1+ "\n" +result2);
    }
    static int max(int num1,int num2,int num3) {
        if (num1 > num2 && num1 > 3 || num1 == num2 || num1 == num3)
            return num1;
        else if (num2 > num1 && num2 > num3 || num2 == num1 || num2 == num3)
            return num2;
        else if (num3 > num1 && num3 > num2 || num3 == num1 || num3 == num2)
            return num3;
        else
            return 0;
    }
    public static class Main {
        public static void main(String[] args) {
           /* nested if
            int i =10;
            int j = 10;
            int k =120;
           // int c = 0,a = 0,b = 0;
            if ( i==10){
                if(j<20) a=b;
                if(k>100)  c=d;
                else c =20;
            }
            */

            // Implement your code here



        }
    }


}
