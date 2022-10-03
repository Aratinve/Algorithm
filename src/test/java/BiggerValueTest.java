import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    BiggerValue bigVal;

    @BeforeEach
    void setUp() {
        bigVal = new BiggerValue();
    }

    @Test
    public void testBiggerValuePositiveNumberHappyPath() {
        int a = 123;
        int b = 345;
        int expectedResult = 345;

        int actualResult = bigVal.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueNegativeNumberHappyPath() {
        int a = -123;
        int b = -345;
        int expectedResult = -123;

        int actualResult = bigVal.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testBiggerValueNegativePath() {
        int a = Integer.MAX_VALUE;
        int b = 0;
        int expectedResult = 0;

        int actualResult = bigVal.biggerValueAlgorithm(a+a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
