import org.junit.Test;
import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void TestStringCounter() {
        assertEquals(3, Main.StringCounter("hello,world,java"));
        assertEquals(0, Main.StringCounter(null));
        assertEquals(2, Main.StringCounter("1 hat3 jun1t, ye2"));
    }
}