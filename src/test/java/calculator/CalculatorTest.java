package calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    float n1 = 10;
    float n2 = 5;

    @Test
    void verifyAdd(){
        Assertions.assertEquals(15, Calculator.add(n1, n2));
        Assertions.assertEquals(-15, Calculator.add(-n1, -n2));
        Assertions.assertEquals(5, Calculator.add(n1, -n2));
        Assertions.assertEquals(n2, Calculator.add(0, n2));
    }

    @Test
    void verifySubtract(){
        Assertions.assertEquals(5, Calculator.subtract(n1, n2));
        Assertions.assertEquals(-5, Calculator.subtract(-n1, -n2));
        Assertions.assertEquals(15, Calculator.subtract(n1, -n2));
        Assertions.assertEquals(n2, Calculator.subtract(0, -n2));
    }

    @Test
    void verifyDivide(){
        Assertions.assertThrows(IllegalArgumentException.class, ()-> Calculator.divide(n1,0));
        Assertions.assertEquals(2, Calculator.divide(n1, n2));
        Assertions.assertEquals(2, Calculator.divide(-n1, -n2));
        Assertions.assertEquals(-2, Calculator.divide(n1, -n2));
        Assertions.assertEquals(n1, Calculator.divide(n1, 1));
        Assertions.assertEquals(1, Calculator.divide(n1, n1));

    }

    @Test
    void verifyMultiply(){
        Assertions.assertEquals(50, Calculator.multiply(n1, n2));
        Assertions.assertEquals(50, Calculator.multiply(-n1, -n2));
        Assertions.assertEquals(-50, Calculator.multiply(n1, -n2));
        Assertions.assertEquals(0, Calculator.multiply(n1, 0));
        Assertions.assertEquals(n1, Calculator.multiply(n1, 1));
    }
}