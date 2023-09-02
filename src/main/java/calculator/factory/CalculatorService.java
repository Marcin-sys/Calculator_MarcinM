package calculator.factory;

import java.util.Scanner;

public class CalculatorService {
    private UserInputProvider input = new UserInputProvider();
    private final CalculatorFactory calculatorFactory = new CalculatorFactory();
    private final SystemPrinter systemPrinter = new TextPrinter();

    public CalculatorService(UserInputProvider input) {         //for testing
        this.input = input;
    }

    public CalculatorService() {
    }

    public void calculatorMenu() {
        int choiceFirstInteger;
        String choiceSymbolString;
        int choiceSecondInteger;
        float result;

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Write first number to calculator, number must be Integer");
            choiceFirstInteger = input.getValidFirstIntInput(sc);
            System.out.println("First number is: " + choiceFirstInteger);

            System.out.println("Choose symbol for calculating:");
            choiceSymbolString = input.getValidSymbolInput(sc);
            System.out.println("symbol is: " + choiceSymbolString);

            System.out.println("Write second number to calculator, number must be Integer");
            choiceSecondInteger = input.getValidSecondIntInput(sc, choiceSymbolString);
            System.out.println("Second number is: " + choiceSecondInteger);

            result = calculatorFactory.calculatorFactory(choiceFirstInteger, choiceSymbolString, choiceSecondInteger);

            systemPrinter.printString(choiceFirstInteger + choiceSymbolString +
                    choiceSecondInteger + "= " + result);


        } catch (Exception e) {
            e.printStackTrace();  //TODO
        }
    }
}
