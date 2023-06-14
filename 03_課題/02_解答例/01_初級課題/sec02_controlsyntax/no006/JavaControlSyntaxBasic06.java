package mvc.java.kadai.se.cat01.sec02_controlsyntax.no006;

/*
 * ◆制御構文「条件分岐」の使用
 *
 * 〇対応表
 * 春：3月、4月、5月
 * 夏：6月、7月、8月
 * 秋：9月、10月、11月
 * 冬：12月、1月、2月
 */
public class JavaControlSyntaxBasic06 {

	public static void main(String[] args) {

		// ■ ①～③の要求をみたすプログラムを作成しましょう。

		// ①8月(x = 8)は対応表の春夏秋冬の中でどの季節に該当するか判断するプログラムを作成しましょう。
		//    ⇒【実行結果】夏です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ①解答 start ----------

		int x = 8;
		if (x == 3 || x == 4 || x == 5) {
			System.out.println("春です");
		} else if (x == 6 || x == 7 || x == 8) {
			System.out.println("夏です");
		} else if (x == 9 || x == 10 || x == 11) {
			System.out.println("秋です");
		} else if (x == 12 || x == 1 || x == 2) {
			System.out.println("冬です");
		}


		// ---------- ①解答 end ----------

		System.out.println("===================================");

		// ② ①のプログラムの8月(x=8)を12月(x=12)に変更したプログラムを作成しましょう。
		//    また、変更後の実行結果が「冬」と判断されるか確認しましょう。
		//    ⇒【実行結果】冬です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ②解答 start ----------

		x = 12;
		if (x == 3 || x == 4 || x == 5) {
			System.out.println("春です");
		} else if (x == 6 || x == 7 || x == 8) {
			System.out.println("夏です");
		} else if (x == 9 || x == 10 || x == 11) {
			System.out.println("秋です");
		} else if (x == 12 || x == 1 || x == 2) {
			System.out.println("冬です");
		}


		// ---------- ②解答 end ----------

		System.out.println("===================================");

		// ③ ①のプログラムと全く同じ動作をするプログラムを
		//    制御構文「switch」を使用して作成しましょう。
		//    ⇒【実行結果】夏です
		// ※必要であれば変数を追加しても問題ありません。

		// ---------- ③解答 start ----------

		x = 8;
		switch (x) {
		case 3:
		case 4:
		case 5:
			System.out.println("春です");
			break;
		case 6:
		case 7:
		case 8:
			System.out.println("夏です");
			break;
		case 9:
		case 10:
		case 11:
			System.out.println("秋です");
			break;
		case 12:
		case 1:
		case 2:
			System.out.println("冬です");
			break;
		}


		// ---------- ③解答 end ----------

	}

}
