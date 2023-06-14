package mvc.java.kadai.se.cat01.sec05_class.no011;

/*
 * ◆別クラス(オブジェクト)の利用
 * JavaClassBasic11Objクラスは次のフィールドとメソッドを保有しています。
 * [フィールド]
 * ・age (年齢/int型)
 * [メソッド]
 * ・birthday  (年齢フィールドの値に1を加算する)
 * ・tellOlder (年齢フィールドを戻り値として返す)
 *
 * JavaClassBasic11Objクラスのフィールドにデータを格納し、
 * 以下の実行結果になるようにbirthdayメソッドとtellOlderメソッドを
 * mainメソッドで使用しましょう。
 *
 * ===== コンソール 実行結果 =====
 * 4
 * ------------------------------
 * 5
 * ------------------------------
 * 6
 * ------------------------------
 * ===============================
 *
 * ※JavaClassBasic11Obj.javaの編集不可
 *
 */
public class JavaClassBasic11 {

	public static void main(String[] args) {

		JavaClassBasic11Obj obj = new JavaClassBasic11Obj(3);

		obj.birthday();
		System.out.println(obj.tellOlder());
		System.out.println("------------------------------");

		obj.birthday();
		System.out.println(obj.tellOlder());
		System.out.println("------------------------------");

		obj.birthday();
		System.out.println(obj.tellOlder());
		System.out.println("------------------------------");


	}

}
