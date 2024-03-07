import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class RiderPaymentCalculatorTest {

    @Test
    public void testCalculatePayment() {
        int[] successfulDeliveries = {0, 5, 10, 15, 20};
        double[] expectedPayments = {10.0, 20.0, 30.0, 40.0, 50.0};

        for (int number  = 0; number < successfulDeliveries.length; number++) {
            double actualPayment = RiderPaymentCalculator.calculatePayment(successfulDeliveries[number]);

            actualPayment = Math.round(actualPayment * 100.00) / 100.00;
            assertEquals(expectedPayments[number], actualPayment);
        }
    }
}