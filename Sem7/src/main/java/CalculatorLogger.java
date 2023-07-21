
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * A class to log calculator actions and results into a file.
 */
public class CalculatorLogger {
    private final String logFileName;

    /**
     * Constructor to create a calculator logger with the specified log file name.
     *
     * @param logFileName The name of the log file.
     */
    public CalculatorLogger(String logFileName) {
        this.logFileName = logFileName;
    }

    /**
     * Logs a message into the log file.
     *
     * @param message The message to log.
     */
    public void log(String message) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(logFileName, true))) {
            writer.println(message);
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        }
    }
}
