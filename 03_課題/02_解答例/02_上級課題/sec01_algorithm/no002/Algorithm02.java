package mvc.java.kadai.se.cat02.sec01_algorithm.no002;

/**
 * Javaアルゴリズム問題2
 */
public class Algorithm02 {

	public static void main(String[] args) {

		// ■ ①の要求をみたすプログラムを作成しましょう。

		// ① 1234567890を繰り返して表示するプログラムを作成しましょう。
		//    表示する個数は「25」とします。
		//    ⇒【実行結果】1234567890123456789012345

		// ---------- ①解答 start ----------
		int x = 25;
		int count = 1;
		for (int i = 0; i < x; i++) {
			System.out.print(count++);
			if (9 < count) {
				count = 0;
			}
		}

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの「x = 25」を「x = 30」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう
		//    ⇒【実行結果】123456789012345678901234567890

		// ---------- ②解答 start ----------
		x = 30;
		count = 1;
		for (int i = 0; i < x; i++) {
			System.out.print(count++);
			if (9 < count) {
				count = 0;
			}
		}
		// ---------- ②解答 end ----------

	}

}
