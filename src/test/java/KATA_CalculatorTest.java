import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;

import org.example.KATA_Calculator;

class KATA_CalculatorTest {
    @Mock
    KATA_Calculator kata_Calculator;

    @Test
    void addEmptyStringTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.add(""));
    }

    @Test
    void addSingleNumberTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(5, kata_Calculator.add("5"));
    }

    @Test
    void addTwoNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(8, kata_Calculator.add("3,5"));
    }

    @Test
    void addMultipleNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(15, kata_Calculator.add("1,2,3,4,5"));
    }
}
