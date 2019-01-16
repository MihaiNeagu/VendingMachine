package VM;

import data.Coin;
import data.CurrencyType;
import data.Product;
import service.IOService;

import java.util.LinkedHashMap;
import java.util.Map;

import static data.CurrencyType.RON;

public class VendingMachine {

    private Map<Product, Integer> productStock = new LinkedHashMap<>();
    private Map<Coin, Integer> coinStock = new LinkedHashMap<>();
    private service.IOService ioService = new IOService();
    public CurrencyType currencyType = RON;


    public VendingMachine() {

        Product product = new Product(121, "Coca Cola", "3 lei", "500 ml");
        Product product1 = new Product(122, "Fante", "3 lei", "500 ml");
        Product product2 = new Product(123, "Dorna", "3 lei", "500 ml");
        Product product3 = new Product(124, "Borsec", "2 lei", "500 ml");
        Product product4 = new Product(125, "Aloe Vera", "5 lei", "500 ml");
        Product product5 = new Product(126, "Suc de cactus ☺", "10 lei", "500 ml");


        productStock.put(product, 4);
        productStock.put(product1, 2);
        productStock.put(product2, 0);
        productStock.put(product3, 1);
        productStock.put(product4, 5);
        productStock.put(product5, 7);


        Coin coin = new Coin(10, " 10 lei");
        Coin coin1 = new Coin(5, " 5 lei");
        Coin coin2 = new Coin(1, " 1 lei");

        coinStock.put(coin, 2);
        coinStock.put(coin1, 5);
        coinStock.put(coin2, 12);


    }


    public void run() {

        ioService.displayProductStock(productStock);
        ioService.displayMeniuMessage();
        ioService.displayCoinStock(coinStock);
        ioService.displayCoinMessage();
    }

}
