package exercise2;

import java.util.Scanner;

public class DayOfWeek{

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("eine Zahl zwischen 1 und 7: ");

           int g = input.nextInt();
        if (g==1){System.out.println("Monday");}
        else if (g==2){System.out.println("Tuesday");}
        else if (g==3){System.out.println("Wednesday");}
        else if (g==4){System.out.println("Thursday");}
        else if (g==5){System.out.println("Friday");}
        else if (g==6){System.out.println("Saturday");}
        else if (g==7){System.out.println("Sunday");}
        else {System.out.println("Invalid day");}
    }
}