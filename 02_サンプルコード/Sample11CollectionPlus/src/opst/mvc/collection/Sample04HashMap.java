package opst.mvc.collection;

import java.util.HashMap;
import java.util.Map;

//コレクション「Map」の使用
public class Sample04HashMap {
	public static void main(String[] args) {

		// コレクション「Map」宣言と作成
		HashMap<String, String> strMap = new HashMap<>();

		// 「Map」のデータを確認
		//		System.out.println(strMap.get("A001"));
		//		System.out.println(strMap.get("B002"));
		//		System.out.println(strMap.get("C003"));

		// 「Map」にデータを追加する
		strMap.put("A001", "あいうえお");
		strMap.put("B002", "かきくけこ");
		strMap.put("C003", "さしすせそ");
		strMap.put("D004", "たちつてと");

		// 「Map」のデータを確認
		System.out.println(strMap.get("A001"));
		System.out.println(strMap.get("B002"));
		System.out.println(strMap.get("C003"));
		System.out.println(strMap.get("D004"));

		System.out.println("--------");

		// 「Map」にデータを追加する
		strMap.put("E005", "なにぬねの");
		strMap.put("F006", "はひふへほ");
		strMap.put("G007", "まみむめも");
		strMap.put("H008", "やゆよ");

		/*
		 * 「Map」に登録された全データを確認したい
		 */

		// for文の利用はできない…「Map」には添え字(index)の概念が無い
		System.out.println("// for文の利用はできない（うまくいかない）");
		int size = strMap.size(); // データ数を取得
		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + strMap.get(i));
		}

		// 拡張for文の利用はできない…「Map」はKeyとValueのセットで一つの要素
		// 拡張for文は一つの要素を取り出す為、keyとValueの2つを取り出せない
		//		for(String str : strMap) { // エラー
		//			System.out.println(str);
		//		}

		System.out.println("--------");

		// 拡張for文の利用…keySet()を使用する
		for (String key : strMap.keySet()) {
			System.out.println("key = " + key + " : value = " + strMap.get(key));
		}

		/*
		 * もう一つの拡張for文の利用
		 * 	keyとvalueを一つのオブジェクトとして扱うMap.Entryクラスを使う
		 * 	MapインターフェイスのentrySet()メソッドは、
		 *  すべての要素のMap.Entryを取得する
		 */
		for ( Map.Entry<String, String> entry : strMap.entrySet() ) {
			System.out.print("key = " + entry.getKey() + " : ");
			System.out.println("value = " + entry.getValue());
		}

	}
}
