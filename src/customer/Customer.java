package customer;

import cart.ShoppingCart;

public class Customer {
    private String name;
    private ShoppingCart cart = new ShoppingCart();

    public Customer(String name) {
        this.name = name;
    }

    public ShoppingCart getCart() {
        return cart;
    }
}
