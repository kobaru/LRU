import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.*;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUTest {

    @Test
    public void dataAを表示() throws Exception { // 最初のテスト
        Map<String, String> lru = new LRU<>(2); // 最大値のサイズに2を指定

        lru.put("a", "dataA"); // (key:"a", value:"dataA")を挿入

        assertEquals("dataA", lru.get("a")); // key:"a"にアクセスした場合value:"dataA"を返すか確認

    }

    @Test
    public void dataBを表示() throws Exception { // 上のテストにデータを追加
        Map<String, String> lru = new LRU<>(2); // 最大値のサイズに2を指定

        lru.put("a", "dataA"); // (key:"a", value:"dataA")を挿入
        lru.put("b", "dataB"); // (key:"b", value:"dataB")を挿入

        assertEquals("dataB", lru.get("b")); // key:"b"にアクセスした場合value:"dataB"を返すか確認

    }

    @Test
    public void dataCを表示() throws Exception { // 更にデータを追加
        Map<String, String> lru = new LRU<>(2); // 最大値のサイズに2を指定

        lru.put("a", "dataA"); // (key:"a", value:"dataA")を挿入
        lru.put("b", "dataB"); // (key:"b", value:"dataB")を挿入
        lru.put("c", "dataC"); // (key:"c", value:"dataC")を挿入

        assertEquals("dataC", lru.get("c")); // key:"c"にアクセスした場合value:"dataC"を返すか確認

    }

    @Test
    public void dataAがnullになっているか() throws Exception { // 上と同様
        Map<String, String> lru = new LRU<>(2); // 最大値のサイズに2を指定

        lru.put("a", "dataA"); // (key:"a", value:"dataA")を挿入
        lru.put("b", "dataB"); // (key:"b", value:"dataB")を挿入
        lru.put("c", "dataC"); // (key:"c", value:"dataC")を挿入 - この時(key:"a", value:"dataA")はアクセスされていないため消えているはず

        assertEquals(null, lru.get("a")); // key:"a"にアクセスした場合value:nullを返すか確認

    }

    @Test
    public void dataAとdataBを追加したときにaにアクセスするとdataAを返す() throws Exception { // スライドの上側の例を再現したテスト
        Map<String, String> lru = new LRU<>(2); // 最大値のサイズに2を指定

        lru.put("a", "dataA"); // (key:"a", value:"dataA")を挿入
        lru.put("b", "dataB"); // (key:"b", value:"dataB")を挿入

        assertEquals("dataA", lru.get("a")); // key:"a"にアクセスした場合value:"dataA"を返すか確認

    }

    @Test
    public void 更にdataCを追加しbにアクセスするとnullを返す() throws Exception { // スライドの下側の例を再現したテスト
        Map<String, String> lru = new LRU<>(2); // 最大値のサイズに2を指定

        lru.put("a", "dataA"); // (key:"a", value:"dataA")を挿入
        lru.put("b", "dataB"); // (key:"b", value:"dataB")を挿入

        assertEquals("dataA", lru.get("a")); // key:"a"にアクセスした場合value:"dataA"を返すか確認


        lru.put("c", "dataC"); // (key:"c", value:"dataC")を挿入 - この時(key:"b", value:"dataB")はアクセスされていないため消えているはず

        assertEquals(null, lru.get("b")); // key:"b"にアクセスした場合value:nullを返すか確認

    }
}