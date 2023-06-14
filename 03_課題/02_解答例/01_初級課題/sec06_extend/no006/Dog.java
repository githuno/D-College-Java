package mvc.java.kadai.se.cat01.sec06_extend.no006;

public class Dog {

	private String name;
	private int age;

	public Dog(String name, int age) {
		// コンストラクタ
		this.name = name;
		this.age = age;
	}

	public void cry() {
		System.out.println(this.name + "の鳴き声がする");
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
