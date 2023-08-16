/* This class is used for Storing/Initialization order from the customers.
 Here "Aggregation" concept is created with the Order class.
 This class acts as "Part class".
 This class also has the "Encapsulation" concept of OOP.*/

public class Item {
//    Declaration of instance variables.
    private String name;
    private double price;
    private int quantity;

//    Constructor for set all the value.
    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

//    Here are getMethods() to get/return the value individually.
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
