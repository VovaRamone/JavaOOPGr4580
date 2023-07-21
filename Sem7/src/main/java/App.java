
public class App {
    public static void main(String[] args) {
        CalculatorLogger logger = new CalculatorLogger("calculator_log.txt");
        Calculator calculator = new Calculator(logger); // Pass the logger instance to Calculator
        calculator.runCalculator();
    }
}

