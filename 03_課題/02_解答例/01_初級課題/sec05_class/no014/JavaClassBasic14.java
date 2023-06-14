package mvc.java.kadai.se.cat01.sec05_class.no014;

/*
 * ◆別クラス(オブジェクト)の利用
 * 以下の実行結果になるように
 * JavaClassBasic14Objクラス、JavaClassBasic14Subクラスを利用し、
 * mainメソッドにプログラムを書きましょう。
 *
 * ☆JavaClassBasic14ObjクラスとJavaClassBasic14Subクラスの
 * プログラムを読み、内容を把握しましょう。
 * ===== コンソール 実行結果 =====
 * ペットを撫でます
 * ⇒鳥のぴーちゃんがピッピーと鳴いた
 * ペットと過ごして1年…
 * ⇒0才だった鳥のぴーちゃんは今日の誕生日で1才になりました
 * ------------------------------
 * ペットを撫でます
 * ⇒鳥のフェニックスがピッピーと鳴いた
 * ペットと過ごして1年…
 * ⇒10000才だった鳥のフェニックスは今日の誕生日で10001才になりました
 * ===============================
 *
 * ※JavaClassBasic14Obj.java、JavaClassBasic14Sub.javaの編集不可
 *
 */
public class JavaClassBasic14 {

	public static void main(String[] args) {

		JavaClassBasic14Obj bird = new JavaClassBasic14Obj("ぴーちゃん", 0);
		JavaClassBasic14Sub pet = new JavaClassBasic14Sub(bird);
		pet.stroke();
		pet.celebrate();

		System.out.println("------------------------------");

		bird = new JavaClassBasic14Obj("フェニックス", 10000);
		pet = new JavaClassBasic14Sub(bird);
		pet.stroke();
		pet.celebrate();

	}

}
