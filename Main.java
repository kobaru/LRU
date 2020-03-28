import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> lru = new LRU<>(2);

        lru.put("a", "dataA");
        lru.put("b", "dataB");
        lru.put("c", "dataC");

        System.out.println(lru.get("a"));
        System.out.println(lru.get("b"));
        System.out.println(lru.get("c"));
    }
}