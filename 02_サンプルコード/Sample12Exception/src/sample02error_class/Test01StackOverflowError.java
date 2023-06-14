package sample02error_class;

public class Test01StackOverflowError {

	public static void main(String[] args) {

		int num = 0;

		method(num);
	}

	private static void method(int num) {
		String str = "文字列" + num;

		// メソッドを永遠に再帰的呼び出す
		// StackOverflowError発生

		try {
			method(++num);

		} catch (Error e) {
			System.out.println(e.toString());
		}
	}
}
