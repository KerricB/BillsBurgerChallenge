public class Main {
    public static void main(String[] args) {

        System.out.println("Default Meal:");
        MealOrder defaultMeal = new MealOrder();
        defaultMeal.printItemizedReceipt();

        System.out.println("\nCustom Meal:");
        Burger customBurger = new Burger("Chicken", 6.50);
        MealOrder customMeal = new MealOrder(customBurger, new Drink("Pepsi", "Large"), new SideItem("Onion Rings", 3.25));
        customMeal.addBurgerTopping("Bacon", 1.00);
        customMeal.addBurgerTopping("Cheese", 0.75);
        customMeal.addBurgerTopping("Avocado", 1.25);
        customMeal.setDrinkSize("Medium");
        customMeal.printItemizedReceipt();

        System.out.println("\nDeluxe Meal:");
        MealOrder deluxeMeal = new MealOrder(new DeluxeBurger(), new Drink("Root Beer", "Large"), new SideItem("Loaded Fries", 4.00));
        deluxeMeal.addBurgerTopping("Lettuce", 0.00);
        deluxeMeal.addBurgerTopping("Tomato", 0.00);
        deluxeMeal.addBurgerTopping("Pickles", 0.00);
        deluxeMeal.addBurgerTopping("Bacon", 0.00);
        deluxeMeal.addBurgerTopping("Onion", 0.00);
        deluxeMeal.printItemizedReceipt();
    }
}
