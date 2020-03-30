import java.util.LinkedHashMap;
import java.util.Map;

public class LRU<K, V> extends LinkedHashMap<K, V> { // LinkedHashMapクラスを継承

    private static final long serialVersionUID = 1L; // serialVersionUIDを指定

    private final int MAX_ENTRIES; // 最大サイズの変数 - final修飾子により一回目の代入後変更不可

    public LRU(int msize) { // 最大サイズを引数とする
        super(15, 0.75f, true); /* 親クラスであるLinkedHashMapの引数にアクセス (int initialCapacity, - 初期容量
                                                                                float loadFactor, - 負荷係数
                                                                                boolean accessOrder - 順序付けモード - アクセス順ならtrue, 挿入順ならfalse) */
        MAX_ENTRIES = msize;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) { /* このマップが一番古いエントリを削除するはずの場合にtrueを返す
                                                                     eldest - 最も以前にマップに挿入されたエントリ */

        return size() > MAX_ENTRIES; // 最大サイズよりも大きくなった時一番古いエントリの削除
    }
}