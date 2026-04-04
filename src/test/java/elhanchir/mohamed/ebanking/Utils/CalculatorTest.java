package elhanchir.mohamed.ebanking.Utils;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    // Test addition
    @Test
    void testAdditionner_PositiveNumbers() {
        int result = Calculator.additionner(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testAdditionner_NegativeNumbers() {
        int result = Calculator.additionner(-2, -3);
        assertEquals(-5, result);
    }

    @Test
    void testAdditionner_WithZero() {
        int result = Calculator.additionner(5, 0);
        assertEquals(5, result);
    }

    // Test multiplication
    @Test
    void testMultiplier_PositiveNumbers() {
        int result = Calculator.multiplier(4, 3);
        assertEquals(12, result);
    }

    @Test
    void testMultiplier_WithZero() {
        int result = Calculator.multiplier(5, 0);
        assertEquals(0, result);
    }

    @Test
    void testMultiplier_NegativeNumbers() {
        int result = Calculator.multiplier(-2, 3);
        assertEquals(-6, result);
    }
}