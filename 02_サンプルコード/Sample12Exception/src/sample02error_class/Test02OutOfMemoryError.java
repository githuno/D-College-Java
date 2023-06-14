package sample02error_class;

public class Test02OutOfMemoryError {

	private String str;

	public Test02OutOfMemoryError(int num) {
		this.str += num;
	}

	public static void main(String[] args) {

		int num = 0;

		// バッファを永遠に埋め続けてヒープを食いつぶす
		// OutOfMemoryError発生

		try {

			StringBuilder sb = new StringBuilder();
			while (true) {
				sb.append("0123456789");
			}

		} catch (Error e) {
			System.out.println(e.toString());
		}

	}
}
