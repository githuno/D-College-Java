package jp.co.opst.mvc.resolve.interfaces;

public class Android implements SmartPhone,Mobile {

    // ----------------------------------------------------
    // ◆メソッド

    // ※Androidクラス独自の機能。モバイルPASMO
    public void mobileWallet() {
        System.out.println("モバイルPASMOで支払いました");
    }

}
