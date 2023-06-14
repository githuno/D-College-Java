package mvc.java.kadai.se.cat02.sec01_algorithm.no008;

/**
 * Javaアルゴリズム問題8
 */
public class Algorithm08 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 2つの整数を比べて「大きいほう「小さいほう」の値をそれぞれ表示する、
		//    同値の場合はその旨を表示するプログラムを作成しましょう。
		//    変数xに「83」、yに「45」を代入し挙動を確認しましょう。
		//    ⇒【実行結果】
		//    大きいほうの値は83です。
		//    小さいほうの値は45です。

		// ---------- ①解答 start ----------
		int x = 83;
		int y = 45;
		if (y < x) {
			System.out.println("大きいほうの値は" + x + "です。");
			System.out.println("小さいほうの値は" + y + "です。");
		} else if (x < y) {
			System.out.println("大きいほうの値は" + y + "です。");
			System.out.println("小さいほうの値は" + x + "です。");
		} else {
			System.out.println("両方とも" + x + "です。");
		}

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x=28」「y=53」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】
		//    大きいほうの値は53です。
		//    小さいほうの値は28です。

		// ---------- ②解答 start ----------
		x = 28;
		y = 53;
		if (y < x) {
			System.out.println("大きいほうの値は" + x + "です。");
			System.out.println("小さいほうの値は" + y + "です。");
		} else if (x < y) {
			System.out.println("大きいほうの値は" + y + "です。");
			System.out.println("小さいほうの値は" + x + "です。");
		} else {
			System.out.println("両方とも" + x + "です。");
		}

		// ---------- ②解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ③ ①で作成したプログラムの変数値を「x=28」「y=28」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】両方とも28です。

		// ---------- ③解答 start ----------

		x = 28;
		y = 28;
		if (y < x) {
			System.out.println("大きいほうの値は" + x + "です。");
			System.out.println("小さいほうの値は" + y + "です。");
		} else if (x < y) {
			System.out.println("大きいほうの値は" + y + "です。");
			System.out.println("小さいほうの値は" + x + "です。");
		} else {
			System.out.println("両方とも" + x + "です。");
		}

		// ---------- ③解答 end ----------

	}

}
