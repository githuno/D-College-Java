package jp.co.opst.mvc.problem;

public class Android {

    // ----------------------------------------------------
    // ◆フィールド

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
	
	// 引数無し
//	public Android() {
//		
//	}

	// 引数あり
//	public Android( int heightSize, int widthSize, int weight, 
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
    public void callingPhone(String phoneNnm) {
        System.out.println(phoneNnm + "へ電話をかけます");
    }

    // メール機能
    public void sendMail(String mailAdd) {
        System.out.println(mailAdd + "へメールを送ります");
    }

    // カメラ機能
    public void takeAPhoto() {
        System.out.println("ハイ、チーズ！");
    }

    // インターネット
    public void connectWWW() {
        System.out.println("インターネットに接続しました");
    }

    // 端末の色確認
    public void tellColor() {
        System.out.println(color);
    }

    // ※Androidクラス独自の機能。モバイルPASMO
    public void mobileWallet() {
        System.out.println("モバイルPASMOで支払いました");
    }

}
