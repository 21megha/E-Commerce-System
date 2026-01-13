import products.*;
import cart.*;
import orders.*;
import customer.*;

import java.util.Scanner;

public class ECommerceSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Customer
        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();
        Customer customer = new Customer(customerName);
        ShoppingCart cart = customer.getCart();

        boolean exit = false;

        while (!exit) {
            System.out.println("\n==== E-COMMERCE MENU ====");
            System.out.println("1. Add Electronics Product");
            System.out.println("2. Add Clothing Product");
            System.out.println("3. Add Book Product");
            System.out.println("4. View Cart");
            System.out.println("5. Place Order");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: // Electronics
                    System.out.print("Product ID: ");
                    String eId = sc.nextLine();
                    System.out.print("Name: ");
                    String eName = sc.nextLine();
                    System.out.print("Price: ");
                    double ePrice = sc.nextDouble();
                    System.out.print("Stock Quantity: ");
                    int eStock = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Brand: ");
                    String brand = sc.nextLine();
                    System.out.print("Warranty (months): ");
                    int warranty = sc.nextInt();
                    System.out.print("Quantity to add: ");
                    int eQty = sc.nextInt();

                    Product electronics = new ElectronicsProduct(
                            eId, eName, ePrice, "Electronics Item",
                            eStock, brand, warranty);

                    cart.addItem(electronics, eQty);
                    System.out.println("Electronics product added to cart.");
                    break;

                case 2: // Clothing
                    sc.nextLine();
                    System.out.print("Product ID: ");
                    String cId = sc.nextLine();
                    System.out.print("Name: ");
                    String cName = sc.nextLine();
                    System.out.print("Price: ");
                    double cPrice = sc.nextDouble();
                    System.out.print("Stock Quantity: ");
                    int cStock = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Size: ");
                    String size = sc.nextLine();
                    System.out.print("Color: ");
                    String color = sc.nextLine();
                    System.out.print("Quantity to add: ");
                    int cQty = sc.nextInt();

                    Product clothing = new ClothingProduct(
                            cId, cName, cPrice, "Clothing Item",
                            cStock, size, color);

                    cart.addItem(clothing, cQty);
                    System.out.println("Clothing product added to cart.");
                    break;

                case 3: // Book
                    sc.nextLine();
                    System.out.print("Product ID: ");
                    String bId = sc.nextLine();
                    System.out.print("Name: ");
                    String bName = sc.nextLine();
                    System.out.print("Price: ");
                    double bPrice = sc.nextDouble();
                    System.out.print("Stock Quantity: ");
                    int bStock = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Author: ");
                    String author = sc.nextLine();
                    System.out.print("Quantity to add: ");
                    int bQty = sc.nextInt();

                    Product book = new BookProduct(
                            bId, bName, bPrice, "Book Item",
                            bStock, author);

                    cart.addItem(book, bQty);
                    System.out.println("Book added to cart.");
                    break;

                case 4:
                    cart.displayCart();
                    break;

                case 5:
                    OrderManager manager = new OrderManager();
                    manager.placeOrder(cart);
                    exit = true;
                    break;

                case 6:
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        sc.close();
        System.out.println("Thank you for shopping!");
    }
}
