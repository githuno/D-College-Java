package enumTest04;

// Enum有り
public class EnumTest {

	public static void main(String[] args) {

		// 性別、家族構成をEnumで管理する
		Family family = Family.SISTER;

		// メソッド呼び出し
		family.start();
		family.doMethod();
		family.end();
	}
}
