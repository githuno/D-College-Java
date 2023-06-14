package functioninterface;
import java.util.function.Function;

public class FunctionSample {

	public static void main(String[] args) {
		// Function型  引数と返り値のあるメソッドを定義
		Function<String, Integer> function = str -> str.length();
		// Function<String, Integer> function = new 実装クラス();

		// 実行結果
		System.out.println( "Function型 applyの実行結果：" + function.apply( "この文字列の文字数を返すよ" ));
	}

//	interface Function<T, R> {
//		public R apply(T t);
//	}

}
