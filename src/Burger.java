public class Burger {

    // Basic Fields
    private String type;
    private double basePrice;
    private String[] toppings = new String[3];
    private double[] toppingPrices = new double[3];

    // Constructor
    public Burger(String type, double basePrice) {
        this.type = type;
        this.basePrice = basePrice;
    }

    // Topping Logic
    public boolean addTopping(String name, double price) {
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] == null) {      // We check the first null slot and fill it
                toppings[i] = name;
                toppingPrices[i] = price;   // If all 3 filled, we return false (caller could handle this or ignore)
                return true;
            }
        }

        return false; // Already full
    }

    // Price Calculator
    public double getTotalPrice() {
        double total = basePrice;
        for (double price : toppingPrices) {
            total += price;
        }
        return total;
    }

    // Print Method
    public void printItem() {
        System.out.println(type + " burger: $" + basePrice);
        for (int i = 0; i < toppings.length; i++) {
            if (toppings[i] != null) {
                System.out.println(" +" + toppings[i] + ": $" + toppingPrices[i]);
            }
        }
    }
}


