package VendingMachine.Services;

public class CoinDispenser {
    private int nominal;
    private int insertedCoins;
    private int outgoingCoins;

    public CoinDispenser(int nominal) {
        this.nominal = nominal;
        this.insertedCoins = 0;
        this.outgoingCoins = 0;
    }

    public String toString() {
        return "Nominal coin value: " + nominal;
    }

    public int getSum() {
        return insertedCoins + outgoingCoins;
    }

    public void insertCoin(int coin) {
        insertedCoins += coin;
    }

    public void dispenseCoin(int coin) {
        outgoingCoins += coin;
    }


    public int giveChange(int totalSum, int price) {
        return totalSum >= price ? totalSum - price : 0;
    }

    public boolean dispense(int price) {
        // Check if the dispenser has enough coins to dispense
        if (nominal >= price) {
            nominal -= price; // Reduce the dispenser's available coins
            return true;
        } else {
            return false;
        }
    }
}

