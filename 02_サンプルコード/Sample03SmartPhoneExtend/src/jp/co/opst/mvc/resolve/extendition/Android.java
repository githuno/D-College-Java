package jp.co.opst.mvc.resolve.extendition;

public class Android extends SmartPhone {

    // Androidクラス コンストラクタ
    // ----------------------------------------------------
    public Android() {
        System.out.println("Androidクラスのコンストラクタが呼ばれました");
    }
    // ----------------------------------------------------

    // ----------------------------------------------------
    // ◆メソッド

    // ※Androidクラス独自の機能。モバイルPASMO
    public void mobileWallet() {
        System.out.println("モバイルPASMOで支払いました");
    }

    // ----------------------------------------------------
}
