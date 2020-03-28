import static org.junit.Assert.*;
import org.junit.Test;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {

    @Test
    public void Mapを使えるようにする() {
        Map<String, String> lru = new LRU<>();

        lru.put("a", "dataA");

        assertEquals("dataA", lru.get("a"));
    }
}