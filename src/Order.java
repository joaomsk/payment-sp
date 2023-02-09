public class Order {

    private final String customer;
    private final Items[] items;
    private final PaymentTypeEnum paymentType;
    private final double total;

    public Order(String customer, Items[] items, PaymentTypeEnum paymentType) {
        this.customer = customer;
        this.items = items;
        this.paymentType = paymentType;
        this.total = getPaymentStrategy(paymentType.getStrategy());
    }

    public String getCustomer() {
        return customer;
    }

    public Items[] getItems() {
        return items;
    }

    public PaymentTypeEnum getPaymentType() {
        return paymentType;
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
