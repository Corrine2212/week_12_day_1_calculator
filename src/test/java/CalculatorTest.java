import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void Add(){
        int result = calculator.add(2, 5);
        assertEquals(7, result);
    }

    @Test
    public void Subtract(){
        int result = calculator.subtract(5, 2);
        assertEquals(3, result);
    }

    @Test
    public void Multiply(){
        int result = calculator.multiply(2, 5);
        assertEquals(10, result);
    }

    @Test
    public void Divide(){
        double result = calculator.divide(2.0, 5.0);
        assertEquals(0.4, result, 0.0);

    }

}
