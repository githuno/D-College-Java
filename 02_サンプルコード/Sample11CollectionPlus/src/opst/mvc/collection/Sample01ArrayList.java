package opst.mvc.collection;

import java.util.ArrayList;
import java.util.List;

// Listインターフェイスの実装クラス
/*
 * Listインターフェイス
 * 		順序(添字)で要素を管理
 * 		重複を許す
 * 		データ管理は実装に因る
 * 	実装クラス
 * 		ArrayList	配列によるList実装、配列と同じく挿入に弱い
 * 		LinkedList	線形リスト(連結リスト)によるList実装、挿入には強いが、参照は弱い
 */
public class Sample01ArrayList {
	public static void main(String[] args) {

		// コレクション「List」型の変数宣言とインスタンス(オブジェクト)作成
		List<String> strList = new ArrayList<>();

		// 「List」のデータを確認
		//		System.out.println(strList.get(0));
		//		System.out.println(strList.get(1));
		//		System.out.println(strList.get(2));

		// 「List」にデータを追加する
		strList.add("あいうえお");
		strList.add("かきくけこ");
		strList.add("さしすせそ");
		strList.add("たちつてと");

		// 「List」のデータを確認
		System.out.println(strList.get(0));
		System.out.println(strList.get(1));
		System.out.println(strList.get(2));
		System.out.println(strList.get(3));

		System.out.println("------------");

		// 「List」にデータを追加する
		strList.add("なにぬねの");
		strList.add("はひふへほ");
		strList.add("まみむめも");
		strList.add("やゆよ");

		/*
		 * 通常のfor文とsize()を使っての全ての要素へのアクセス
		 */
		int size = strList.size(); // 要素数を取得
		for (int i = 0; i < size; i++) {
			System.out.println("[" + i + "]" + strList.get(i));
		}

		System.out.println("------------");

		/*
		 * 拡張for文を使っての全ての要素へのアクセス
		 */
		for (String str : strList) {
			System.out.println(str);
		}

		System.out.println("------------");

//		/*
//		 * 番外：
//		 * イテレータを使っての全ての要素へのアクセス
//		 */
//		System.out.println("◆イテレータを使ってみる");
//		Iterator<String> ite = strList.iterator();
//		while (ite.hasNext()) {
//			System.out.println(ite.next());
//		}

	}
}
