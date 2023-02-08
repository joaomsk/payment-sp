public class Order {

    private final String customer;
    private final Items[] items;
    private final double total;

    public Order(String customer, Items[] items, PaymentStrategy paymentStrategy) {
        this.customer = customer;
        this.items = items;
        this.total = getPaymentStrategy(paymentStrategy);
    }

    public String getCustomer() {
        return customer;
    }

    public Items[] getItems() {
        return items;
    }

    public double getTotal() {
        return total;
    }

    private double getPaymentStrategy(PaymentStrategy paymentStrategy) {
        return paymentStrategy.pay(calculateTotal());
    }

    private double calculateTotal() {
        double total = 0;
        for (Items item : items) {
            total += item.quantity() * item.unitPrice();
        }
        return total;
    }
}
