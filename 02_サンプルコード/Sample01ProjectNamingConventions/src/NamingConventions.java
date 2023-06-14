
// ■Javaプロジェクトの規則
// [1]ソースファイルはクラス名.java
//    コンパイル後のクラスファイル(中間コードファイル)はクラス名.class
//    基本的に1ファイルに1クラス（複数のクラスも書ける…パッケージプライベート等条件有り）
// ■Java言語の命名規則(言語仕様以外)
// (1)クラス名は名詞、頭文字は大文字(小文字でもエラーにはならない)
public class NamingConventions {

    // ■Java言語の命名規則(言語仕様)
    // {1}識別子の頭文字は「a～z」「A～Z」「_」「$」
    int $test;

    // {2}識別子の頭文字以降は「0～9」「a～z」「A～Z」「_」「$」
    int _9test;

    // {3}Java言語のキーワード（予約語）は使用できない。
    //int class;

    // {4}英字の大文字と小文字は区別される
    // {5}識別子は重なってはいけない
    int _9Test;

    // {6}予約語ではないがtrue, false, null も使えない
    //int true;

    // (3)変数は英字の「小文字」で始める
    int num;

    // (4)定数で使う英字は「大文字」のみ
    public static final String STR = "定数";

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        displayString("文字列");
    }

    // (2)メソッド名は「動詞」で始める。頭文字は小文字
    // (5)複数の単語からなる場合はキャメル記法(二単語目から頭を大文字)
    private static void displayString(String str) {
        System.out.println("display:" + str);
    }

}

// パッケージプライベートの場合、複数クラス定義が出来る
//class TestClass {
//
//}
