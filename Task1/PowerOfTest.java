import org.junit.Assert;
import org.junit.Test;

public class PowerOfTests {

    @Test
    public void shouldReturnCorrectResult_PositiveNumberAndPowerNill() {

        int number = 9;
        int power = 0;
        int expected = 1;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectResult_PositiveNumberAndPositivePower() {

        int number = 2;
        int power = 4;
        int expected = 16;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectResult_NegativeNumberAndPositivePower() {
        int number = -3;
        int power = 3;
        int expected = -27;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectResult_NumberNillAndPositivePower() {
        int number = 0;
        int power = 5;
        int expected = 0;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectResult_NumberNillAndPowerNill() {
        int number = 0;
        int power = 0;
        int expected = 1;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void shouldReturnCorrectResult_PositiveNumberAndNagativePower() {
        int number = 1;
        int power = -3;

        ArithmeticException exception = Assert.assertThrows(ArithmeticException.class, () -> {
            PowerOf.powerOf(number, power);
        });
        Assert.assertEquals("Power cannot be negative", exception.getMessage());
    }
}