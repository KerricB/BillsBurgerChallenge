public class DeluxeBurger extends Burger {  // This subclass serves as example of method overriding

    // This adds the extra topping slots solely for Deluxe Burger
    private String[] deluxeToppings = new String [5];
    private int toppingCount = 0;

    // This sets the type and base price of the burger
    public DeluxeBurger() {
        super("Deluxe", 10.00);
    }

    // This stores topping name, ignores price, and Limits to 5 toppings
    @Override
    public boolean addTopping(String name, double price) {
        if (toppingCount < deluxeToppings.length) {
            deluxeToppings[toppingCount++] = name;
            return true;
        }
        return false;
    }

    // This overrides getTotalPrice to always return $10
    @Override
    public double getTotalPrice() {
        return 10.00;
    }

    // This overrides printItem to show toppings with $0 cost
    @Override
    public void printItem() {
        System.out.println("Deluxe burger: $10.0");
        for (String topping : deluxeToppings) {
            if (topping != null) {
                System.out.println(" + " + topping + ": $0.00");
            }
        }
    }
}
