public class CashStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        return amount;
    }
}
