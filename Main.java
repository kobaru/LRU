import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> lru = new LRU<>();

        lru.put("a", "dataA");

        System.out.println(lru.get("a"));
    }
}