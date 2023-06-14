package functioninterface;
import java.util.function.Supplier;

public class SupplierSample {

	public static void main(String[] args) {
		// Supplier型  引数がなく、返り値のみのメソッドを定義
		Supplier<String> supplier = () -> "aaa";

		// 実行結果
		System.out.println( "supplier型 getの実行結果：" + supplier.get());
	}

}
