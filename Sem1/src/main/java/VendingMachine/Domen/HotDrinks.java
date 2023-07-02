package VendingMachine.Domen;

public class HotDrinks extends Product {
    // Additional field
    private int temperature;

    // Constructors
    public HotDrinks(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        this.temperature = temperature;
    }

    // Getter and Setter for temperature
    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    // Override toString() method to include temperature
    @Override
    public String toString() {
        return super.toString() + "Temperature: " + temperature;
    }
}
