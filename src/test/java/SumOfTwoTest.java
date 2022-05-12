import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumOfTwoTest {

    SumOfTwo sumOfTwo;

    @BeforeEach
    void setUp() {
        sumOfTwo = new SumOfTwo();
    }

    @Test
    public void testSumOfTwoHappyPathPositiveNumber() {
        int[] input = {4, 3, 7, 12, 5, 2, 9, 4, 12};
        int sum = 12;
        int[][] expectedResult = {{3, 9}, {7, 5}};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoNegativeArray() {
        int[] input = {-2, -1, -5, -8, -6};
        int sum = -7;
        int[][] expectedResult = {{-2, -5}, {-1, -6}};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoTwoIndicesArray() {
        int[] input = {3, 6};
        int sum = 9;
        int[][] expectedResult = {{3, 6}};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoOneIndicesArray() {
        int[] input = {5};
        int sum = 15;
        int[][] expectedResult = {};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoZeroArray() {
        int[] input = {};
        int sum = 15;
        int[][] expectedResult = {};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoZeroSum() {
        int[] input = {3, 2, 1, 0, 4, 0, 2, 6};
        int sum = 0;
        int[][] expectedResult = {{0, 0}};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoOverflowArray() {
        int[] input = {3, Integer.MAX_VALUE, 1, 0, Integer.MAX_VALUE, 0, 2, 6};
        int sum = 4;
        int[][] expectedResult = {{3, 1}};

        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSumOfTwoOverflowSum() {
        int[] input = {3, 0, Integer.MAX_VALUE, 1, 0, Integer.MAX_VALUE, 2, 6};
        int sum = Integer.MAX_VALUE;
        int[][] expectedResult = {{0, Integer.MAX_VALUE},
                                    {0, Integer.MAX_VALUE},
                                    {Integer.MAX_VALUE, 0},
                                    {0, Integer.MAX_VALUE}};


        int[][] actualResult = sumOfTwo.sumOfTwoAlgorithm(input, sum);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
