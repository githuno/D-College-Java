package opst.mvc.collection;

import java.util.Map;
import java.util.TreeMap;

//Mapインタフェースの実装クラス
public class Sample06MapInpri {
	public static void main(String[] args) {
		/*
		 * Mapインターフェイス
		 * 		key, valueで要素を管理
		 * 		keyは重複を許さない。valueは重複を許す
		 * 		データ管理は実装に因る
		 * 	実装クラス
		 * 		HashMap		Hashテーブルによる連想配列の実装、putされた順番は保持しない
		 * 		LinkedHashMap	Hashテーブルと線形リスト(結合リスト)によるMap実装、
		 * 						結合リストによりputされた順番を保持する
		 * 		TreeMap	平衡木によるMap実装、keyでソートされ、keyによる検索が強い
		 * 						containsKey, put, get, removeなど
		 */

//		Map<String, String> strMap = new HashMap<>();
//		Map<String, String> strMap = new LinkedHashMap<>();
		Map<String, String> strMap = new TreeMap<>();

		strMap.put("C003", "さしすせそ");
		strMap.put("B002", "かきくけこ");
		strMap.put("A001", "あいうえお");
		strMap.put("D004", "たちつてと");

		strMap.put("H008", "やゆよ");
		strMap.put("E005", "なにぬねの");
		strMap.put("G007", "まみむめも");
		strMap.put("F006", "はひふへほ");

		// 「Map」のデータを確認
		for (Map.Entry<String, String> entry : strMap.entrySet()) {
			System.out.print("key[" + entry.getKey() + "]");
			System.out.println(entry.getValue());
		}

	}
}
