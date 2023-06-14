package java.kadai.se.cat02.sec02_modeling.no009;

public abstract class Animal {

	/** 動物の名前 */
	private String name;

	/** 動物の年齢 */
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract String walk();
	public abstract void grow();


	// 以下にゲッター、セッターを実装してください。
}
