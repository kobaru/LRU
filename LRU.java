import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K, V> extends LinkedHashMap<K, V> {

    private static final long serialVersionUID = 1L;

    private int mSize;

    public LRU(int msize) {
        super(15, 0.75f, true);
        mSize = msize;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > mSize;
    }
}