import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.javaqa.FreelanceVocation.vocationMonth.VocationService;

public class VocationServiceTest {
    @Test
    void shouldCalculateExact1(){
        VocationService service = new VocationService();

        int expected = 3;
        int actual = service.calculation(10000, 3000, 20000);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void shouldCalculateExact2(){
        VocationService service = new VocationService();

        int expected = 2;
        int actual = service.calculation(100000, 60000, 150000);

        Assertions.assertEquals(expected, actual);
    }
}
