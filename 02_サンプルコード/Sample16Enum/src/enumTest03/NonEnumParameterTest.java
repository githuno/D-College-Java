package enumTest03;

// enum無し
public class NonEnumParameterTest {

	public static void main(String[] args) {
		// 性別と家族構成を整数値で管理する場合
		int gender = 1;
		int family = 1;

		// メソッド呼び出し

		// 性別と家族構成、両方のチェック
		Check(gender, family);

		// 性別のチェック
		CheckGender(gender);

		// 家族構成のチェック
		CheckFamily(family);
	}

	// 各チェックメソッドの定義

	// 引数がすべてint型なので、メソッド名で別けなければならない
	private static void CheckGender(int gender) {

		// 性別を整数値で判別しているので可読性が低い
		if (gender == 1) {
			System.out.println("男性です。");
		} else if (gender == 2) {
			System.out.println("女性です。");
		} else if (gender == 3) {
			System.out.println("男性、女性、いずれでもありません。");
		} else {
			// 正しい値の範囲から外れた時の処理を入れなければならない
			System.out.println("性別の値が正しくありません。");
		}
	}

	// 引数がすべてint型なので、メソッド名で別けなければならない
	private static void CheckFamily(int family) {

		// 性別を整数値で判別しているので可読性が低い
		if (family == 1) {
			System.out.println("父です。");
		} else if (family == 2) {
			System.out.println("母です。");
		} else if (family == 3) {
			System.out.println("兄弟です。");
		} else if (family == 4) {
			System.out.println("姉妹です。");
		} else {
			// 正しい値の範囲から外れた時の処理を入れなければならない
			System.out.println("家族構成の値が正しくありません。");
		}
	}

	// 引数がどちらもint型なので、引数の順番で性別を家族構成を判別しなければならない
	private static void Check(int gender, int family) {

		CheckGender(gender);

		CheckFamily(family);
	}
}
