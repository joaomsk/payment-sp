import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OrderTest {

    @Test
    void mustCreateAnOrder_and_validateIfTotalIsCorrect() {
        // Arrange
        Order order = new Order("João Meleski", new Items[] {
                new Items("Item 1", 1, 10),
                new Items("Item 2", 2, 20),
                new Items("Item 3", 3, 30)
        }, PaymentTypeEnum.CASH);

        // Act
        double total = order.getTotal();

        // Assert
        assertEquals(140, total);
    }

    @Test
    void mustCreateAnInstance_of_Order() {
        // Arrange
        Order order = new Order("João Meleski", new Items[] {
                new Items("Item 1", 1, 10),
                new Items("Item 2", 2, 20),
                new Items("Item 3", 3, 30)
        }, PaymentTypeEnum.CASH);

        // Act
        String name = order.getCustomer();
        int itemsCount = order.getItems().length;

        // Assert
        assertEquals("João Meleski", name);
        assertEquals(3, itemsCount);
    }
}
