import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.mockito.Mock;

import org.example.KATA_Calculator;

class KATA_CalculatorTest {
    @Mock
    KATA_Calculator kata_Calculator;

    // Unit test case for simple add method
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

    @Test
    void addNullInputTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.add(null));
    }

    // Unit test cases for addAnyAmountOfNums method
    @Test
    void addAnyAmountOfNumsEmptyInputTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.addAnyAmountOfNums());
    }

    @Test
    void addAnyAmountOfNumsSingleNumberTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(7, kata_Calculator.addAnyAmountOfNums("7"));
    }

    @Test
    void addAnyAmountOfNumsTwoNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(12, kata_Calculator.addAnyAmountOfNums("5", "7"));
    }

    @Test
    void addAnyAmountOfNumsMultipleNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(55, kata_Calculator.addAnyAmountOfNums("1", "2", "3", "4", "5", "6", "7", "8", "9", "10"));
    }

    @Test
    void addAnyAmountOfNumsNullTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.addAnyAmountOfNums((String[]) null));
    }
}