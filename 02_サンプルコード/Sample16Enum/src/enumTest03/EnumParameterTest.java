package enumTest03;

// Enum有り
public class EnumParameterTest {

	public static void main(String[] args) {

		// 性別、家族構成をEnumで管理する
		Gender gender = Gender.MAN;

		Family family = Family.SISTER;

		// メソッド呼び出し
		Check(gender, family);

		Check(gender);

		Check(family);
	}

	// 各チェックメソッドの定義

	// Enum有りの場合、オーバーロードできる
	private static void Check(Gender gender) {
		// 定数で判別しているので可読性が高い
		if (gender == Gender.MAN) {
			System.out.println("男性です。");
		} else if (gender == Gender.WOMAN) {
			System.out.println("女性です。");
		} else if (gender == Gender.XGENDER) {
			System.out.println("男性、女性、いずれでもありません。");
		}
		// 正しい値の範囲から外れた時の処理は必要ない
	}

	// オーバーロードできる
	private static void Check(Family family) {
		// 定数で判別しているので可読性が高い
		if (family == Family.FATHER) {
			System.out.println("父です。");
		} else if (family == Family.MOTHER) {
			System.out.println("母です。");
		} else if (family == Family.BROTHER) {
			System.out.println("兄弟です。");
		} else if (family == Family.SISTER) {
			System.out.println("姉妹です");
		}
		// 正しい値の範囲から外れた時の処理は必要ない
	}

	// オーバーロードできる
	private static void Check(Gender gender, Family family) {
		Check(gender);
		Check(family);
	}
}
