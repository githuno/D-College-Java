package mvc.java.kadai.se.cat02.sec02_modeling.no009;
/**
 * モデリング問題9 回答例
 */
public class Cat extends Animal {

	public Cat(String name, int age) {
		//親クラスのコンストラクタを実行するsuper
		super(name, age);
	}

	/**
	 * 猫の年齢を1つ増やします。
	 * growメソッドが呼び出されるたびに猫が1歳年をとります。
	 */
	public void grow() {
		setAge(getAge() + 1);
	}

	/**
	 * フィールド変数を使用し、
	 * 「(猫の名前)が歩いた」という文字列を返して(return)ください。
	 */
	public String walk() {
		return "猫の" + getName() + "が歩いた";
	}

}
