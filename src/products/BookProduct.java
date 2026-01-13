package products;

public class BookProduct extends Product {
    private String author;

    public BookProduct(String id, String name, double price, String description,
                       int stockQuantity, String author) {
        super(id, name, price, description, stockQuantity);
        this.author = author;
    }

    @Override
    public double calculateDiscount() {
        return price * 0.05;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Book");
        System.out.println("Author: " + author);
        System.out.println("--------------------------------");
    }
}
