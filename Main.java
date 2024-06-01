public class Main {
    public static void main(String[] args) {
        HotDrinkWithTemperature tea = new HotDrinkWithTemperature("Tea", 200, 75);
        HotDrinkWithTemperature coffee = new HotDrinkWithTemperature("Coffee", 150, 85);

        HotDrinkVendingMachine vendingMachine = new HotDrinkVendingMachine();
        vendingMachine.addDrink(tea);
        vendingMachine.addDrink(coffee);

        HotDrink requestedDrink = vendingMachine.getProduct("Tea", 200, 75);
        if (requestedDrink != null) {
            System.out.println("Полученный напиток: " + requestedDrink);
        } else {
            System.out.println("Напиток не найден.");
        }

        requestedDrink = vendingMachine.getProduct("Coffee", 150, 85);
        if (requestedDrink != null) {
            System.out.println("Полученный напиток: " + requestedDrink);
        } else {
            System.out.println("Напиток не найден.");
        }
    }
}
