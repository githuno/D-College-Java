package jp.co.opst.mvc.resolve.interfaces;

public class Iphone implements SmartPhone,Mobile {

    // ----------------------------------------------------
    // ◆フィールド

    // ※Iphoneクラス独自の属性
    public static final String LOGO = "リンゴマーク";

    // ----------------------------------------------------
    // ◆メソッド

    // ※iPhoneクラス独自の機能。Siri
    public void askSiri(String question) {
        System.out.println("すみません。よくわかりません。");
    }

}