package com.example.calculator;
import com.example.calculator.service.calculatorService;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class calculatorTest {
    private calculatorService calculator = new calculatorService();
    @Test
    public void testSum() {
        assertEquals(5, calculator.sum(2, 3));
    }
}
