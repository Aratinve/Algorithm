import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class PeakElementTest {

    PeakElement peakElement;

    @BeforeEach
    void setUp() {peakElement = new PeakElement();}

    @Test
    public void testPeakElementHappyPath() {
        int[] numbers = {3, 2, 7, 5, 1, 9, 23, 1};

        int[] expectedResult = {3, 7, 23};

        int[] actualResult = peakElement.peakElementAlgorithm(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementNoPeak() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 8};

        int[] expectedResult = {};

        int[] actualResult = peakElement.peakElementAlgorithm(numbers);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPeakElementNegativeNumbers() {

    }
}
