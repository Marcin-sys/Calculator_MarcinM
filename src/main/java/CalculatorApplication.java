import calculator.factory.CalculatorService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CalculatorApplication {

    public static void main(String[] args) {
        System.out.println("Welcome");
        new CalculatorService().calculatorMenu();
        System.out.println("End");
    }

}
