package methodreference;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceSample {

	public static void main(String[] args) {

		// Listに要素を配置
		List<String> list = Arrays.asList("a", "b", "c", "d");

		// メソッド参照
		// 		List  Java8 APIリファレンス
		// 			default void forEach(Consumer<? super T> action)
//		list.forEach((str) -> {
//			System.out.println(str);
//		});
		// 上記のラムダ式記述をメソッド参照にする
		list.forEach(System.out::println);

	}

}
