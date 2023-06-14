package mvc.java.kadai.se.cat01.sec07_collection.no004;

import java.util.ArrayList;

/*
 * ◆コレクション(JavaAPI)利用
 *
 * showStrArrayListメソッドは第１引数でString型ArrayListを受け取り
 * その配列に格納されたデータを1行ずつ表示します。
 *
 * 以下実行結果になるように①～③を補い、
 * プログラムを完成させましょう。
 * ===== コンソール 実行結果 =====
 * おはよう
 * こんにちは
 * こんばんは
 * ===============================
 *
 * ※mainメソッド内既存プログラムとshowStrArrayListメソッドの編集不可
 *
 */
public class JavaCollectionBasic04 {

	public static void main(String[] args) {

		ArrayList<String> greetings = new ArrayList<>();
		greetings.add("おはよう");
		greetings.add("こんにちは");
		greetings.add("こんばんは");
		showStrArrayList(greetings);

	}

	public static void showStrArrayList(ArrayList<String> strArrayList) {
		for(String str : strArrayList) {
			System.out.println(str);
		}
	}

}
