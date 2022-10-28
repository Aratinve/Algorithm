import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    IsPositiveNumber isPositiveNumber;

    @BeforeEach
    void setUp() {isPositiveNumber = new IsPositiveNumber();}

    @Test
    public void testIsPositiveNumberHappyPath() {
        int a = 555;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberNegativeNumber() {
        int a = -555;
        boolean expectedResult = false;

        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberNullNumber() {
        int a = 0;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsPositiveNumberOverflow(){
        int a = Integer.MAX_VALUE;
        boolean expectedResult = true;

        boolean actualResult = isPositiveNumber.isPositiveNumberAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
