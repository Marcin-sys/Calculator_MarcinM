package calculator.factory;

import java.util.Objects;

public class CalculatorFactory {

    public Float calculatorFactory(int firstInteger, String symbol, int secondInteger) {
        float result = 0;

        if (Objects.equals(symbol, "+")) {
            result = firstInteger + secondInteger;
        } else if (Objects.equals(symbol, "-")) {
            result = firstInteger + secondInteger;
        } else if (Objects.equals(symbol, "*")) {
            result = firstInteger * secondInteger;
        } else {
            result = (float) firstInteger / secondInteger;
        }

        return result;
    }
}
