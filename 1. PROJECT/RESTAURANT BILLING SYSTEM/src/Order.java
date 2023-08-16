/* Here "Aggregation" concept is created with the Item class.
 This class is act as "Whole class".
 This class also has "Inheritance" and "Interface" concept of OOP.
 It "inherits Vat abstract class" and "implements Total interface".*/

import java.util.*;

public class Order extends Vat implements Total{

    private Item item;
    ArrayList<Item> items  = new ArrayList<>();

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (Item item : items) {
            total += item.getPrice() * item.getQuantity();
        }
        return total;
    }

    public double calculateVat(){
        return calculateTotal()*.09;
    }

}
