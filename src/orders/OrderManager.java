package orders;

import cart.ShoppingCart;

public class OrderManager {
    public void placeOrder(ShoppingCart cart) {
        Order order = new Order(cart);
        order.displayOrder();
    }
}
