package mvc.java.kadai.se.cat02.sec01_algorithm.no015;

/**
 * Javaアルゴリズム問題15
 */
public class Algorithm15 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 5段縦横に「*」を並べて右下が直角になる直角三角形を表示するプログラムを作成しましょう。
		//    変数xに「5」を代入し、xを用いてプログラムを作成しましょう。
		//    ⇒【実行結果】
		//        *
		//       **
		//      ***
		//     ****
		//    *****

		// ---------- ①解答 start ----------
		int x = 5;
		for (int i = 1; i <= x; i++) {
			for (int j = x - i; 1 <= j; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x = 10」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】
		//             *
		//            **
		//           ***
		//          ****
		//         *****
		//        ******
		//       *******
		//      ********
		//     *********
		//    **********

		// ---------- ②解答 start ----------
		x = 10;
		for (int i = 1; i <= x; i++) {
			for (int j = x - i; 1 <= j; j--) {
				System.out.print(" ");
			}

			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		// ---------- ②解答 end ----------

	}

}
