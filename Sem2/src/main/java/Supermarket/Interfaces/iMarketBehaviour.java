package Supermarket.Interfaces;

import java.util.List;

import Supermarket.Classes.Actor;

public interface iMarketBehaviour {
    /**
     * Accept an actor to the market.
     *
     * @param actor The actor to accept
     */
    void acceptToMarket(iActorBehaviour actor);

    /**
     * Release actors from the market.
     *
     * @param actor The list of actors to release
     */
    void releaseFromMarket(List<Actor> actor);

    /**
     * Update the market.
     */
    void update();
}

