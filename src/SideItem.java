public class SideItem {
    private String name;
    private double price;

    // Constructors
    public SideItem() {
        this("Fries", 2.50);
    }

    public SideItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Will be used when calculating the total meal price
    public double getPrice() {
        return price;
    }

    // Helps when we print an itemized receipt
    public void printItem() {
        System.out.println(name + ": $" + price);
    }
}


