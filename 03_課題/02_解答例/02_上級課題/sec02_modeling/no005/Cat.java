package mvc.java.kadai.se.cat02.sec02_modeling.no005;
/**
 * モデリング問題4 回答例
 * 猫の情報を格納するためのクラス
 *
 *
 *
 */
public class Cat {

	/** 名前
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
	private String catName;

	/** 年齢
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
	private int catAge;

	/**
	 * 猫を作るときに必要な情報を入れるためのコンストラクタ
	 * 猫の名前と猫の年齢を引数で渡し、フィールド変数へセットするようにしましょう。
	 */
	public Cat(String catName, int catAge) {
		this.catName = catName;
		this.catAge = catAge;
	}

	/**
	 * フィールド変数を使用し、
	 *「(猫の名前)がニャーと鳴いた」という文字列を返して(return)ください。
	 */
	public String mew() {
		return catName + "がニャーと鳴いた";
	}

	/**
	 * 猫の年齢を1つ増やします。
	 * growメソッドが呼び出されるたびに猫が1歳年をとります。
	 */
	public void grow() {
		catAge++;
	}

	/**
	 * フィールド変数を使用し、
	 * 「(猫の名前)が歩いた」という文字列を返して(return)ください。
	 */
	public String walk() {
		return catName + "が歩いた";
	}

	public String getCatName() {
		return catName;
	}

	public int getCatAge() {
		return catAge;
	}

}
