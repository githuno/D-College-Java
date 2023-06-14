package opst.mvc.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * 初期化色々
 */
public class Sample03ArrayListInitialize {
	public static void main(String[] args) {

		/*
		 * 通常のaddを使う
		 */
		List<String> list = new ArrayList<>();

		list.add("一番目");
		list.add("二番目");
		list.add("三番目");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		/*
		 * ArraysクラスのasListメソッドを使て固定サイズのListオブジェクトを生成
		 * ArrayListのコンストラクタに渡す
		 */
		List<String> listAsList = new ArrayList<>( Arrays.asList("一個目", "二個目", "三個目") );

		// 全ての要素を出力
		dumpList(listAsList);

		System.out.println("----------------");

		/*
		 * 無名クラスとインスタンスイニシャライザを使てaddする
		 * ※無名クラスを使ってインスタンスイニシャライザ定義する
		 * ※コンストラクタ呼出しに続く中括弧が無名クラス
		 * ※この場合はコンストラクタに型パラメータが必要
		 */
		List<String> initializeList = new ArrayList<String>() {
			{
				add("先鋒");
				add("中堅");
				add("大将");
			}
		};

		// 全ての要素を出力
		dumpList(initializeList);

		System.out.println("----------------");
	}

	private static void dumpList(List<String> list) {
		// indexを利用して全ての要素を出力
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
	}
}
