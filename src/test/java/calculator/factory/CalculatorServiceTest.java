package calculator.factory;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

class CalculatorServiceTest { //TODO

    @Test
    void calculatorMenu() {

        UserInputProvider input = Mockito.mock(UserInputProvider.class);
        SystemPrinter systemPrinter = Mockito.mock(SystemPrinter.class);

        String choiceSymbolString = "+";

        Mockito.when(input.getValidFirstIntInput(Mockito.any())).thenReturn(2);
        Mockito.when(input.getValidSymbolInput(Mockito.any())).thenReturn(choiceSymbolString);
        Mockito.when(input.getValidSecondIntInput(Mockito.any(), Mockito.any())).thenReturn(2);

        CalculatorService calculatorService = new CalculatorService(input, systemPrinter);

        calculatorService.calculatorMenu();

//        String expected = "2+2= 4.0";

        Mockito.verify(systemPrinter).printString(Mockito.any());

    }
}