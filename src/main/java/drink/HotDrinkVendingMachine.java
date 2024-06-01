package main.java.drink;
import java.util.ArrayList;
import java.util.List;

public class HotDrinkVendingMachine implements VendingMachine {
    private List<HotDrinkWithTemperature> drinks;

    public HotDrinkVendingMachine() {
        this.drinks = new ArrayList<>();
    }

    public void addDrink(HotDrinkWithTemperature drink) {
        drinks.add(drink);
    }

    @Override
    public HotDrink getProduct(String name, int volume, int temperature) {
        for (HotDrinkWithTemperature drink : drinks) {
            if (drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemperature() == temperature) {
                return drink;
            }
        }
        return null;
    }
}
