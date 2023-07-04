package Supermarket.Classes;

import Supermarket.Interfaces.iActorBehaviour;

import java.util.logging.Logger;

public class TaxService implements iActorBehaviour {
    private static final Logger logger = Logger.getLogger("Supermarket");
    private String name;
    private boolean isTakeOrder;
    private boolean isMakeOrder;

    /**
     * Constructor for the TaxService class.
     */
    public TaxService() {
        this.name = "Аудит";
    }

    /**
     * Get the name of the tax service.
     *
     * @return The name of the tax service
     */
    public String getName() {
        return name;
    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    @Override
    public void setMakeOrder(boolean makeOrder) {
        isMakeOrder = makeOrder;
    }

    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        isTakeOrder = pickUpOrder;
    }

    @Override
    public Actor getActor() {
        return new OrdinaryClient(name);
    }

    @Override
    public void returnItem(String item) {
        // Implement the returnItem() method according to TaxService's behavior
        logger.info(getName() + " возврат " + item);
    }

    @Override
    public void cancelReturn(String item) {
        // Implement the cancelReturn() method according to TaxService's behavior
        logger.info(getName() + " отмена возврата " + item);
    }
}
