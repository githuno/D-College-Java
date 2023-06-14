package mvc.java.kadai.se.cat01.sec05_class.no022;

/*
 * ◆別クラス(オブジェクト)の利用
 * 以下実行結果になるように
 * JavaClassBasic22ObjクラスとJavaClassBasic22Subクラスを利用し、
 * mainメソッドにプログラムを書きましょう。
 *
 * ☆JavaClassBasic22ObjクラスとJavaClassBasic22Subクラスの
 * プログラムを読み、内容を把握しましょう。
 * ===== コンソール 実行結果 =====
 * 〇〇〇
 * ------------------------------
 * △△△△△△
 * ------------------------------
 * □□□□□□□□□□□□
 * ------------------------------
 * ===============================
 *
 * ※JavaClassBasic22Obj.java、JavaClassBasic22Sub.javaの編集不可
 *
 */
public class JavaClassBasic22 {

	public static void main(String[] args) {


		JavaClassBasic22Sub ucs = new JavaClassBasic22Sub();

		JavaClassBasic22Obj objCircle = new JavaClassBasic22Obj(3, "〇");
		ucs.printShape(objCircle);

		JavaClassBasic22Obj objTriangle = new JavaClassBasic22Obj(6, "△");
		ucs.printShape(objTriangle);

		JavaClassBasic22Obj objSquare = new JavaClassBasic22Obj(12, "□");
		ucs.printShape(objSquare);

	}

}
