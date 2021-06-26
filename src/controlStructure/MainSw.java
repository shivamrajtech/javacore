package controlStructure;
import  java.util.Scanner;

public class MainSw {
    public static void main(String[] args) {


      Scanner scanner = new Scanner(System.in);
      /*
        String orderedFood =scanner.nextLine();
        switch  (orderedFood){
            case "Burger":
                System.out.println("You Have ordered Burger" +
                        ". Unit price: Rs 150 ");
                break;
            case "Pizza":
                System.out.println("You have ordered pizza. Unit price:" +
                        "Rs 250");
                break;
            case "Sandwich":
                System.out.println("You have ordered sandwich. Unit price:" +
                        "Rs 100");
            default:
                System.out.println("Invalid Selection");

        }*/

        for(  int i = scanner.nextInt();i<12;i+=1){
            switch (i){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                        case 4:
                        System.out.println("i is less than 5");
                        break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i is less than 10");
                    break;
                case 10:
                case 11:
                    System.out.println("i is less than 12");
                    break;
                default:
                    System.out.println("i is 12 or more ");
            }
        }


    }


}

