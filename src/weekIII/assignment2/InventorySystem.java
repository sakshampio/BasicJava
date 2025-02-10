package weekIII.assignment2;

import java.util.ArrayList;
import java.util.Scanner;


public class InventorySystem {
    private static ArrayList<Item> inventory = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nInventory System");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Update Item");
            System.out.println("4. Display Inventory");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addItem();
                    break;
                case 2:
                    removeItem();
                    break;
                case 3:
                    updateItem();
                    break;
                case 4:
                    displayInventory();
                    break;
                case 5:
                    System.out.println("Exit");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private static void addItem() {
        System.out.print("Enter item name: ");
        String name = sc.nextLine();
        System.out.print("Enter item quant: ");
        int quantity = sc.nextInt();
        System.out.print("Enter item price: ");
        double price = sc.nextDouble();
        sc.nextLine();

        inventory.add(new Item(name, quantity, price));
        System.out.println("Item added.");
    }

    private static void removeItem() {
        System.out.print("Enter item name to remove: ");
        String name = sc.nextLine();
        for (Item item : inventory) {
            if (item.name.equalsIgnoreCase(name)) {
                inventory.remove(item);
                System.out.println("Item removed.");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void updateItem() {
        System.out.print("Enter item name to update: ");
        String name = sc.nextLine();
        for (Item item : inventory) {
            if (item.name.equalsIgnoreCase(name)) {
                System.out.print("Enter new quantity: ");
                int quantity = sc.nextInt();
                System.out.print("Enter new price: ");
                double price = sc.nextDouble();
                sc.nextLine();

                item.quantity = quantity;
                item.price = price;
                System.out.println("Item updated......");
                return;
            }
        }
        System.out.println("Item not found.");
    }

    private static void displayInventory() {
        if (inventory.isEmpty()) {
            System.out.println("Inventory is empty.");
        } else {
            System.out.println("Inventory: ");
            for (Item item : inventory) {
                System.out.println(item);
            }
        }
    }
}