package exercise2;

import java.util.Scanner;

public class SumOfDigits {

    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("eine Zahl zwischen 0 und 999: ");

        int Zahl = input.nextInt();
        int a1 = Zahl%10;
        Zahl = Zahl/10;
        int a2 = Zahl%10;
        Zahl = Zahl/10;
        int a3 = Zahl%10;
        
        System.out.println("Sum of digits: " + (a1+a2+a3));
    }
}