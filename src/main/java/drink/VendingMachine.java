package main.java.drink;

public interface VendingMachine {
    HotDrink getProduct(String name, int volume, int temperature);
}
