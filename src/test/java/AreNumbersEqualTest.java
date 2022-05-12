import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    AreNumbersEqual areNumEqual;

    @BeforeEach
    void setUp() {
        areNumEqual = new AreNumbersEqual();
    }

    @Test
    public void testAreNumbersEqualHappyPath() {
        int a = 3;
        int b = 3;
        int expectedResult = 0;

        int actualResult = areNumEqual.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    public void testAreNumbersEqualNegativeHappyPath() {
        int a = -133;
        int b = -123;
        int expectedResult = -1;

        int actualResult = areNumEqual.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    public void testAreNumbersEqualPositiveHappyPath() {
        int a = 1282;
        int b = 123;
        int expectedResult = 1;

        int actualResult = areNumEqual.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersOwerflowNegativeInt() {
        int a = Integer.MIN_VALUE;
        int b = Integer.MAX_VALUE;
        int expectedResult = -1;

        int actualResult = areNumEqual.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersOwerflowPositiveInt() {
        int a = Integer.MAX_VALUE;
        int b = Integer.MIN_VALUE;
        int expectedResult = 1;

        int actualResult = areNumEqual.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testAreNumbersZero() {
        int a = 0;
        int b = 0;
        int expectedResult = 0;

        int actualResult = areNumEqual.areNumbersEqualAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
