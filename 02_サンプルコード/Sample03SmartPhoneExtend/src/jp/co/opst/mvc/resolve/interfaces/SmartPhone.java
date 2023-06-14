package jp.co.opst.mvc.resolve.interfaces;

/**
 * SmartPhoneインターフェース
 */
public interface SmartPhone {

    // ----------------------------------------------------
    // ◆フィールド
    // ※インターフェイスは基本的にフィールドを持たないが、
    // 記述する場合「定数」のみ可能。

    // ----------------------------------------------------
    // ◆メソッド

    // 電話機能（public abstractは省略できる）
    public abstract void callingPhone(String phoneNnm);

    // メール機能（public abstractは省略できる）
    public abstract void sendMail(String mailAdd);

    // カメラ機能（public abstractは省略できる）
    public abstract void takeAPhoto();

    // インターネット（public abstractは省略できる）
    public abstract void connectWWW();

    // 端末の色確認（public abstractは省略できる）
    public abstract void tellColor();

    // ※抽象メソッド アプリダウンロード（public abstractは省略できる）
    public abstract void downloadApp();

}
