package Supermarket.Classes;

import Supermarket.Interfaces.iActorBehaviour;

import java.util.logging.Logger;

public class PromotionalClient extends Actor implements iActorBehaviour {
    private static final Logger logger = Logger.getLogger("Supermarket");
    private static final int MAX_PARTICIPANTS = 3; // Maximum allowed participants in the promotion (for testing)
    private static int numberOfParticipants;
    private String promotionName;
    private int clientId;

    /**
     * Constructor for the PromotionalClient class.
     *
     * @param name           The name of the promotional client
     * @param promotionName  The name of the promotion
     * @param clientId       The ID of the promotional client
     *
     * @throws NullPointerException     If the name or promotionName is null
     * @throws IllegalArgumentException If the clientId is negative
     */
    public PromotionalClient(String name, String promotionName, int clientId) {
        super(name);
        this.promotionName = promotionName;
        this.clientId = clientId;
        if (numberOfParticipants >= MAX_PARTICIPANTS) {
            logger.info("Отказ в акции! Достигнуто максимальное количество участников акции.");
            logger.info("Клиент " + name + " не может быть участником акции.");
        } else {
            numberOfParticipants++;
        }
    }

    public static int getNumberOfParticipants() {
        return numberOfParticipants;
    }

    public String getPromotionName() {
        return promotionName;
    }

    public int getClientId() {
        return clientId;
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
        // Implement the returnItem() method according to PromotionalClient's behavior
        logger.info(getName() + " возврат " + item);
    }

    @Override
    public void cancelReturn(String item) {
        // Implement the cancelReturn() method according to PromotionalClient's behavior
        logger.info(getName() + " отмена возврата " + item);
    }
}
