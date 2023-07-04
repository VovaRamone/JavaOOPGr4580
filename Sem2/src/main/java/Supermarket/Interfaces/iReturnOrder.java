package Supermarket.Interfaces;

public interface iReturnOrder {
    /**
     * Return an item.
     *
     * @param item The item to return
     */
    void returnItem(String item);

    /**
     * Cancel the return of an item.
     *
     * @param item The item to cancel the return of
     */
    void cancelReturn(String item);
}
