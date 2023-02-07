public class CreditStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        return amount + 5;
    }
}