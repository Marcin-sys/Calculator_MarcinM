package calculator.factory;

import org.junit.jupiter.api.Test;

import java.util.Scanner;

import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.*;

class UserInputProviderTest {
    @Test
    void getValidFirstIntInputSuccessfulPath() {

        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.hasNextInt()).thenReturn(true);
        Mockito.when(mockScanner.nextInt()).thenReturn(4);

        Integer expected = 4;
        assertEquals(expected, new UserInputProvider(mockScanner).getValidFirstIntInput());
    }

    @Test
    void getValidFirstIntInputWrongPathWhenInputIsIncorrect() {

        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.hasNextInt()).thenReturn(false, true);
        Mockito.when(mockScanner.nextInt()).thenReturn(3);

        Integer expected = 3;
        assertEquals(expected, new UserInputProvider(mockScanner).getValidFirstIntInput());
    }

    @Test
    void getValidSymbolInputSuccessfulPath() {
        String input = "/";
        String expected = "/";

        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.next()).thenReturn(input);

        assertEquals(expected, new UserInputProvider(mockScanner).getValidSymbolInput());

    }

    @Test
    void getValidSymbolInputWrongPathWhenInputIsString() {

        String input = "/";
        String wrongInput = "hfbeuiw";
        String expected = "/";

        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.next()).thenReturn(wrongInput, input);

        assertEquals(expected, new UserInputProvider(mockScanner).getValidSymbolInput());
    }

    @Test
    void getValidSecondIntInputSuccessfulPath() {
        String symbol = "+";

        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.hasNextInt()).thenReturn(true);
        Mockito.when(mockScanner.nextInt()).thenReturn(5);

        Integer expected = 5;
        assertEquals(expected, new UserInputProvider(mockScanner).getValidSecondIntInput(symbol));
    }

    @Test
    void getValidSecondIntInputWrongPathWhenInputIsZero() {
        String symbol = "/";

        Scanner mockScanner = Mockito.mock(Scanner.class);
        Mockito.when(mockScanner.hasNextInt()).thenReturn(false, true);
        Mockito.when(mockScanner.nextInt()).thenReturn(0, 1);

        int expected = 1;
        assertEquals(expected, new UserInputProvider(mockScanner).getValidSecondIntInput(symbol));
    }

}