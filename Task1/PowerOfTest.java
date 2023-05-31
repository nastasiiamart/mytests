import org.junit.Assert;
import org.junit.Test;

public class PowerOfTest {

    @Test
    public void testPositiveNumber_PowerNill() {

        int number = 9;
        int power = 0;
        int expected = 1;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testPositiveNumber_PositivePower() {

        int number = 2;
        int power = 4;
        int expected = 16;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNegativeNumber_PositivePower() {
        int number = -3;
        int power = 3;
        int expected = -27;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNumberNill_PositivePower() {
        int number = 0;
        int power = 5;
        int expected = 0;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }

    @Test
    public void testNumberNill_PowerNill() {
        int number = 0;
        int power = 0;
        int expected = 1;
        int result = PowerOf.powerOf(number, power);
        Assert.assertEquals(expected, result);
    }
}