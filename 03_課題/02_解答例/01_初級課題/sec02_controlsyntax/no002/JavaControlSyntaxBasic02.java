package mvc.java.kadai.se.cat01.sec02_controlsyntax.no002;

/*
 * ◆制御構文【条件分岐】の使用
 */
public class JavaControlSyntaxBasic02 {

	public static void main(String[] args) {

		// ■ ①～②の要求をみたすプログラムを作成しましょう。

		// ①「x = 123」の約数であるか否かを判断するプログラムを作成しましょう。
		//    ⇒【実行結果】3は約数である
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 123;
		if (x % 3 == 0) {
			System.out.println("3は約数である");
		} else {
			System.out.println("3は約数ではない");
		}

		// ---------- ①解答 end ----------

		System.out.println("===================================");

		// ② ①で作成したプログラムの「x = 123」を「x = 124」に変更した場合、
		//    実行結果が「3は約数ではない」と判断されるか確認しましょう。
		//    ⇒【実行結果】3は約数ではない
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 124;
		if (x % 3 == 0) {
			System.out.println("3は約数である");
		} else {
			System.out.println("3は約数ではない");
		}


		// ---------- ②解答 end ----------



	}

}
