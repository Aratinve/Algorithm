import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseArrayTest {
    ReverseArray revArr;

    @BeforeEach
    void setUp() {
        revArr = new ReverseArray();
    }

    @Order(1)
    @Test
    public void testSortArrayHappyPathPositiveNumbers() {
        int[] input = {3, 1, 4, 2, 5, 0};
        int[] expectedResult = {0, 5, 2, 4, 1, 3};

        int[] actualResult = revArr.reverseArrayAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSortArrayHappyPathNegativeNumbers() {
        int[] input = {-7, -3};
        int[] expectedResult = {-3, -7};

        int[] actualResult = revArr.reverseArrayAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayZero() {
        int[] input = {0, 0};
        int[] expectedResult = {0, 0};

        int[] actualResult = revArr.reverseArrayAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testSortArrayEmpty() {
        int[] input = {};
        int[] expectedResult = {};

        int[] actualResult = revArr.reverseArrayAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
