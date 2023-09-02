package calculator.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorFactoryTest {

    @Test
    void calculatorFactory() {
        int firstInteger = 10;
        String symbol = "/";
        int secondInteger = 5;
        Float expected = 2F;
        assertEquals(expected, new CalculatorFactory().calculatorFactory(firstInteger, symbol, secondInteger));

    }
}