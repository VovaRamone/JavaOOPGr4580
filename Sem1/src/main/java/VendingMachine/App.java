package VendingMachine;

import VendingMachine.Domen.Bottle;
import VendingMachine.Domen.HotDrinks;
import VendingMachine.Domen.Product;
import VendingMachine.Services.CoinDispenser;
import VendingMachine.Services.Display;
import VendingMachine.Services.Holder;
import VendingMachine.Services.VendingMachine;

import java.util.ArrayList;
import java.util.List;


public class App {
    public static void main(String[] args) throws Exception {
        // Create a list to hold the assortment of products
        List<Product> assortmentList = new ArrayList<>();

        // Create instances of different products
        Product item1 = new Product(100, 1, "Lays", 105);
        Product item2 = new Product(50, 2, "Cola", 106);
        Product item3 = new Bottle(150, 3, "Mineral Water", 101, 1.5f);
        Product item4 = new HotDrinks(80, 4, "Coffee", 102, 70);
        Product item5 = new HotDrinks(120, 5, "Tea", 103, 60);
        Product item6 = new HotDrinks(90, 6, "Hot Chocolate", 104, 65);

        // Add products to the assortment list
        assortmentList.add(item1);
        assortmentList.add(item2);
        assortmentList.add(item3);
        assortmentList.add(item4);
        assortmentList.add(item5);
        assortmentList.add(item6);

        // Create instances of services
        Holder holder = new Holder(4, 4);
        CoinDispenser coinDispenser = new CoinDispenser(0);
        Display display = new Display();

        // Create a vending machine with the services and assortment
        VendingMachine vendingMachine = new VendingMachine(holder, coinDispenser, assortmentList, display);

        // Display the products in the vending machine
        for (Product product : vendingMachine.getAssortmentList()) {
            System.out.println(product);
        }

        // Replenish the balance by adding 100 coins
        int coinsToAdd = 500;
        vendingMachine.getHolder().addCoinsToBalance(coinsToAdd);

        // Specify the path to the icon folder
        String iconFolderPath = "C:\\GIT\\OOPGr4580\\Sem1\\src\\main\\java\\Icons";

        // Create and initialize the main frame
        MainFrame mainFrame = new MainFrame(vendingMachine, iconFolderPath);
        mainFrame.initialize();
    }
}
