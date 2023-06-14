package sample03runtime_exception_class;

public class ArrayIndexOutOfBoundsExceptionSample {

	public static void main(String[] args) {

		// 実行時例外「ArrayIndexOutOfBoundsException」の発生
		int[] testArray = new int[3];
		testArray[3] = 100;			// 配列などの要素の範囲外にアクセスすると発生

	}

}
