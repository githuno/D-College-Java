package java.kadai.se.cat02.sec02_modeling.no012;

public class KadaiStaffList12 {

	public static void main(String args[]) {

		//以下コメントアウトを外して使用してください。

		// 会社を用意
		Company com = new Company();
		// 檻を用意
		Cage cage = new Cage();

		// 従業員を用意
		//		Employee emp1 = new Staff("一郎さん");
		//		Employee emp2 = new Staff("次郎さん");
		//		Employee emp3 = new Staff("スコットさん");

		// 動物を用意
		//		Animal ani1 = new Staff("シロ");
		//		Animal ani2 = new Staff("タマ");
		//		Animal ani3 = new Staff("ポチ");

		System.out.println("======== 従業員が入社します(add(Employee employee)メソッド) ========");
		//		com.add(emp1);
		//		com.add(emp2);
		//		com.add(emp3);
		System.out.println("======== 従業員が入社します(add(Employee employee)メソッド) ========");

		System.out.println();

		System.out.println("======== 従業員が仕事をします(doAllWork()メソッド) ========");
		//		com.doAllWork();
		System.out.println("======== 従業員が仕事をしました(doAllWork()メソッド) ========");

		System.out.println();

		System.out.println("======== 動物を捕まえて檻に入れます(add(Animal animal)メソッド) ========");
		//		cage.add(ani1);
		//		cage.add(ani2);
		//		cage.add(ani3);
		System.out.println("======== 動物を捕まえて檻に入れました(add(Animal animal)メソッド) ========");

		System.out.println();

		System.out.println("======== 動物が歩きます(doAllWalk()メソッド) ========");
		//		cage.doAllWalk();
		System.out.println("======== 動物が歩きました(doAllWalk()メソッド) ========");

		System.out.println();

		System.out.println("======== 従業員を呼び出して檻に入れる ========");
		//		Staff staff = (Staff) com.get("一郎さん");
		//		cage.add(staff);
		System.out.println("======== 従業員を呼び出して檻に入れました ========");

		System.out.println();

		System.out.println("======== 動物が歩きます(doAllWalk()メソッド) ========");
		//		cage.doAllWalk();
		System.out.println("======== 動物が歩きました(doAllWalk()メソッド) ========");

	}
}
