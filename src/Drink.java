public class Drink {

    // Fields (encapsulation)
    private String type;
    private String size;
    private double price;

    // Default constructor
    public Drink() {
        this("Coke", "Small");
    }

    // Constructor with parameters
    public Drink(String type, String size) {
        this.type = type;
        setSize(size); // Sets price based on size
    }

    // Set size and assign price
    public void setSize(String size) {
        this.size = size;
        switch (size.toLowerCase()) {
            case "small" -> this.price = 1.00;
            case "medium" -> this.price = 1.50;
            case "large" -> this.price = 2.00;
            default -> this.price = 1.00;
        }
    }

    public double getPrice() {
        return price;
    }

    public void printItem() {
        System.out.println(type + " (" + size + "): $" + price);
    }
}
