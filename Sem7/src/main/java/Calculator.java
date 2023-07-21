
import java.util.Scanner;

/**
 * A class representing the complex number calculator.
 */
public class Calculator {
    private static final Scanner scanner = new Scanner(System.in);
    private final CalculatorLogger logger; // Add CalculatorLogger instance

    /**
     * Constructor to create a calculator with a logger.
     *
     * @param logger The calculator logger.
     */
    public Calculator(CalculatorLogger logger) {
        this.logger = logger;
    }

    /**
     * Runs the complex number calculator.
     */
    public void runCalculator() {
        System.out.println("Complex Number Calculator");
        ComplexNumber result = null;
        boolean quit = false;

        while (!quit) {
            try {
                // Ask the user to enter a first number
                System.out.print("Enter numbers separated by space (first number real, second number imaginary): ");
                ComplexNumber number = readComplexNumber();
                logAction("User entered following numbers: " + number.toString()); // Log the action

                if (result == null) {
                    result = number;
                } else {
                    // Ask the user to enter an operator
                    System.out.print("Enter operator (+, *, /, = to calculate, or Q to quit): ");
                    char operator = scanner.next().charAt(0);
                    logAction("Enter operator: " + operator); // Log the action

                    switch (operator) {
                        case '+':
                            result = result.add(number);
                            break;
                        case '*':
                            result = result.multiply(number);
                            break;
                        case '/':
                            result = result.divide(number);
                            break;
                        case '=':
                            quit = true;
                            break;
                        case 'Q':
                        case 'q':
                            quit = true;
                            System.out.println("Calculator quit.");
                            break;
                        default:
                            System.out.println("Invalid operator. Please try again.");
                            logAction("Invalid operator entered."); // Log the action
                            break;
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
                logAction("Error: " + e.getMessage()); // Log the action
            }
        }

        System.out.println("Result: " + result);
        logResult("Result: " + result.toString()); // Log the result
    }

    /**
     * Reads a complex number from the user input.
     *
     * @return The complex number entered by the user.
     */
    private ComplexNumber readComplexNumber() {
        double real = scanner.nextDouble();
        double imaginary = scanner.nextDouble();
        return new ComplexNumber(real, imaginary);
    }

    /**
     * Logs an action into the calculator logger.
     *
     * @param action The action to log.
     */
    private void logAction(String action) {
        if (logger != null) {
            logger.log(action);
        }
    }

    /**
     * Logs the result into the calculator logger.
     *
     * @param result The result to log.
     */
    private void logResult(String result) {
        if (logger != null) {
            logger.log(result);
        }
    }
}
