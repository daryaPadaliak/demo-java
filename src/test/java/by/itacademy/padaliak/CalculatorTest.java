package by.itacademy.padaliak;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSumWithPositiveNumbers() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(9, calculator.calculateSum(4, 5));
    }

    @Test
    public void testSumWithNegativeNumbers() {
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-9, calculator.calculateSum(-4, -5));
    }

    @Test
    public void testCalculateMax(){
        Calculator calculator = new Calculator();
        int actualResult = calculator.calculateMax(10,12);
        int expectedResult = 12;
        Assertions.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void testCalculateEven(){
        Calculator calculator = new Calculator();
        boolean actualResult = calculator.isEven(12);
        Assertions.assertTrue(actualResult);
    }

    @Test
    public void testCalculateMin(){
        Calculator calculator = new Calculator();
        Assertions.assertEquals(-12, calculator.calculateMin(22,-12));
    }


}
