package mvc.java.kadai.se.cat02.sec01_algorithm.no005;

/**
 * Javaアルゴリズム問題5
 */
public class Algorithm05 {

	public static void main(String[] args) {

		// ■ ①の要求をみたすプログラムを作成しましょう。

		// ① 17は素数であるか否か判断するプログラムを作成しましょう。
		//    ⇒【実行結果】素数である

		// ---------- ①解答 start ----------

		int x = 17;
		boolean y = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				y = false;
				break;
			}
		}
		if (y) {
			System.out.println("素数である");
		} else {
			System.out.println("素数ではない");
		}

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x = 16」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】素数ではない

		// ---------- ②解答 start ----------
		x = 16;
		y = true;
		for (int i = 2; i < x; i++) {
			if (x % i == 0) {
				y = false;
				break;
			}
		}
		if (y) {
			System.out.println("素数である");
		} else {
			System.out.println("素数ではない");
		}
		// ---------- ②解答 end ----------

	}

}
