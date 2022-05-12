import org.junit.jupiter.api.*;

import javax.xml.crypto.Data;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    SumArray sumArr;

    @BeforeEach
    void setUp () {
        sumArr = new SumArray();
    }

    @Order(1)
    @Test
    public void testSumArrayHappyPathPositiveNumbers() {
        int[] input = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        int actualResult = sumArr.sumArrayAlgorithm(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumbers() {
        int[] input = {-7, -3};
        int expectedResult = -10;

        int actualResult = sumArr.sumArrayAlgorithm(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayZero() {
        int[] input = {0, 0};
        int expectedResult = 0;

        int actualResult = sumArr.sumArrayAlgorithm(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumArrayEmpty() {
        int[] input = {};
        int expectedResult = 0;

        int actualResult = sumArr.sumArrayAlgorithm(input);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
