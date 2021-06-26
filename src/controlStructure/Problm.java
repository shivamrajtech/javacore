package controlStructure;

import java.util.Scanner;

public class Problm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your First Subject Marks");
         int sub1 =scanner.nextInt();
         System.out.println("Enter Your Second Subject Marks");
         int sub2 =scanner.nextInt();
         System.out.println("Enter Your Third Subject Marks");
         int sub3 =scanner.nextInt();
         System.out.println("Enter Your Four Subject Marks");
         int sub4 =scanner.nextInt();
         System.out.println("Enter Your Fifth Subject Marks");
         int sub5 =scanner.nextInt();

         float percent = percentage(sub1,sub2,sub3,sub4,sub5);
         System.out.print("your percentage: "+percent);

    }
    static float percentage(int sub1,int sub2,int sub3,int sub4,int sub5){
        int totalMarksobtaind = sub1+sub2+sub3+sub4+sub5;

        return (float)totalMarksobtaind/5;
    }
}
