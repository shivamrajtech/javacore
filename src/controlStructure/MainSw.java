package controlStructure;
import  java.util.Scanner;

public class MainSw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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

        }
    }


}
