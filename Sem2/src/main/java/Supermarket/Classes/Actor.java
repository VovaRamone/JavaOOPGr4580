package Supermarket.Classes;

import Supermarket.Interfaces.iActorBehaviour;

public abstract class Actor implements iActorBehaviour {
    protected String name;
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Constructor for the Actor class.
     *
     * @param name The name of the actor
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Get the name of the actor.
     *
     * @return The name of the actor
     */
    abstract public String getName();
}
