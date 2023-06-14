package mvc.java.kadai.se.cat01.sec07_collection.no001;

import java.util.ArrayList;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * 以下実行結果になるように①～③を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * 〇△□
 * ===============================
 *
 * ※mainメソッド内既存プログラム編集不可
 *
 */
public class JavaCollectionBasic01 {
	public static void main(String[] args) {

		ArrayList<String> strArrayList = new ArrayList<>();
		strArrayList.add("〇");
		strArrayList.add("△");
		strArrayList.add("□");

		for (String str : strArrayList) {
			System.out.print(str);
		}

	}
}
