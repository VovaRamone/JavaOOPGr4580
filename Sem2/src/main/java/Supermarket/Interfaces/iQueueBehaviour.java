package Supermarket.Interfaces;

public interface iQueueBehaviour {
    /**
     * Add an actor to the queue.
     *
     * @param actor The actor to add to the queue
     */
    void takeInQueue(iActorBehaviour actor);

    /**
     * Remove an actor from the queue.
     */
    void releaseFromQueue();

    /**
     * Take an order from the queue.
     */
    void takeOrder();

    /**
     * Give an order from the queue.
     */
    void giveOrder();
}

