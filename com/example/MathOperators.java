package com.example;
/**
 * The MathOperators program can do addition,
 * subtraction, multiplication, division, exponents and
 * square root.
 *
 * @author Jaydin Madore
 * @version 1.0
 * @since 2023-02-13
 */
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public final class MathOperators {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.print("Enter the number of decimal places: ");

    //Will get the number of decimal places from the user.
    int numDecimals = input.nextInt();

    System.out.println("\nEnter two numbers:");

    // Will get 2 number from the user 
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();

    // Create BigDecimal objects to represent the input
    // numbers with the desired number of decimal
    // places.
    BigDecimal bdNum1 = new BigDecimal(num1).
    setScale(numDecimals, RoundingMode.HALF_UP);
    BigDecimal bdNum2 = new BigDecimal(num2).
    setScale(numDecimals, RoundingMode.HALF_UP);

    //Does addition and prints the results.
    System.out.println("\nAddition:");
    System.out.printf(
        // The number following the %. specifies the number of decimal places that should be displayed to the user.
        // The f character indicates that a floating-point number should be inserted at this position.
        // The %n at the end of the format string is a line separator that moves the cursor to the next line.
        "%." + numDecimals + "f + %." + numDecimals +
         "f = %." + numDecimals + "f%n", num1, num2,
        bdNum1.add(bdNum2).doubleValue());

    //Does subtraction and prints the results.
    System.out.println("\nSubtraction:");
    System.out.printf(
        "%." + numDecimals + "f - %." + numDecimals
        + "f = %." + numDecimals + "f%n", num1, num2,
        bdNum1.subtract(bdNum2).doubleValue());

    //Does multiplication and prints the results.
    System.out.println("\nMultiplication:");
    System.out.printf(
        "%." + numDecimals + "f * %." + numDecimals
        + "f = %." + numDecimals + "f%n", num1, num2,
        bdNum1.multiply(bdNum2).doubleValue());

    //Does division and prints the results
    System.out.println("\nDivision:");
    if (bdNum2.compareTo(BigDecimal.ZERO) != 0) {
      System.out.printf(
          "%." + numDecimals + "f / %." + numDecimals
          + "f = %." + numDecimals + "f%n", num1, num2,
          bdNum1.divide(bdNum2, RoundingMode.HALF_UP).doubleValue());
    } else {
      System.out.println("Cannot divide by zero.");
    }

    //Does exponentsand prints the results.
    System.out.println("\nExponents:");
    System.out.printf(
        "%." + numDecimals + "f ^ 2 = %." + numDecimals
         + "f%n" , num1, Math.pow(bdNum1.doubleValue(), 2));
    System.out.printf(
        "%." + numDecimals + "f^ 3 = %." + numDecimals +
        "f%n", num1, Math.pow(bdNum1.doubleValue(), 3));

    //Does square root and prints the results.
    System.out.println("\nSquare root:");
    System.out.printf("sqrt(%.2f) = %." + numDecimals +
    "f%n", num1, Math.sqrt(bdNum1.doubleValue()));
    System.out.printf("sqrt(%.2f) = %." + numDecimals +
    "f%n", num2, Math.sqrt(bdNum2.doubleValue()));
  }
}
