package streamapi;

import java.util.Arrays;
import java.util.List;

public class StreamApiSample {

	public static void main(String[] args) {
		// 配列の初期化は以下の様にも書ける
//		String[] array = new String[] {"伊藤", "高橋", "鈴木", "佐藤"};
		String[] array = {"伊藤", "高橋", "鈴木", "佐藤"};

		// ArrayList生成
		List<String> list = Arrays.asList(array);

		// Java7までは
		for( String str : list ) {
			if ( str.contains("藤") ) {
				System.out.println("漢字'藤'が入っている名前は" + str);
			}
		}

//		// StreamAPI + Lambda ではこう書ける
//		list.stream()							// Streamオブジェクト取得
//			.filter( str->str.contains("藤") )	// 中間処理
//			.forEach( str->System.out.println("漢字'藤'が入っている名前は" + str) );
//
//		// parallelStreamを使う
//		list.parallelStream()					// Streamオブジェクト取得
//			.filter( str->str.contains("藤") )	// 中間処理
//			.forEach( str->System.out.println("漢字'藤'が入っている名前は" + str) );

	}

}
