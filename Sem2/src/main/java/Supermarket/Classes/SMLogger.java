package Supermarket.Classes;

import java.util.logging.Logger;

public class SMLogger {
    private Logger logger;

    public SMLogger(Logger logger) {
        this.logger = logger;
    }

    public void someMethod() {
        logger.info("SMLogger: Logging a message");
        // Perform some actions and log messages
    }
}

