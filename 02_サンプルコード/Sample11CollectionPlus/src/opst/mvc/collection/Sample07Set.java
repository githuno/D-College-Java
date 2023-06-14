package opst.mvc.collection;

import java.util.HashSet;
import java.util.Set;

// Setインターフェイスの実装クラス
public class Sample07Set {
	public static void main(String[] args) {
		/*
		 * Setインターフェイス
		 * 		要素は重複を許さない。添字やkeyなど要素をしてする値は無い
		 * 		データ管理は実装に因る
		 * 	実装クラス
		 * 		HashSet		HashテーブルによるSet実装、要素の追加削除が高速、add順を保持せず、要素値でソートしない
		 * 		LinkedHashSet	Hashテーブルと線形リスト(結合リスト)によるSet実装、add順を保持する
		 * 		TreeSet		平衡木によるSet実装、要素の追加削除が低速、要素値でソートする
		 */

		// コレクション「Set」宣言と作成
		Set<String> strSet = new HashSet<String>();
//		Set<String> strSet = new LinkedHashSet<String>();
//		Set<String> strSet = new TreeSet<String>();

		// 「Set」にデータを追加する
		strSet.add("あいうえお");
		strSet.add("たちつてと");
		strSet.add("やゆよ");
		strSet.add("さしすせそ");
		strSet.add("はひふへほ");

		// 「Set」にさらにデータを追加する
		strSet.add("なにぬねの");
		strSet.add("かきくけこ");
		strSet.add("まみむめも");

		int size = strSet.size(); // データ数を取得
		System.out.println(size);

		System.out.println("---");

		// 拡張for文
		for (String str : strSet) {
			System.out.println(str);
		}

	}
}
