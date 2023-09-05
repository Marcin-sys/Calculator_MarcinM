package calculator.factory;


public class CalculatorService {
    private UserInputProvider input = new UserInputProvider();
    private final CalculatorFactory calculatorFactory = new CalculatorFactory();
    private SystemPrinter systemPrinter = new TextPrinter();

    public CalculatorService(UserInputProvider input,SystemPrinter systemPrinter) {
        this.input = input;
        this.systemPrinter = systemPrinter;

    }

    public CalculatorService() {
    }

    public void calculatorMenu() {
        int choiceFirstInteger;
        String choiceSymbolString;
        int choiceSecondInteger;
        float result;

        try {
            System.out.println("Write first number to calculator, number must be Integer");
            choiceFirstInteger = input.getValidFirstIntInput();
            System.out.println("First number is: " + choiceFirstInteger);

            System.out.println("Choose symbol for calculating:");
            choiceSymbolString = input.getValidSymbolInput();
            System.out.println("symbol is: " + choiceSymbolString);

            System.out.println("Write second number to calculator, number must be Integer");
            choiceSecondInteger = input.getValidSecondIntInput(choiceSymbolString);
            System.out.println("Second number is: " + choiceSecondInteger);

            result = calculatorFactory.calculatorFactory(choiceFirstInteger, choiceSymbolString, choiceSecondInteger);

            systemPrinter.printString(choiceFirstInteger + choiceSymbolString +
                    choiceSecondInteger + "= " + result);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
