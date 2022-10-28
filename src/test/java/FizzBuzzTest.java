import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class FizzBuzzTest {

    FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @Test
    public void testFizzBuzzAlgorithmHappyPath() {
        int a = 15;
        String expectedResult = "Good Number";

        String actualResult = fizzBuzz.fizzBuzzAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @RepeatedTest(50)
    public void testFizzBuzzSequenceHappyPath() {
        int number = 20;
        String expectedResult = "FizzBuzz 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz" +
                " 11 Fizz 13 14 FizzBuzz 16 17 Fizz 19 Buzz ";

        String actualResult = fizzBuzz.fizzBuzzSequence(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
