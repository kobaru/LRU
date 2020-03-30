import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {

    @Test
    public void dataAを表示() throws Exception {
        Map<String, String> lru = new LRU<>(2);

        lru.put("a", "dataA");

        assertEquals("dataA", lru.get("a"));

    }

    @Test
    public void dataBを表示() throws Exception {
        Map<String, String> lru = new LRU<>(2);

        lru.put("a", "dataA");
        lru.put("b", "dataB");

        assertEquals("dataB", lru.get("b"));

    }

    @Test
    public void dataCを表示() throws Exception {
        Map<String, String> lru = new LRU<>(2);

        lru.put("a", "dataA");
        lru.put("b", "dataB");
        lru.put("c", "dataC");

        assertEquals("dataC", lru.get("c"));

    }

    @Test
    public void dataAがnullになっているか() throws Exception {
        Map<String, String> lru = new LRU<>(2);

        lru.put("a", "dataA");
        lru.put("b", "dataB");
        lru.put("c", "dataC");

        assertEquals(null, lru.get("a"));

    }

    @Test
    public void dataAとdataBを追加したときにaにアクセスするとdataAを返す() throws Exception {
        Map<String, String> lru = new LRU<>(2);

        lru.put("a", "dataA");
        lru.put("b", "dataB");

        assertEquals("dataA", lru.get("a"));

    }

    @Test
    public void 更にdataCを追加しbにアクセスするとnullを返す() throws Exception {
        Map<String, String> lru = new LRU<>(2);

        lru.put("a", "dataA");
        lru.put("b", "dataB");

        assertEquals("dataA", lru.get("a"));


        lru.put("c", "dataC");

        assertEquals(null, lru.get("b"));

    }
}