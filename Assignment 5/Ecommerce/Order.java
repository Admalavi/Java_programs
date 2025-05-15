package Ecommerce;

public class Order {
    private Product product;
    private Customer customer;
    private int quantity;

    public Order(Product product, Customer customer, int quantity) {
        this.product = product;
        this.customer = customer;
        this.quantity = quantity;
    }

    public void placeOrder() {
        System.out.println("Placing Order...");
        customer.displayCustomerDetails();
        product.displayProductDetails();
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: ₹" + calculateTotalCost());
    }

    public double calculateTotalCost() {
        return product.getPrice() * quantity;
    }
}