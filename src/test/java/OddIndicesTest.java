import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {
    OddIndices oITest;

    @BeforeEach
    void setUp() {
        oITest = new OddIndices();
    }

    @Order(1)
    @Test
    public void testOddIndicesHappyPath() {
        int[] input = {-45, 590, 234, 985, 12, 68};
        int[] expectedResult = {590, 985, 68};

        int[] actualResult = oITest.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesFiveIndicesArray() {
        int[] input = {89, 33654, 22, 987, 0};
        int[] expectedResult = {33654, 987};

        int[] actualResult = oITest.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesTwoIndicesArray() {
        int[] input = {666, 777};
        int[] expectedResult = {777};

        int[] actualResult = oITest.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesOneIndicesArray() {
        int[] input = {90};
        int[] expectedResult = {};

        int[] actualResult = oITest.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Test
    public void testOddIndicesZeroArray() {
        int[] input = {};
        int[] expectedResult = {};

        int[] actualResult = oITest.oddIndicesAlgorithm(input);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }


}
