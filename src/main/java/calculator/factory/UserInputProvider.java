package calculator.factory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class UserInputProvider {

    public int getValidIntInput(Scanner scanner) {
        Integer intResult;

        while (!scanner.hasNextInt()) {
            System.out.println("Invalid value, must be a integer value");
            scanner.next();
        }
        intResult = scanner.nextInt();
        return intResult;
    }

    public String getValidSymbolInput(Scanner scanner){
        String stringResult;

        List<String> symbolList = new ArrayList<>();
        symbolList.add("+");
        symbolList.add("-");
        symbolList.add("*");
        symbolList.add("/");


        while (!symbolList.contains(stringResult=scanner.next())) {
            System.out.println("Invalid symbol, " +
                    "please choose one of the symbol ");
            for (int i = 0; i < symbolList.size(); i++) {
                {
                    System.out.println(symbolList.get(i));
                }
            }
        }

        return stringResult;
    }

}