import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {
    OddEven odTest;

    @BeforeEach
    void setUp() {
        odTest = new OddEven();
    }

    @Order(1)
    @Test
    public void testOddEvenHappyPathPositiveNumberEven() {
        long number = 222222l;
        String expectedResult = "Even";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathNegativeNumberOdd() {
        long number = -345l;
        String expectedResult = "Odd";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathZeroNumber() {
        long number = 0l;
        String expectedResult = "Even";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenOverflowPositiveInt() {
        long number = 2147483647l + 1;
        String expectedResult = "Undefined";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathPositiveNumberOdd() {
        long number = 23l;
        String expectedResult = "Odd";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathNegativeNumberEven() {
        long number = -566l;
        String expectedResult = "Even";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddEvenOwerflowNegativeInt() {
        long number = -2147483647l - 1;
        String expectedResult = "Undefined";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @RepeatedTest(50)
    public void testOddEvenRandomEvenInt() {
        long number = Integer.MIN_VALUE
                + (int)(Math.random()*(Integer.MAX_VALUE))*2;
        String expectedResult = "Even";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @RepeatedTest(50)
    public void testOddEvenRandomOddInt() {
        long number = Integer.MIN_VALUE
                + (int)(Math.random()*(Integer.MAX_VALUE))*2 - 1;
        String expectedResult = "Odd";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @RepeatedTest(50)
    public void testOddEvenRandomOwerflowPositive() {
        long number = Long.MAX_VALUE
                - (int)(Math.random()*(Integer.MAX_VALUE))*2;
        String expectedResult = "Undefined";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @RepeatedTest(50)
    public void testOddEvenRandomOwerflowNegative() {
        long number = Long.MIN_VALUE
                + (int)(Math.random()*(Integer.MAX_VALUE))*2;
        String expectedResult = "Undefined";

        String actualResult = odTest.OddEvenAlgorithm(number);

        Assertions.assertEquals(expectedResult, actualResult);
    }


}
