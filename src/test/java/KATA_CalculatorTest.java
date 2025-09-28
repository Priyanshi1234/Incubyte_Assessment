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

    // Unit test cases for addInputWithNewLineDelimiter method
    @Test
    void addInputWithNewLineDelimiterEmptyInputTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.addInputWithNewLineDelimiter(""));
    }

    @Test
    void addInputWithNewLineDelimiterNullInputTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.addInputWithNewLineDelimiter(null));
    }

    @Test
    void addInputWithNewLineDelimiterSingleNumberTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(7, kata_Calculator.addInputWithNewLineDelimiter("7"));
    }

    @Test
    void addInputWithNewLineDelimiterTwoNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(10, kata_Calculator.addInputWithNewLineDelimiter("3,7"));
    }

    @Test
    void addInputWithNewLineDelimiterNewLineDelimiterTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(6, kata_Calculator.addInputWithNewLineDelimiter("1\n2,3"));
    }

    @Test
    void addInputWithNewLineDelimiterMultipleNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(15, kata_Calculator.addInputWithNewLineDelimiter("1,2\n3,4\n5"));
    }

    // Unit test cases for addInputWithMultipleDelimiters method
    @Test
    void addInputWithMultipleDelimitersEmptyInputTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.addInputWithDifferentDelimiters(""));
    }

    @Test
    void addInputWithMultipleDelimitersNullInputTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.addInputWithDifferentDelimiters(null));
    }

    @Test
    void addInputWithMultipleDelimitersSingleNumberTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(7, kata_Calculator.addInputWithDifferentDelimiters("7"));
    }

    @Test
    void addInputWithMultipleDelimitersCommaDelimiterTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(10, kata_Calculator.addInputWithDifferentDelimiters("3,7"));
    }

    @Test
    void addInputWithMultipleDelimitersCustomDelimiterTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(6, kata_Calculator.addInputWithDifferentDelimiters("//;\n1;2;3"));
    }

    @Test
    void addInputWithMultipleDelimitersCustomDelimiterSingleNumberTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(5, kata_Calculator.addInputWithDifferentDelimiters("//;\n5"));
    }

    @Test
    void addInputWithMultipleDelimitersCustomDelimiterEmptyNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(0, kata_Calculator.addInputWithDifferentDelimiters("//;\n"));
    }

    @Test
    void addInputWithMultipleDelimitersCustomDelimiterMultipleNumbersTest() {
        kata_Calculator = new KATA_Calculator();
        assertEquals(15, kata_Calculator.addInputWithDifferentDelimiters("//|\n1|2|3|4|5"));
    }
}
