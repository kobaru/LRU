import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {

    @Test
    public void Mapを使えるようにする() {
        Map<String, String> lru = new LRU<>();

        lru.put("a", "dataA");
        lru.put("b", "dataB");

        assertEquals("dataA", lru.get("a"));
        assertEquals("dataB", lru.get("b"));
    }
}