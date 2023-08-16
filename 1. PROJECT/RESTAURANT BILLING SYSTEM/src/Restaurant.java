import java.io.*;
import java.util.*;

public class Restaurant {
    private static Scanner scanner = new Scanner(System.in);  // Scanner class is static, because with 1 declaration of Scanner class it can be used in every method including main() method.
    private static Order order = new Order();  // Order constructor is static, because with 1 declaration of Order constructor it can be used in every method including main() method.

    public static void main(String[] args) {

//        Here File is created, written and read to show the welcome message of the restaurant.
        File file = new File("FOODIES' STATION.txt");
        try {
            FileWriter welcomeNote = new FileWriter("FOODIES' STATION.txt");
            welcomeNote.write("\n\n==========WELCOME TO \"FOODIES' STATION\"==========\n\n\n");
            welcomeNote.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        boolean exit = false;

        while (!exit) {
            System.out.println("----PLEASE SELECT YOUR CHOICE----");
            System.out.println("""
                    1) Display Menu
                    2) Order Food Item
                    3) Cancel Food Item
                    4) Display Order Items
                    5) Generate Receipt
                    6) Exit
                    """);

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character.

            switch (choice) {
                case 1 -> new Menu();  // Call the Menu class by creating constructor.
                case 2 -> orderFoodItem();
                case 3 -> cancelFoodItem();
                case 4 -> displayOrderItems();
                case 5 -> generateReceipt();
                case 6 -> exit = true;
                default -> System.out.println("Invalid choice. Please try again.");
            }

            System.out.println();
        }

        System.out.println("==========THANKS FOR VISITING \"FOODIES' STATION\"==========");
    }

//    This method is for Order Food Items.
    private static void orderFoodItem() {
        System.out.print("\nEnter item number: ");
        String name = scanner.nextLine();

        System.out.print("Enter item price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter item quantity: ");
        int quantity = scanner.nextInt();

        Item item = new Item(name, price, quantity);
        order.addItem(item);

        System.out.println("Item added to order.");
    }

//    This method is for Cancel Food Items.
    private static void cancelFoodItem() {
        if (order.getItems().isEmpty()) {
            System.out.println("\nNo items in the order.");
            return;
        }

        displayOrderItems();

        System.out.print("\nEnter the index of the item to remove (Note- The index is start form 0. So order 1 means 0 index.) : ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (index < 0 || index >= order.getItems().size()) {
            System.out.println("Invalid index.");
            return;
        }

        Item removedItem = order.getItems().remove(index);
        System.out.println(removedItem.getName() + " removed from the order.");
    }

//    This method is for Display Ordered Items.
    private static void displayOrderItems() {
        ArrayList<Item> items = order.getItems();

        if (order.getItems().isEmpty()) {
            System.out.println("\nNo items in the order.");
            return;
        }

        System.out.println("\nItems in the order:");
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            System.out.println((i + 1) + ". " + item.getName() + "..........Tk. " + item.getPrice() + "/- (BDT)" + " x " + item.getQuantity());
        }
    }

//    This method is for Generate Receipt.
    private static void generateReceipt() {
        if (order.getItems().isEmpty()) {
            System.out.println("No items in the order.");
            return;
        }

        System.out.println("\n===RECEIPT===");
        System.out.println("--------------------------------------------");
        displayOrderItems();
        System.out.println("\n--------------------------------------------");
        System.out.println("NET TOTAL:              Tk. " + order.calculateTotal() + "/- (BDT)");
        System.out.println("VAt @9%:                Tk. " + (order.calculateVat()) + "/- (BDT)");
        System.out.println("\n--------------------------------------------");
        System.out.println("GRAND TOTAL:            Tk. " + (order.calculateTotal() + order.calculateVat()) + "/- (BDT)");
        System.out.println("--------------------------------------------\n");

        order = new Order(); // Create a new order for the next customer
    }


}

