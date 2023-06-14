package opst.mvc.collection;

import java.util.HashMap;
import java.util.Map;

/*
 * Mapインターフェイスの基本的なメソッド
 */
public class Sample05MapMethod {
	public static void main(String[] args) {

		// 変数の宣言とインスタンスの生成
		Map<String, String> strMap = new HashMap<>();

		/*
		 * put(o, o)
		 * マップにkey, value要素を追加
		 */
		System.out.println("// put(o, o)メソッド");
		strMap.put("A001", "あいうえお");
		strMap.put("B002", "かきくけこ");
		strMap.put("C003", "さしすせそ");
		strMap.put("D004", "たちつてと");

		// 全ての要素を出力
		dumpMap(strMap);

		System.out.println("----------------");

		System.out.println("// 存在するKeyでput");
		strMap.put("A001", "わおん");

		// 全ての要素を出力
		dumpMap(strMap);

		System.out.println("----------------");

		/*
		 * get(o)
		 * マップからkeyを指定して要素を取得
		 */
		System.out.println("// get(o)メソッド");
		String keyStr = "A001";
		System.out.println("key = " + keyStr + " : value = " + strMap.get(keyStr));

		System.out.println("----------------");

		/*
		 * size()
		 * マップの要素の数を取得
		 */
		System.out.println("// size()メソッド");
		System.out.println("マップの要素の数は:" + strMap.size());

		System.out.println("----------------");

		/*
		 * containsKey(key)
		 * マップにkeyが存在するか
		 */
		System.out.println("// containsKey(key)メソッド");
		String key = "A001";
		if ( strMap.containsKey(key) ) {
			System.out.println("[" + key + "]というkeyの要素は存在します");
		} else {
			System.out.println("[" + key + "]というkeyの要素は存在しません");
		}

		System.out.println("----------------");

		/*
		 * remove(key)
		 * マップからkeyの要素を削除する
		 */
		System.out.println("// remove(key)メソッド");
		strMap.remove(key);
		if ( strMap.containsKey(key) ) {
			System.out.println("[" + key + "]というkeyの要素は存在します");
		} else {
			System.out.println("[" + key + "]というkeyの要素は存在しません");
		}

		// 全ての要素を出力
		dumpMap(strMap);

	}

	private static void dumpMap(Map<String, String> map) {
		// Map.Entryを使って全ての要素を出力
		for ( Map.Entry<String, String> entry : map.entrySet() ) {
			System.out.print("key = " + entry.getKey() + " : ");
			System.out.println("value = " + entry.getValue());
		}
	}
}
