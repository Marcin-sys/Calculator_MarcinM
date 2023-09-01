package calculator.factory;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;
class UserInputProviderTest {

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
        String data = "/";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        String expected = "/";
        assertEquals(expected, new UserInputProvider().getValidSymbolInput(scanner));
    }

    @Test
    void getValidSecondIntInput() {
        String data = "5";
        String symbol = "+";
        ByteArrayInputStream in = new ByteArrayInputStream(data.getBytes());
        System.setIn(in);
        Scanner scanner = new Scanner(System.in);
        Integer expected = 5;
        assertEquals(expected, new UserInputProvider().getValidSecondIntInput(scanner,symbol));
    }
}