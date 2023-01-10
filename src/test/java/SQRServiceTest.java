
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import ru.netology.sqr.SQRService;


public class SQRServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/java/resources/range.csv")
    public void testSquareOfNumbers(int from, int to, int act) {

        SQRService service = new SQRService();
        int sqNum = service.calcSqrt(from, to);

        Assertions.assertEquals(sqNum, act);
    }

}
