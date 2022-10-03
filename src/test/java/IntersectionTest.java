import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    Intersection interSec;

    @BeforeEach
    void setUp() {interSec = new Intersection();}

    @Test
    public void testIntersectionHappyPathPositiveNumber() {
        int[] first = {1, 2, 4, 5, 89};
        int[] second = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        int[] actualResult = interSec.intersectionAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPathNegativeNumber() {
        int[] first = {1, 2, 4, 5, 8, 9};
        int[] second =  {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        int[] actualResult = interSec.intersectionAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPathNullResult() {
        int[] first = {1, 2, 4, 5, 89};
        int[] second =  {8, 9, 45};
        int[] expectedResult = {};

        int[] actualResult = interSec.intersectionAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionFirstNullArray() {
        int[] first = {1, 2, 4, 5, 89};
        int[] second =  {};
        int[] expectedResult = {};

        int[] actualResult = interSec.intersectionAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionSecondNullArray() {
        int[] first = {1, 2, 4, 5, 89};
        int[] second =  {};
        int[] expectedResult = {};

        int[] actualResult = interSec.intersectionAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionNullArray() {
        int[] first = {};
        int[] second =  {};
        int[] expectedResult = {};

        int[] actualResult = interSec.intersectionAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIntersectionHappyPathDoubleNumber() {
        int[] first = {1, 2, 4, 4, 8, 9};
        int[] second =  {8, 9, 4, 4};
        int[] expectedResult = {4, 4, 8, 9};

        int[] actualResult = interSec.intersectionAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
