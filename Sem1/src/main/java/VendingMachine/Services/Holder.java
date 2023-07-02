package VendingMachine.Services;

import VendingMachine.Domen.Places;

import java.util.ArrayList;
import java.util.List;

public class Holder {
    private List<Places> places;
    private int balance;

    public Holder(int xSize, int ySize) {
        places = new ArrayList<>(xSize * ySize);
        for (int x = 0; x < xSize; x++) {
            for (int y = 0; y < ySize; y++) {
                places.add(new Places(x, y));
            }
        }
    }

    public boolean release(int x, int y) {
        return places.stream()
                .filter(place -> place.getCol() == x && place.getRow() == y)
                .findFirst()
                .map(place -> {
                    place.setEmpty(true);
                    return true;
                })
                .orElse(false);
    }

    public int getBalance() {
        return balance;
    }

    public void addCoinsToBalance(int amount) {
        balance += amount;
    }
}

