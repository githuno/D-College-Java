package mvc.java.kadai.se.cat01.sec03_array.no004;

/*
 * ◆配列の定義・利用
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
public class JavaArrayBasic04 {
	public static void main(String[] args) {

		String[] strArray = new String[3];
		strArray[0] = "〇";
		strArray[1] = "△";
		strArray[2] = "□";

		for (int i = 0; i < strArray.length; i++) {
			System.out.print(strArray[i]);
		}

	}
}
