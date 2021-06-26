package controlStructure;

public class Main {
    public static void main(String[] args) {
        //if else if
        int month = 9;
        String season;
        if(month==12||month==1||month==2)
            season = "Winter";
            else if(month==3||month==4||month==5)
                season ="Spring";
            else if(month==6||month==7||month==8)
                season="summer";
            else if(month==9||month==10||month==11)
                season="Autumn";
            else
                season="Bogus Month";

            System.out.print("April is in the " +season+".");

    }
}
