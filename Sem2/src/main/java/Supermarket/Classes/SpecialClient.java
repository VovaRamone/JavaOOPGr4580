package Supermarket.Classes;

import Supermarket.Interfaces.iActorBehaviour;

import java.util.logging.Logger;

public class SpecialClient extends Actor implements iActorBehaviour {
    private static final Logger logger = Logger.getLogger("Supermarket");
    private int idVip;

    /**
     * Constructor for the SpecialClient class.
     *
     * @param name The name of the special client
     * @param id   The ID of the special client
     */
    public SpecialClient(String name, Integer id) {
        super(name);
        idVip = id;
    }

    @Override
    public String getName() {
        return super.name;
    }

    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    public void setTakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
    }

    public void setMakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
    }

    public Actor getActor() {
        return this;
    }

    @Override
    public void returnItem(String item) {
        // Implement the returnItem() method according to SpecialClient's behavior
        logger.info(getName() + " возврат " + item);
    }

    @Override
    public void cancelReturn(String item) {
        // Implement the cancelReturn() method according to SpecialClient's behavior
        logger.info(getName() + " отмена возврата " + item);
    }
}
