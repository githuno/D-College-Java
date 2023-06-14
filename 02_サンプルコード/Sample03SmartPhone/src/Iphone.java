
/**
 * iPhoneクラス
 */
public class Iphone {

	// ----------------------------------------------------
	// ◆フィールド

	// ロゴマーク
	public static final String LOGO = "リンゴマーク";

	// サイズ(高さ)
	private int heightSize;

	// サイズ(横)
	private int widthSize;

	// 重さ
	private int weight;

	// 色
	private String color;

	// 電話番号
	private String phoneNumber;

	// ----------------------------------------------------
	// ◆コンストラクタ
	
	// コンストラクタの定義が1つも無い場合、
	// 引数無しのコンストラクタが暗黙的に生成される
	// 引数有りのコンストラクタを定義した場合、
	// 明示的に引数無しのコンストラクタを定義する
//	public Iphone() {
//		
//	}

	// 引数ありのコンストラクタ
//	public Iphone( int heightSize, int widthSize, int weight, 
//			String color, String phoneNumber ) {
//
//		// 各フィールドの値を初期化する
//		this.heightSize = heightSize;
//		this.widthSize = widthSize;
//		this.weight = weight;
//		this.color = color;
//		this.phoneNumber = phoneNumber;
//	}
	
	// ----------------------------------------------------
	// ◆メソッド

	// 電話機能
	public void callingPhone(String phoneNum) {
		System.out.println(phoneNum + "へ電話をかけます");
	}

	// メール機能
	public void sendMail(String mailAdd) {
		System.out.println(mailAdd + "へメールを送ります");
	}

	// カメラ機能
	public void takeAPhoto() {
		System.out.println("ハイ、チーズ！");
	}

    // 端末の色確認
    public void tellColor() {
        System.out.println(color);
    }

	// インターネット
	public void connectWWW() {
		System.out.println("インターネットに接続しました");
	}

}
