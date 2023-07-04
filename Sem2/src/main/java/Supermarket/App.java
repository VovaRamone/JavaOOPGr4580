package Supermarket;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import Supermarket.Classes.*;
import Supermarket.Interfaces.iActorBehaviour;
import Supermarket.Interfaces.iReturnOrder;

public class App {
    private static final Logger logger = Logger.getLogger("Supermarket");

    /**
     * The main method of the application.
     *
     * @param args Command-line arguments
     * @throws Exception If an exception occurs
     */
    public static void main(String[] args) throws Exception {
        // Configure logger
        configureLogger();

        Market magnit = new Market();
        iActorBehaviour client1 = new OrdinaryClient("Boris");
        iActorBehaviour client2 = new SpecialClient("Elon Musk", 1001);
        iActorBehaviour p = new PensionerClient("Sergey Nikolaevich", 1111);
        iActorBehaviour tax = new TaxService();
        iActorBehaviour promoClient1 = new PromotionalClient("Aleksandr", "Летние скидки", 2001);
        iActorBehaviour promoClient2 = new PromotionalClient("Olga", "Летние скидки", 2002);
        iActorBehaviour promoClient3 = new PromotionalClient("Egor", "Летние скидки", 2003);
        iActorBehaviour promoClient4 = new PromotionalClient("David", "Летние скидки", 2004);

        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(p);
        magnit.acceptToMarket(tax);
        magnit.acceptToMarket(promoClient1);
        magnit.acceptToMarket(promoClient2);
        magnit.acceptToMarket(promoClient3);
        magnit.acceptToMarket(promoClient4);

        magnit.update();

        // Example of using the iReturnOrder interface
        if (client1 instanceof iReturnOrder) {
            iReturnOrder returnClient = (iReturnOrder) client1;
            returnClient.returnItem("Товар 1");
            returnClient.cancelReturn("Товар 2");
        }
            logger.info("Количество участников акции: " + PromotionalClient.getNumberOfParticipants());

            // Close the logger
            logger.info("Closing the application");
            logger.info("--------------------------------------------------");
            logger.removeHandler(logger.getHandlers()[0]);
        }

        /**
         * Configure the logger to log to a file named "Supermarket.log".
         */
        private static void configureLogger () {
            try {
                FileHandler fileHandler = new FileHandler("Supermarket.log");
                SimpleFormatter formatter = new SimpleFormatter();
                fileHandler.setFormatter(formatter);
                logger.addHandler(fileHandler);
                logger.setLevel(Level.ALL);
            } catch (IOException e) {
                e.printStackTrace();
        }
    }
}
