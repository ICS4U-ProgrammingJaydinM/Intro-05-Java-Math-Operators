/**
 * The MathOperators program can do addition, subtraction, multiplication, division, exponents and
 * square root.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2023-02-13
 */

import java.util.Scanner;

public class MathOperators {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("\nEnter two numbers and how many decimal points you want:");

    // Numerical input
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();

    // Addition
    System.out.println("\nAddition:");
    System.out.printf("%.2f + %.2f =%.2f%n", num1, num2, num1 + num2);

    // Subtraction
    System.out.println("\nSubtraction:");
    System.out.printf("%.2f -%.2f = %.2f%n", num1, num2, num1 - num2);

    // Multiplication
    System.out.println("\nMultiplication:");
    System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, num1 * num2);

    // Division
    System.out.println("\nDivision:");
    if (num2 != 0) {
      System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, num1 / num2);
    } else {
      System.out.println("Cannot divide by zero.");
    }

    // Exponents:
    System.out.println("\nExponents:");
    System.out.printf("%.2f ^ 2 = %.2f%n", num1, Math.pow(num1, 2));
    System.out.printf("%.2f^ 3 = %.2f%n", num1, Math.pow(num1, 3));

    // Square root
    System.out.println("\nSquare root:");
    System.out.printf("sqrt(%.2f) = %.2f%n", num1, Math.sqrt(num1));
    System.out.printf("sqrt(%.2f) = %.2f%n", num2, Math.sqrt(num2));
  }
}
