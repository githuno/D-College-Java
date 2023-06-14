package mvc.java.kadai.se.cat02.sec02_modeling.no009;
/**
 * モデリング問題9 回答例
 * 犬の情報を格納するためのクラス
 */
public class Dog extends Animal {

	public Dog(String name, int age) {
		//親クラスのコンストラクタを実行するsuper
		super(name, age);
	}

	/**
	 * 犬の年齢を1つ増やします。
	 * growメソッドが呼び出されるたびに犬が1歳年をとります。
	 */
	public void grow() {
		setAge(getAge() + 1);
	}

	/**
	 * フィールド変数を使用し、
	 * 「(犬の名前)が歩いた」という文字列を返して(return)ください。
	 */
	public String walk() {
		return "犬の" + getName() + "が歩いた";
	}

}
