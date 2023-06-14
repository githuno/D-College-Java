package functioninterface;
import java.util.function.Predicate;

public class PredicateSample {

	public static void main(String[] args) {
		// Predicate型  引数と、booleanの返り値のメソッドを定義
//		Predicate<String> predicate = (String str) -> {
//															return str.isEmpty();
//														};
		Predicate<String> predicate = str -> str.isEmpty();


		// 実行結果
		String string = "";
		System.out.println( "Predicate型 testの実行結果：" + predicate.test(string));
	}

}
