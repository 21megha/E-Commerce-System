package cart;

import products.Product;
import java.util.*;

public class ShoppingCart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(Product product, int quantity) {
        for (CartItem item : items) {
            if (item.getProduct().getId().equals(product.getId())) {
                item.setQuantity(item.getQuantity() + quantity);
                return;
            }
        }
        items.add(new CartItem(product, quantity));
    }

    public double getTotalAmount() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getItemTotal();
        }
        return total;
    }

    public void displayCart() {
        System.out.println("\n--- Shopping Cart ---");
        for (CartItem item : items) {
            System.out.println(item.getProduct().getName() +
                    " x " + item.getQuantity() +
                    " = ₹" + item.getItemTotal());
        }
        System.out.println("Cart Total: ₹" + getTotalAmount());
    }
}
