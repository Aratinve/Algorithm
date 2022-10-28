import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SortArrayTest {

    SortArray sortArr;

    @BeforeEach
    void setUp() {
        sortArr = new SortArray();
    }

    @Order(1)
    @Test
    public void testSortArrayHappyPathPositiveNumbers() {
        int[] input = {3, 1, 4, 2, 5, 0};
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        int[] actualResult = sortArr.sortArrayQuickAlgorithmIncreased(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);

        actualResult = sortArr.sortArraySelectionAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSortArrayHappyPathNegativeNumbers() {
        int[] input = {-7, -3};
        int[] expectedResult = {-7, -3};

        int[] actualResult = sortArr.sortArrayQuickAlgorithmIncreased(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);

        actualResult = sortArr.sortArraySelectionAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayZero() {
        int[] input = {0, 0};
        int[] expectedResult = {0, 0};

        int[] actualResult = sortArr.sortArrayQuickAlgorithmIncreased(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);

        actualResult = sortArr.sortArraySelectionAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmpty() {
        int[] input = {};
        int[] expectedResult = {};

        int[] actualResult = sortArr.sortArrayQuickAlgorithmIncreased(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);

        actualResult = sortArr.sortArraySelectionAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayMaxInt() {
        int[] input = {Integer.MAX_VALUE, Integer.MAX_VALUE, 4, 29, Integer.MAX_VALUE, 678, Integer.MAX_VALUE};
        int[] expectedResult = {4, 29, 678, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE};

        int[] actualResult = sortArr.sortArrayQuickAlgorithmIncreased(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);

        actualResult = sortArr.sortArraySelectionAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}


