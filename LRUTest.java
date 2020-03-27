import static org.junit.Assert.*;
import org.junit.Test;

public class LRUTest {

    @Test
    public void _10を表示() {
        assertEquals(10, LRU.num());
        assertEquals("10じゃない!!", 10, LRU.num());
    }
}