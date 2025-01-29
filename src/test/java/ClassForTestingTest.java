import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ClassForTestingTest {

    @Test
    void add_expectThreeWhenAPlusBEqualsThree() {
        // given
        int a = 23;
        int b = 19;
        int expected = 42;
        // when
        int actual = ClassForTesting.add(a, b);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void isNumberEven_expectedTrue_WhenNumberIs42() {
        // given
        int number = 42;
        boolean expected = true;
        // when
        boolean actual = ClassForTesting.isNumberEven(42);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void isNumberEven_expectedFalse_WhenNumberIs43() {
        // given
        int number = 43;
        boolean expected = false;
        // when
        boolean actual = ClassForTesting.isNumberEven(43);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void multiply_expected55WhenNumbersAre5And11() {
        // given
        int num1 = 5;
        int num2 = 11;
        int expected = 55;
        // when
        int actual = ClassForTesting.multiply(num1, num2);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void convertToUpperCase_expectedJAVAWhenGivenJaVa() {
        // given
        String given = "JaVa";
        String expected = "JAVA";
        // when
        String actual = ClassForTesting.convertToUpperCase(given);
        // then
        assertEquals(expected, actual);
    }

    @Test
    void isNumberPositive_expectedTrueWhenNumberIs42() {
        // given
        int number = 42;
        boolean expected = true;
        // when
        boolean actual = ClassForTesting.isNumberPositive((42));
        // then
        assertEquals(expected, actual);
    }

    @Test
    void isNumberPositive_expectedFalseWhenNumberIsMinus42() {
        // given
        int number = -42;
        boolean expected = false;
        // when
        boolean actual = ClassForTesting.isNumberPositive((-42));
        // then
        assertEquals(expected, actual);
    }

}