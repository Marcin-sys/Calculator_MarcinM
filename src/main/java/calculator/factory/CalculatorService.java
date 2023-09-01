package calculator.factory;

import java.util.Scanner;

public class CalculatorService {
    private UserInputProvider input = new UserInputProvider();

    private final SystemPrinter systemPrinter = new TextPrinter();

    public CalculatorService(UserInputProvider input) {
        this.input = input;
    }

    public CalculatorService() {
    }

    public void calculatorMenu() {
        int choiceFirstInteger;
        String choiceSymbolString;
        int choiceSecondInteger;
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Write first number to calculator, number must be Integer");
            choiceFirstInteger = input.getValidIntInput(sc);
            System.out.println("number is: " + choiceFirstInteger);

            System.out.println("Choose symbol for calculating:");
            choiceSymbolString = input.getValidSymbolInput(sc);
            System.out.println("symbol is: " + choiceSymbolString);

            System.out.println("Write first number to calculator, number must be Integer");
            choiceSecondInteger = input.getValidIntInput(sc);
            System.out.println("number is: " + choiceSecondInteger);



            System.out.println(choiceFirstInteger + choiceSymbolString + choiceSecondInteger);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
