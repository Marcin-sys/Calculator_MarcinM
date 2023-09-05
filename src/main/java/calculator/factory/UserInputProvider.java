package calculator.factory;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UserInputProvider {

    private final Scanner scanner;


    public UserInputProvider() {
        this(new Scanner(System.in));
    }

    public UserInputProvider(Scanner scanner) {
        this.scanner = scanner;
    }

    public int getValidFirstIntInput() {
        int intResult;

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid value, must be a integer value");
            scanner.nextInt();
        }

        intResult = scanner.nextInt();
        return intResult;
    }

    public String getValidSymbolInput() {
        String stringResult;

        List<String> symbolList = new ArrayList<>();
        symbolList.add("+");
        symbolList.add("-");
        symbolList.add("*");
        symbolList.add("/");


        while (!symbolList.contains(stringResult = scanner.next())) {
            System.out.println("Invalid symbol, " +
                    "please choose one of the symbol ");
            for (String s : symbolList) {
                {
                    System.out.println(s);
                }
            }
        }

        return stringResult;
    }

    public int getValidSecondIntInput(String symbol) {
        int intSecondResult;

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid value, must be a integer value");
            scanner.nextInt();
        }
        intSecondResult = scanner.nextInt();
        if (Objects.equals(symbol, "/")) {
            while (intSecondResult == 0) {
                System.out.println("You can't divide by 0, choose another integer value");
                intSecondResult = scanner.nextInt();
            }
        }
        return intSecondResult;
    }
}
