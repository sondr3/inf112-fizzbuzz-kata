package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setup() {
        this.fizzBuzz = new FizzBuzz(3, 5);
    }

    @Test
    void TestFizzOne() {
        String expected = this.fizzBuzz.fizzBuzz(1);
        assertEquals("1", expected);
    }

    @Test
    void TestFizzThree() {
        String expected = this.fizzBuzz.fizzBuzz(3);
        assertEquals("fizz", expected);
    }

    @Test
    void TestFizzFive() {
        String expected = this.fizzBuzz.fizzBuzz(5);
        assertEquals("buzz", expected);
    }

    @Test
    void TestFizzFifteen() {
        String expected = this.fizzBuzz.fizzBuzz(15);
        assertEquals("fizzbuzz", expected);
    }

    @Test
    void TEstFizzMinus() {
        String expected = this.fizzBuzz.fizzBuzz(-5);
        assertEquals("buzz", expected);
    }
}
