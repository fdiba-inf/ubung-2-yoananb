package exercise2;
import java.util.Scanner;
public class QuadraticEquation {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a value for a:");
    double numberA = input.nextDouble();
    System.out.println("Enter a value for b:");
    double numberB = input.nextDouble();
    System.out.println("Enter a value for c:");
    double numberC = input.nextDouble();
    if (numberA != 0) {
      double discr = Math.pow(numberB, 2) - 4*(numberA)*(numberC);
      if (discr >= 0) {
        double answer1 = (-numberB + Math.sqrt(discr)) / (2*numberA);
        double answer2 = (-numberB - Math.sqrt(discr)) / (2*numberA);
        System.out.println(answer1+", "+answer2);
      
      }
      else {
          System.out.println("Imaginary values");
        }
    }
    else if (numberB != 0) {
      double answer = -numberC/numberB;
      System.out.println("x = " + answer);
    }
    else if (numberB == 0 & numberC != 0) {
      System.out.println("No values");
    }
         else if (numberB == 0 & numberC == 0) {
      System.out.println("Many values");
    }
  }

}