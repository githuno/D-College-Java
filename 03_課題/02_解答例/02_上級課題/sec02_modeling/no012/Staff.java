package mvc.java.kadai.se.cat02.sec02_modeling.no012;
/**
 *
 * モデリング問題12 回答
 *
 */
public class Staff implements Animal, Employee {

	private String name;

	public Staff(String name) {
		this.name = name;
	}

	@Override
	public void work() {
		System.out.println(name + "が働きました");
	}

	@Override
	public void walk() {
		System.out.println(name + "が歩きました");
	}

	@Override
	public String getName() {

		return name;
	}
}
