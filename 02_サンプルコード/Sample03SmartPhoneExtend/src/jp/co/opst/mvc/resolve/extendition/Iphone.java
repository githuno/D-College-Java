package jp.co.opst.mvc.resolve.extendition;

public class Iphone extends SmartPhone {

	// ----------------------------------------------------
	// ◆フィールド

	// ※Iphoneクラス独自の属性
	public static final String LOGO = "リンゴマーク";

	// ----------------------------------------------------

	// ----------------------------------------------------
	// ◆メソッド

	// ※iPhoneクラス独自の機能。Siri
	public void askSiri(String question) {
		System.out.println("すみません。よくわかりません。");
	}

	// オーバーライド
//	@Override
//	public void callingPhone(String phoneNnm) {
//		System.out.println(phoneNnm + "へ電話をかけます ※Iphoneクラスのメソッド");
//	}

	/* オーバーロード
	 * 条件：同じメソッド名で引数の数、型が異なる
	 * ※オーバーライドと名前が似ているが全くの別物
	 */
//	public void callingPhone(String phoneNum, String myPhoneNum) {
//	}
//
//	public String callingPhone(int phoneNum) {
//		return "xx-xxxx-xxxx";
//	}

}
