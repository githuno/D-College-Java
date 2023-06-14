package mvc.java.kadai.se.cat01.sec05_class.no013;

public class JavaClassBasic13Obj {

	private String catName; // 猫の名前
	private int catAge; // 猫の年齢

	public JavaClassBasic13Obj(String name, int age) {
		this.catName = name;
		this.catAge = age;
	}

	public void mew() {
		System.out.println("猫の" + this.catName + "がニャーと鳴いた");
	}

	public void grow() {
		System.out.print("猫の" + this.catName + "は" + this.catAge + "才でしたが、");
		this.catAge = this.catAge + 1;
		System.out.println(this.catAge + "才になりました");
	}

}
