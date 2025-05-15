import Ecommerce.Product;
import Ecommerce.Customer;
import Ecommerce.Order;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product(101, "Apple", 50.0);
        Customer c1 = new Customer(201, "Pragati");

        Order order1 = new Order(p1, c1, 3);
        order1.placeOrder();
    }
}