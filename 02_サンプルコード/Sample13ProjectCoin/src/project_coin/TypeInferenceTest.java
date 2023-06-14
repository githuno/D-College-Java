package project_coin;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TypeInferenceTest {

	public static void main(String[] args) {

		// Java6までの書き方(左辺、右辺同じジェネリクスが必要)
		List<String> list = new ArrayList<String>();
		Map<String, List<String>> map = new HashMap<String, List<String>>();

		//		// Java7以降、右辺はダイヤモンド演算子で型推論
		//		List<String> list = new ArrayList<>();
		//		Map<String, List<String>> map = new HashMap<>();

		//		// 宣言とインスタンス生成を別々にした場合
		//		List<String> list;
		//		list = new ArrayList<>();
		// 型 Sample のメソッド setList(List<String>) は引数 (ArrayList<Object>) に適用できません


//		// 無名(匿名)クラスでは<>ダイヤモンド演算子は使えない
//		List<String> a = new List<>() {
//			@Override
//			public int size() {
//				return 0;
//			}
//			@Override
//			public boolean isEmpty() {
//				return false;
//			}
//			@Override
//			public boolean contains(Object o) {
//				return false;
//			}
//			// 以下省略
//		}
	}

//	// メソッドの引数の場合
//	private List<String> list;
//    public void setList(List<String> list) {
//        this.list = list;
//    }
//
//    // こうは書けない
//    public void setList(List<> list) {
//        this.list = list;
//    }
}
