import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> lru = new LRU<>();

        lru.put("a", "dataA");
        lru.put("b", "dataB");

        System.out.println(lru.get("a"));
        System.out.println(lru.get("b"));
    }
}