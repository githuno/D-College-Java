package mvc.java.kadai.se.cat02.sec02_modeling.no005;
/**
 * モデリング問題4 回答例
 * 鳥の情報を扱うクラス。
 *
 *
 */
public class Bird {

	/** 名前
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
	private String birdName;

	/** 年齢
	 *  ※変数には、役割を反映させた名前をつけましょう！
	 */
	private int birdAge;

	/**
	 * 鳥を作るときに必要な情報を入れるためのコンストラクタ
	 * 鳥の名前と鳥の年齢を引数で渡し、フィールド変数へセットするようにしましょう。
	 */
	public Bird(String birdName, int birdAge) {
		this.birdName = birdName;
		this.birdAge = birdAge;
	}

	/**
	 * フィールド変数を使用し、
	 *「(鳥の名前)がピッピーと鳴いた」という文字列を返して(return)ください。
	 */
	public String sing() {
		return birdName + "がピッピーと鳴いた";
	}

	/**
	 * 鳥の年齢を1つ増やします。
	 * growメソッドが呼び出されるたびに鳥が1歳年をとります。
	 */
	public void grow() {
		birdAge++;
	}

	/**
	 * フィールド変数を使用し、
	 * 「(鳥の名前)が飛んだ」という文字列を返して(return)ください。
	 */
	public String fly() {
		return birdName + "が飛んだ";
	}

	public String getBirdName() {
		return birdName;
	}

	public int getBirdAge() {
		return birdAge;
	}

}
