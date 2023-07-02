package VendingMachine.Services;

import VendingMachine.Domen.Product;

import java.util.List;

public class VendingMachine {
    private Holder holder;
    private CoinDispenser dispenser;
    private List<Product> assortmentList;
    private Display display;

    public VendingMachine(Holder holder, CoinDispenser dispenser, List<Product> assortmentList, Display display) {
        this.holder = holder;
        this.dispenser = dispenser;
        this.assortmentList = assortmentList;
        this.display = display;
    }

    public List<Product> getAssortmentList() {
        return assortmentList;
    }

    public boolean buyProduct(Product product, int price) {
        if (assortmentList.contains(product) && holder.getBalance() >= price) {
            if (dispenser.dispense(price)) {
                releaseProduct(product, holder);
                display.print("You have successfully bought " + product.getName() + ".");
                return true; // Return true to indicate successful purchase
            }
        }
        return false; // Return false if product is not available or balance is insufficient
    }

    public void releaseProduct(Product product, Holder holder) {
        holder.release(0, 0);
        assortmentList.remove(product);
    }


    public void cancel() {
        dispenser.giveChange(0, 0);
    }

    public Holder getHolder() {
        return holder;
    }

    public CoinDispenser getDispenser() {
        return dispenser;
    }

    public Display getDisplay() {
        return display;
    }
}

