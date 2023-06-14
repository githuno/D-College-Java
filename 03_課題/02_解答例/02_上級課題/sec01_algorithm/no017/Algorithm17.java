package mvc.java.kadai.se.cat02.sec01_algorithm.no017;

/**
 * Javaアルゴリズム問題17
 */
public class Algorithm17 {

	public static void main(String[] args) {

		// ■ 実行結果の通りにコンソールに出力されるプログラムを作成しましょう。

		// ① 9から1までカウントダウンした整数をスペース1つ分ずらしながら表示するプログラムを作成しましょう。
		//    変数xに「9」を代入し、xを用いてプログラムを作成しましょう。
		//    ⇒【実行結果】
		//    9
		//     8
		//      7
		//       6
		//        5
		//         4
		//          3
		//           2
		//            1

		// ---------- ①解答 start ----------
		int x = 9;
		for (int i = x; 1 <= i; i--) {
			for (int j = x; i < j; j--) {
				System.out.print(" ");
			}
			System.out.println(i);
		}

		// ---------- ①解答 end ----------

		System.out.println();
		System.out.println("===================================");

		// ② ①で作成したプログラムの変数値を「x=12」に変更した場合、
		//    以下実行結果通りに表示されるか確認しましょう。
		//    ⇒【実行結果】
		//    12
		//     11
		//      10
		//       9
		//        8
		//         7
		//          6
		//           5
		//            4
		//             3
		//              2
		//               1

		// ---------- ②解答 start ----------
		x = 12;
		for (int i = x; 1 <= i; i--) {
			for (int j = x; i < j; j--) {
				System.out.print(" ");
			}
			System.out.println(i);
		}
		// ---------- ②解答 end ----------

	}

}
