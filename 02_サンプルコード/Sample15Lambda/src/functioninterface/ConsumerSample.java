package functioninterface;
import java.util.function.Consumer;

public class ConsumerSample {

	public static void main(String[] args) {
		// Consumer型  引数はあるが返り値がvoidのメソッドを定義
		Consumer<String> consumer = str -> System.out.println(str);
								//	(引数) -> {処理}

		// 実行結果
		consumer.accept( "Consumer型 acceptの実行結果" );
	}

//	interface Consumer<String> {
//		void accept(String t);
//	}

}
