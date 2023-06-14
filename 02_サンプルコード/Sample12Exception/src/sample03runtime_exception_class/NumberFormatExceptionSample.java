package sample03runtime_exception_class;

public class NumberFormatExceptionSample {

	public static void main(String[] args) {

		// 実行時例外「NumberFormatException」の発生
		Integer a = Integer.parseInt("0.1");	// 数値にパース出来ない文字列だと発生
		System.out.println(a);

	}
}
