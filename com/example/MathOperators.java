/**
 * The MathOperators program can do addition, subtraction, multiplication, division, exponents and
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
    int numDecimals = input.nextInt();

    System.out.println("\nEnter two numbers:");

    // Numerical input
    double num1 = input.nextDouble();
    double num2 = input.nextDouble();

    // Create BigDecimal objects to represent the input numbers with the desired number of decimal
    // places
    BigDecimal bdNum1 = new BigDecimal(num1).setScale(numDecimals, RoundingMode.HALF_UP);
    BigDecimal bdNum2 = new BigDecimal(num2).setScale(numDecimals, RoundingMode.HALF_UP);

    // Addition
    System.out.println("\nAddition:");
    System.out.printf(
        "%." + numDecimals + "f + %." + numDecimals + "f = %." + numDecimals + "f%n",
        num1,
        num2,
        bdNum1.add(bdNum2).doubleValue());

    // Subtraction
    System.out.println("\nSubtraction:");
    System.out.printf(
        "%." + numDecimals + "f - %." + numDecimals + "f = %." + numDecimals + "f%n",
        num1,
        num2,
        bdNum1.subtract(bdNum2).doubleValue());

    // Multiplication
    System.out.println("\nMultiplication:");
    System.out.printf(
        "%." + numDecimals + "f * %." + numDecimals + "f = %." + numDecimals + "f%n",
        num1,
        num2,
        bdNum1.multiply(bdNum2).doubleValue());

    // Division
    System.out.println("\nDivision:");
    if (bdNum2.compareTo(BigDecimal.ZERO) != 0) {
      System.out.printf(
          "%." + numDecimals + "f / %." + numDecimals + "f = %." + numDecimals + "f%n",
          num1,
          num2,
          bdNum1.divide(bdNum2, RoundingMode.HALF_UP).doubleValue());
    } else {
      System.out.println("Cannot divide by zero.");
    }

    // Exponents:
    System.out.println("\nExponents:");
    System.out.printf(
        "%." + numDecimals + "f ^ 2 = %.2f%n", num1, Math.pow(bdNum1.doubleValue(), 2));
    System.out.printf(
        "%." + numDecimals + "f^ 3 = %.2f%n", num1, Math.pow(bdNum1.doubleValue(), 3));

    // Square root
    System.out.println("\nSquare root:");
    System.out.printf("sqrt(%.2f) = %.2f%n", num1, Math.sqrt(bdNum1.doubleValue()));
    System.out.printf("sqrt(%.2f) = %.2f%n", num2, Math.sqrt(bdNum2.doubleValue()));
  }
}
