import java.util.Scanner;

/**
 * A calculator class for simple arithmetics.
 */
public class Calculator {

  /**
   * The main method queries for two numbers and an arithmetic operation. Then returns the result.
   */
  public static void main(String[] args)  {
    Scanner input = new Scanner(System.in);

    System.out.println("Enter first and second number:");
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    System.out.println("Enter the operation: + for addition, - for subtraction, * for multiplication or / for division:");
    String calcOperation;
    calcOperation = input.next();

    switch (calcOperation) {
      case "+":
        System.out.println(add(num1,num2));
        break;
      case "-":
        System.out.println(sub(num1,num2));
        break;
      case "*":
        System.out.println(multiply(num1,num2));
        break;
      case "/":
        System.out.println(divideNumbers(num1,num2));
        break;
      default:
        System.out.println("No operation selected");
    }
  }

  /**
   * Method for the addition operation.
   */
  public static int add(int x, int y) {
    int result = x + y;
    return result;
  }

  /**
   * Method for the subtraction operation.
   */
  public static int sub(int x, int y) {
    int result = x - y;
    return result;
  }

  /**
   * Method for the multiplication operation.
   */
  public static int multiply(int x, int y) {
    int result = x * y;
    return result;
  }

  /**
   * Method for the division operation.
   */
  public static int divideNumbers(int x, int y) {
    int result = x / y;
    return result;
  }

}