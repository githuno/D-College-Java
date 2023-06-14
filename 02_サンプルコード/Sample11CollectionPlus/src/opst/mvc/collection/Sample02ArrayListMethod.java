package opst.mvc.collection;

import java.util.ArrayList;
import java.util.List;

/*
 * Listインターフェイスの基本的なメソッド
 */
public class Sample02ArrayListMethod {
	public static void main(String[] args) {

		// 変数宣言と初期化
		List<String> list = new ArrayList<>();

		/*
		 * add(o)
		 * リストの最後に要素を追加
		 */
		System.out.println("// add(o)メソッド");
		list.add("一番目");
		list.add("二番目");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("三番目をadd");
		list.add("三番目");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		/*
		 * get(i)
		 * 指定したindexでリストの要素を取得
		 */
		System.out.println("// get(i)メソッド");
		System.out.println("index = 1 でget:" + list.get(1));

		System.out.println("----------------");

		/*
		 * size()
		 * リストの要素の数を取得
		 */
		System.out.println("// size()メソッド");
		System.out.println("リストの要素の数は:" + list.size());

		System.out.println("----------------");

		/*
		 * add(i, o)
		 * 指定されたindexでリストに要素を追加（割り込み）
		 */
		System.out.println("// add(i, o)メソッド");
		System.out.println("// add(2, \"三番目に割り込み\")");
		list.add(2, "三番目に割り込み");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		System.out.println("// add(i, o)メソッド");
		System.out.println("// add(" + list.size() + ", \"Listの最後に追加\")");
		list.add(list.size(), "Listの最後に追加");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		System.out.println("// add(i, o)メソッド");
		System.out.println("// add(" + (list.size() + 1) + ", \"List範囲外に追加\")");
		// IndexOutOfBoundsExceptionになる
//		list.add( list.size()+1, "List範囲外に追加" );

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		/*
		 * set(i, o)
		 * 指定されたindexでリストの要素を置換
		 */
		System.out.println("// set(i, o)メソッド");
		System.out.println("// set(1, \"二番目を置換\")");
		list.set(1, "二番目を置換");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		System.out.println("// set(i, o)メソッド");
		System.out.println("// set(" + (list.size() - 1) + ", \"Listの最後を置換\")");
		list.set(list.size() - 1, "Listの最後を置換");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		System.out.println("// set(i, o)メソッド");
		System.out.println("// set(" + list.size() + ", \"List範囲外を置換\")");
		// IndexOutOfBoundsExceptionになる
//		list.set( list.size(), "List範囲外を置換" );

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		/*
		 * remove(i)
		 * 指定されたindexでリストの要素を削除
		 */
		System.out.println("// remove(i)メソッド");
		System.out.println("// remove(1, \"二番目を削除\")");
		list.remove(1);

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		System.out.println("// remove(i)メソッド");
		System.out.println("// remove(" + list.size() + ", \"List範囲外を削除\")");
		// IndexOutOfBoundsExceptionになる
//		list.remove( list.size());

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");

		/*
		 * remove(o)
		 * 指定されたObjectでリストの要素を削除
		 */
		System.out.println("// remove(o)メソッド");
		System.out.println("// remove(\"三番目\")");
		// 文字列の場合、参照ではなくcharシーケンスを見てくれる
		list.remove("三番目");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("// remove(o)メソッド");
		System.out.println("// remove(\"四番目\")");
		// 要素が存在しない場合、変化はない
		list.remove("四番目");

		// 全ての要素を出力
		dumpList(list);

		System.out.println("----------------");
	}

	private static void dumpList(List<String> list) {
		// indexを利用して全ての要素を出力
		for (int i = 0; i < list.size(); i++) {
			System.out.println("[" + i + "]" + list.get(i));
		}
	}
}
