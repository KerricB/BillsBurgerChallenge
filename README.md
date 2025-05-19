# 🍔 Meal Order Challenge Breakdown

A Java Object-Oriented Programming Master Challenge  
Author: Kerric B

---

## 📌 Overview

This application was built as part of a hands-on Object-Oriented Programming (OOP) master challenge. It simulates a fast food restaurant system that allows ordering meals composed of:

- A burger (regular or deluxe)
- A drink (with type and size)
- A side item (customizable)

The goal was to apply **core OOP principles**:
- Encapsulation
- Inheritance
- Composition
- Constructor Overloading
- Method Overriding

---

## 🧩 Challenge Requirements & Implementation

### 1. 🥤 Drink Class

**Requirement:**  
Drink must include a `type`, `size`, and a `price` based on size.

**Implementation:**
- `Drink` class with:
  - `type`, `size`, `price`
- Constructor overloads for default & custom drinks
- `setSize()` adjusts price automatically
- `printItem()` for receipt display

---

### 2. 🍟 SideItem Class

**Requirement:**  
Side item must include a `name` and `price`, with a default option (e.g., fries).

**Implementation:**
- `SideItem` class with:
  - `name`, `price`
- Default constructor returns `"Fries"` at `$2.50`
- `printItem()` for receipt output

---

### 3. 🍔 Burger Class

**Requirement:**  
Each burger includes a `type`, `basePrice`, and up to **3 toppings** with prices.

**Implementation:**
- `Burger` class with:
  - `type`, `basePrice`, arrays for toppings and toppingPrices
- `addTopping()` method (max 3)
- `getTotalPrice()` sums base + toppings
- `printItem()` itemizes the burger

---

### 4. 👑 DeluxeBurger (Subclass)

**Requirement:**  
Deluxe burgers have a **fixed price** and allow up to **5 free toppings**.

**Implementation:**
- `DeluxeBurger` extends `Burger`
- Overrides:
  - `addTopping()` (ignores price)
  - `getTotalPrice()` → always returns `$10.00`
  - `printItem()` → toppings shown with `$0.00` cost

---

### 5. 🍽️ MealOrder Class

**Requirement:**  
A meal must include:
- One burger
- One drink
- One side item

Must support:
- Default meal via no-arg constructor
- Custom meal via overloaded constructor
- Topping and size customization
- Receipt printing and total calculation

**Implementation:**
- `MealOrder` composed of `Burger`, `Drink`, `SideItem`
- `addBurgerTopping()` → delegates to burger
- `setDrinkSize()` → updates drink
- `printItemizedReceipt()` → itemizes meal
- `getTotalPrice()` → sums up all components

---

## 🧪 Test Scenarios

Tested using `Main.java` with three scenarios:

### 1. Default Meal
- Regular Burger
- Small Coke
- Fries

### 2. Custom Meal
- Chicken Burger + 3 toppings
- Pepsi (Large → changed to Medium)
- Onion Rings

### 3. Deluxe Meal
- Deluxe Burger with 5 free toppings
- Root Beer (Large)
- Loaded Fries

Each meal prints:
- Itemized receipt
- Correct total

---

## 🧠 Core Java Concepts Demonstrated

- ✅ **Encapsulation** → Private fields + getters/setters
- ✅ **Inheritance** → `DeluxeBurger extends Burger`
- ✅ **Composition** → `MealOrder` contains other classes
- ✅ **Method Overriding** → `DeluxeBurger` custom logic
- ✅ **Constructor Overloading** → Flexible creation patterns

---

## 🪞 Reflection

This challenge was a valuable hands-on application of object-oriented principles in Java. It reinforced:

- Class design for real-world domains
- Clean separation of responsibilities
- How inheritance and overriding simplify extensions

The system is modular and easy to expand (e.g., with a GUI, discounts, or more meal types). It also represents a solid foundation for understanding larger-scale Java projects.

---

**Thanks for reviewing!**
