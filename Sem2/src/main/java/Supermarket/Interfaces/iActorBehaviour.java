package Supermarket.Interfaces;

import Supermarket.Classes.Actor;

public interface iActorBehaviour extends iReturnOrder {
    /**
     * Check if the actor can take an order.
     *
     * @return true if the actor can take an order, false otherwise
     */
    public boolean isTakeOrder();

    /**
     * Check if the actor can make an order.
     *
     * @return true if the actor can make an order, false otherwise
     */
    public boolean isMakeOrder();

    /**
     * Set whether the actor can take an order.
     *
     * @param takeOrder true if the actor can take an order, false otherwise
     */
    public void setTakeOrder(boolean takeOrder);

    /**
     * Set whether the actor can make an order.
     *
     * @param makeOrder true if the actor can make an order, false otherwise
     */
    public void setMakeOrder(boolean makeOrder);

    /**
     * Get the actor instance.
     *
     * @return The actor instance
     */
    Actor getActor();
}

