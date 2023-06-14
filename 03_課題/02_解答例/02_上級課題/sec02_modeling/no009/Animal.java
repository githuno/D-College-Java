package mvc.java.kadai.se.cat02.sec02_modeling.no009;
/**
 *
 * モデリング問題9 回答例
 *
 *
 */
public abstract class Animal {

	private String name;
	private int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public abstract String walk();
	public abstract void grow();


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
