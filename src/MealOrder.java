public class MealOrder {

    private Burger burger;
    private Drink drink;
    private SideItem sideItem;

    // Default Meal (Default Constructor, gives us the "Most common" meal)
    public MealOrder() {
        this(new Burger("Regular", 5.00), new Drink(), new SideItem());
    }

    // Custom Meal (Overloaded Constructor allows flexibility)
    public MealOrder(Burger burger, Drink drink, SideItem sideItem) {
        this.burger = burger;
        this.drink = drink;
        this.sideItem = sideItem;
    }

    // Add Convenience Methods

    public void addBurgerTopping(String name, double price) {
        burger.addTopping(name, price);
    }

    public void setDrinkSize(String size) {
        drink.setSize(size);
    }

    // Print Itemized Receipt
    public void printItemizedReceipt() {
        System.out.println("==== MEAL ORDER ====");
        burger.printItem();
        drink.printItem();
        sideItem.printItem();
        System.out.printf("TOTAL: $%.2f\n", getTotalPrice());
        System.out.println("====================");
    }

    // Total Price Method
    public double getTotalPrice() {
        return burger.getTotalPrice() + drink.getPrice() + sideItem.getPrice();
    }
}
