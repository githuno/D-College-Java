package jp.co.opst.mvc.resolve.interfaces;

public interface Mobile {

    // ----------------------------------------------------
    // ◆フィールド
    // ※インターフェイスは基本的にフィールドを持たないが、
    // 記述する場合「定数」のみ可能。

    // ----------------------------------------------------
    // ◆メソッド

    // 電話機能
    void callingPhone(String phoneNnm);

    // メール機能
    void sendMail(String mailAdd);

    // カメラ機能
    void takeAPhoto();

    // 端末の色確認
    void tellColor();

}
