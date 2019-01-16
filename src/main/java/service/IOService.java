package service;

import data.Coin;
import data.Product;

import java.util.Map;
import java.util.Scanner;

public class IOService {

    public void displayProductStock(Map<Product, Integer> products) {
        System.out.println();
        System.out.println("↓ Hello and welcome to my Vending Machine! Please select what you wish to buy from the menu: ↓");
        System.out.println();
        for (Product product : products.keySet()) {
            System.out.println("-------------------------------------------------------------");
            System.out.println("\uD83D\uDC49 Type '" + product.getCode() + "'| " + "For '" + product.getName() + " " + " " + product.getSize() + "' Product price -> " + product.getPrice());
        }
        System.out.println("-------------------------------------------------------------" + "\n");

    }

    public void displayMeniuMessage() {

        Scanner scanner = new Scanner(System.in);
        int code;
        do {
            System.out.println("Please select a valid product code from the menu!");
            while (!scanner.hasNextInt()) {
                System.out.println("I am sorry, that is not a valid code from the menu. Please select again!");
                scanner.next();
            }
            code = scanner.nextInt();
        }
        while (code != 121 && code != 122 && code != 123 && code != 124 && code != 125 && code != 126);

        System.out.println("You chose the product with the code '" + code + "' ");
    }


    public void displayCoinStock(Map<Coin, Integer> coins) {
        System.out.println("\n" + "Please insert the amount of money \uD83D\uDCB5 for your selection using the specified codes!");
        for (Coin coin : coins.keySet()) {
            System.out.println("Insert -> '" + coin.getCode() + "' " + " for a value of -> " + coin.getValue());
        }

    }

    public void displayCoinMessage() {
        Scanner scanner = new Scanner(System.in);
        int coinCode;
        do {
            System.out.println("Please insert the amount of money \uD83D\uDCB5 for your selection using the specified codes!" + "\n" + "___________________________________________________________");
            while (!scanner.hasNextInt()) {
                System.out.println("I am sorry, this money is not supported! Please try again!");
                scanner.next();
            }
            coinCode = scanner.nextInt();
        }
        while (coinCode != 10 && coinCode != 5 && coinCode != 1);


    }

}




