import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentStrategyTest {
    @Test
    void mustInstanceOrder_andVerify_ifTotalIsCorrect_forCreditStrategy() {
        // Arrange
        Order order = new Order("João Meleski", new Items[] {
                new Items("Item 1", 1, 10),
                new Items("Item 2", 2, 20),
                new Items("Item 3", 3, 30)
        }, new CreditStrategy());

        // Act
        double total = order.getTotal();

        // Assert
        assertEquals(145, total);
    }

    @Test
    void mustInstanceOrder_andVerify_ifTotalIsCorrect_forCashStrategy() {
        // Arrange
        Order order = new Order("João Meleski", new Items[] {
                new Items("Item 1", 1, 10),
                new Items("Item 2", 2, 20),
                new Items("Item 3", 3, 30)
        }, new CashStrategy());

        // Act
        double total = order.getTotal();

        // Assert
        assertEquals(140, total);
    }

    @Test
    void mustInstanceOrder_andVerify_ifTotalIsCorrect_forDebitStrategy() {
        // Arrange
        Order order = new Order("João Meleski", new Items[] {
                new Items("Item 1", 1, 10),
                new Items("Item 2", 2, 20),
                new Items("Item 3", 3, 30)
        }, new DebitStrategy());

        // Act
        double total = order.getTotal();

        // Assert
        assertEquals(143.0, total);
    }
}
