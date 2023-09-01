package calculator.factory;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class UserInputProviderTest {  //TODO

    @Test
    void getValidFirstIntInput() {
        String data = "4";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Integer expected = 4;
        assertEquals(expected, new UserInputProvider().getValidFirstIntInput(scanner));
    }

    @Test
    void getValidSymbolInput() {
    }

    @Test
    void getValidSecondIntInput() {
    }
}