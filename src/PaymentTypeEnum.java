public enum PaymentTypeEnum {
    CASH(new CashStrategy()),
    CREDIT_CARD(new CreditStrategy()),
    DEBIT_CARD(new DebitStrategy());

    private final PaymentStrategy strategy;

    PaymentTypeEnum(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public PaymentStrategy getStrategy() {
        return strategy;
    }
}
