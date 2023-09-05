import calculator.factory.CalculatorService;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        System.out.println("Welcome in calculator");
        new CalculatorService().calculatorMenu();
        System.out.println("Calculator ended");
    }

}
