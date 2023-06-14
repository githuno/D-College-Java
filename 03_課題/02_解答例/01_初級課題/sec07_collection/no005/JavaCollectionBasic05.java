package mvc.java.kadai.se.cat01.sec07_collection.no005;

import java.util.HashMap;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * showStrHashMapメソッドは第１引数で
 * キー(key)がInteger型、値(value)がString型HashMapを受け取り
 * その配列に格納されたデータを1行ずつ表示します。
 *
 * 以下実行結果になるように①～④を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * おはよう
 * こんにちは
 * こんばんは
 * ===============================
 *
 * ※mainメソッド内既存プログラムとshowStrHashMapメソッドの編集不可
 *
 */
public class JavaCollectionBasic05 {

	public static void main(String[] args) {

		HashMap<Integer, String> greetings = new HashMap<>();
		greetings.put(1, "おはよう");
		greetings.put(2, "こんにちは");
		greetings.put(3, "こんばんは");
		showStrHashMap(greetings);

	}

	public static void showStrHashMap(HashMap<Integer, String> greetings) {
		for (Integer key : greetings.keySet()) {
			System.out.println(greetings.get(key));
		}
	}

}
