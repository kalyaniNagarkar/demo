import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void addition() {
        Main calculator = new Main();
        double result = calculator.addition(4,7);
    }

    @org.junit.jupiter.api.Test
    void subtraction() {
        Main calculator = new Main();
        double result = calculator.subtraction(30, 7);
        assertEquals(23, result,"Subtraction method failed!");
    }

    @org.junit.jupiter.api.Test
    void multiplication() {
        Main calculator = new Main();
        double result = calculator.multiplication(3, 7);
        assertEquals(21, result,"Multiplication method failed!");
    }

    @org.junit.jupiter.api.Test
    void division() {
        Main calculator = new Main();
//        try{
//            calculator.division(10, 0);
//        } catch (ArithmeticException e){
//            assertEquals("Division by zero is not allowed", e.getMessage());
//        }
        double result = calculator.division(10, 5);
        assertEquals(0, result,"Division method failed!");
    }
}