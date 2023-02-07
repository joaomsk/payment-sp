public class DebitStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        return amount + 3;
    }
}
