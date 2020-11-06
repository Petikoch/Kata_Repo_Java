import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyClassShould {

    @Test
    void not_throw() {
        assertEquals("1", "1");
    }

}


































/*

    @Test
    void return_1_for_1() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();

        String result = fizzBuzzer.fizzBuzz(1);

        assertEquals("1", result);
    }

    @Test
    void return_Fizz_for_3() {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();

        String result = fizzBuzzer.fizzBuzz(3);

        assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @CsvSource({
            "1, '1'",
            "2, '2'",
            "3, 'Fizz'"
    })
    void fizzBuzz(int input, String expected) {
        FizzBuzzer fizzBuzzer = new FizzBuzzer();

        String result = fizzBuzzer.fizzBuzz(input);

        assertEquals(expected, result);
    }

 */
