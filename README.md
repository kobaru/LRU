# LRU

テスト駆動開発によるLRUキャッシュの実装

# TODO

- [ ] README を作成する
- [ ] LRUTest class を実装する
- [ ] LRUTest class でMapを扱えるようにする
- [ ] lru.get("a") をプリントしたときに "dataA" を返す
- [ ] lru.get("b") をプリントしたときに "dataB" を返す
- [ ] lru.put("c", "dataC"); を行ったときに はじめに追加された "dataA" を削除する
- [ ] lru.get("a") をプリントした際に null と表示されるか確認する
- [ ] "dataA" と "dataB" をlru.put() で追加した際に lru.get("a") をプリントすると "dataA" を返す
- [ ] 更に "dataC" を追加し, lru.get("b") をプリントすると null を返す
