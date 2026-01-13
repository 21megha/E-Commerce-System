package orders;

import cart.ShoppingCart;
import java.util.Date;

public class Order {
    private static int counter = 1001;
    private String orderId;
    private Date orderDate;
    private double finalAmount;

    public Order(ShoppingCart cart) {
        this.orderId = "ORD" + counter++;
        this.orderDate = new Date();
        this.finalAmount = cart.getTotalAmount() * 1.18;
    }

    public void displayOrder() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Date: " + orderDate);
        System.out.println("Final Amount (with GST): ₹" + finalAmount);
    }
}
