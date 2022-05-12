import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class MinMaxAveTest {

    MinMaxAve minMaxAve;

    @BeforeEach
    void setUp () {
        minMaxAve = new MinMaxAve();
    }

    @Test
    public void testMinMaxAveAlgorithmHappyPath() {
        int[] input = {1, 2, 3, 4, 5, 6, 7, 8};
        int firstI = 2;
        int secondI = 6;
        int[] expectedResult = {3, 7, 5};

        int[] actualResult = minMaxAve.minMaxAveAlgorithm(input, firstI, secondI);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveAlgorithmZeroArray() {
        int[] input = {0, 0, 0, 0, 0, 0, 0};
        int firstI = 1;
        int secondI = 5;
        int[] expectedResult = {0, 0, 0};

        int[] actualResult = minMaxAve.minMaxAveAlgorithm(input, firstI, secondI);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testMinMaxAveAlgorithmNegativeArray() {
        int[] input = {-2, -3, -5, -8, -6};
        int firstI = 1;
        int secondI = 3;
        int[] expectedResult = {-8, -3, -5};

        int[] actualResult = minMaxAve.minMaxAveAlgorithm(input, firstI, secondI);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTwoIndicesArray() {
        int[] input = {666, 777};
        int firstI = 0;
        int secondI = 1;
        int[] expectedResult = {666, 777, 721};

        int[] actualResult = minMaxAve.minMaxAveAlgorithm(input, firstI, secondI);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesOneIndicesArray() {
        int[] input = {5};
        int firstI = 0;
        int secondI = 0;
        int[] expectedResult = {5, 5, 5};

        int[] actualResult = minMaxAve.minMaxAveAlgorithm(input, firstI, secondI);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesZeroArray() {
        int[] input = {};
        int firstI = 0;
        int secondI = 0;
        int[] expectedResult = {};

        int[] actualResult = minMaxAve.minMaxAveAlgorithm(input, firstI, secondI);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
