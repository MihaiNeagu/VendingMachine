package service;

import data.Coin;
import data.Product;

import java.util.Map;
import java.util.Scanner;

import static data.CurrencyType.RON;

public class IOService {


    public void displayProductStock(Map<Product, Integer> products) {
        System.out.println();
        System.out.println("↓ Hello and welcome to my Vending Machine! Please select what you wish to buy from the menu: ↓");
        System.out.println();
        for (Product product : products.keySet()) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("\uD83D\uDC49 Type '" + product.getCode() + "'| " + "For '" + product.getName() + " " + " " + product.getSize() + "' Product price -> " + product.getPrice() + RON);
        }
        System.out.println("-------------------------------------------------------------" + "\n");

    }


    public Integer validateProductCode(Map<Product, Integer> products) {

        Scanner scanner = new Scanner(System.in);
        Integer selectedProduct;
        do {
            System.out.println("Please select a valid product code from the menu!");
            while (!scanner.hasNextInt()) {
                System.out.println("I am sorry, that is not a valid code from the menu. Please select again!");
//                scanner.next();
            }
            selectedProduct = scanner.nextInt();
        }
        while (selectedProduct != 121 && selectedProduct != 122 && selectedProduct != 123 && selectedProduct != 124 && selectedProduct != 125 && selectedProduct != 126);
        return null;
    }


    public void productManager(Map<Product, Integer> products) {
        for (Product product : products.keySet()) {
            validateProductCode(products);
            if (validateProductCode(products) == product.getCode()) {
                System.out.println("You chose the code " + validateProductCode(products) + " that will give you a " + product.getName());
                System.out.println("The price of " + product.getName() + " is " + product.getPrice() + RON);
                Integer availableStock = products.get(product);
                System.out.println("There are available " + availableStock + " pcs of " + product.getName() + " available!");
                if (availableStock == 0) {
                    System.out.println("please chose another product!");
                }
            }

        }
    }


    public void displayCoinStock(Map<Coin, Integer> coins) {
        System.out.println("\n" + "Please insert the amount of money \uD83D\uDCB5 for your selection using the specified codes!");
        for (Coin coin : coins.keySet()) {
            System.out.println("Insert -> '" + coin.getCode() + "' " + " for a value of -> " + coin.getValue() + RON);
        }

    }


    public Integer validCoinMessage(Map<Coin, Integer> coins, Map<Product, Integer> products) {
        Scanner scanner = new Scanner(System.in);
        Integer coinCode;
        do {
            System.out.println("Please insert the amount of money \uD83D\uDCB5 for your selection using the specified codes!" + "\n" + "___________________________________________________________");
            while (!scanner.hasNextInt()) {
                System.out.println("I am sorry, this money is not supported! Please try again!");
                scanner.next();
            }
            coinCode = scanner.nextInt();

        }
        while (coinCode != 10 && coinCode != 5 && coinCode != 1);

        return null;
    }


    public void moneyManager(Map<Coin, Integer> coins, Map<Product, Integer> products) {
        for (Coin coin : coins.keySet())
            for (Product product : products.keySet()) {
                validCoinMessage(coins, products);
                if (validCoinMessage(coins, products) < product.getPrice()) {
                    Integer productDifferenceToPay = product.getPrice() - coin.getValue();
                    System.out.println("Please insert " + productDifferenceToPay + " " + RON + " to have sufficient fonds for " + product.getName());

                }
                if (coin.getValue() > product.getPrice()) {
                    Integer restToPay = coin.getCode() - product.getPrice();
                    System.out.println("The price of " + product.getName() + " is " + product.getPrice() + " " + RON + ". ");
                    System.out.println("Here is your change of " + restToPay + " " + RON + "!");
                    validCoinMessage(coins, products);
                }
            }
//        return null;
    }

}



