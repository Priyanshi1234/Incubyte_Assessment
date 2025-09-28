import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;

import org.example.KATA_Calculator;

class KATA_CalculatorTest {
    @Mock
    KATA_Calculator kata_Calculator;

    @Test
    void addEmptyStringTest() {
        KATA_Calculator calculator = new KATA_Calculator();
        assertEquals(0, calculator.add(""));
    }

    @Test
    void addSingleNumberTest() {
        KATA_Calculator calculator = new KATA_Calculator();
        assertEquals(5, calculator.add("5"));
    }

    @Test
    void addTwoNumbersTest() {
        KATA_Calculator calculator = new KATA_Calculator();
        assertEquals(8, calculator.add("3,5"));
    }

    @Test
    void addMultipleNumbersTest() {
        KATA_Calculator calculator = new KATA_Calculator();
        assertEquals(15, calculator.add("1,2,3,4,5"));
    }
}
