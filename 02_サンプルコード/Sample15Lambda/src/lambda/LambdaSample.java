package lambda;

import java.util.Arrays;

public class LambdaSample {

	public static void main(String[] args) {

		// Employee型の配列を宣言、初期化
		Employee[] emplayees = new Employee[5];
		emplayees[0] = new Employee("阿部", 1000);
		emplayees[1] = new Employee("今井", 3000);
		emplayees[2] = new Employee("上田", 2000);
		emplayees[3] = new Employee("江川", 5000);
		emplayees[4] = new Employee("小野", 4800);

		// 拡張for文で全要素にアクセス（ソート前）
		for (Employee e : emplayees) {
			System.out.println(e.getName() + ":" + e.getSalary());
		}

		System.out.println("---");

		// 以前はComparatorインターフェイスを実装してソートした
		// 無名クラスでオブジェクトを生成
//		Arrays.sort(emplayees, new Comparator<Employee>() {
//			@Override
//			public int compare(Employee o1, Employee o2) {
//				return o1.getSalary() - o2.getSalary();
//			}
//		});
		// Java8からComparatorインターフェイスは
		// 関数型インターフェイスになったのでラムダ式がつかえる
		Arrays.sort(emplayees, (o1, o2) -> o1.getSalary() - o2.getSalary());

		// 拡張for文で全要素にアクセス（ソート後）
		for (Employee e : emplayees) {
			System.out.println(e.getName() + ":" + e.getSalary());
		}

		System.out.println("---------");


		// 以前はRunnableインターフェイスを実装してスレッドオブジェクトを生成した
//		Thread singingThread = new Thread(new Runnable() {
//			@Override
//			public void run() {
//				new Sing("花子").singing();
//			}
//		});
//		 singingThread.start();
//		 Thread singingThread2 = new Thread(new Runnable() {
//		 @Override
//		 public void run() {
//		 new Sing("太郎").singing();
//		 }
//		 });
//		 singingThread2.start();

		// Java8からRunnableインターフェイスは
		// 関数型インターフェイスになったのでラムダ式がつかえる

			Thread singingThread = new Thread(() -> new Sing("花子").singing());
			singingThread.start();
			Thread singingThread2 = new Thread(() -> new Sing("太郎").singing());
			singingThread2.start();

	}

}
