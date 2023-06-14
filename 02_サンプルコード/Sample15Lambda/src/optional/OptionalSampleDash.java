package optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OptionalSampleDash {

	public static void main(String[] args) {

		// strにString型のオブジェクトが入るか、nullが入るか分からない
		String str = getInput();

		// Java7ではnullチェックして処理を行う
		if ( str != null ) {
			System.out.println("文字列の文字数は" + str.length());
		}

		// nullチェックの書き方の一つ（冗長な方）
		if ( str != null ) {
			if ( str.length() > 5) {
				System.out.println("５文字以上入力されました：" + str);
			} else {
				System.out.println("５文字未満です");
			}
		}

		// nullチェックの書き方の一つ（簡潔な方）
		if ( str != null && str.length() > 5) {
			System.out.println("５文字以上入力されました：" + str);
		} else {
			System.out.println("５文字未満です");
		}

//		// Optionalを使う
//		// Optionalでラップする
//		Optional<String> str = Optional.ofNullable(getInput());
//
//		// ifPresentメソッドはnullではない時にラムダ式を実行する
//		str.ifPresent(s -> System.out.println("文字列の文字数は" + s.length() +  "文字です。"));
	}

	// 入力された値を取得するメソッド
	private static String getInput() {

		// 入力された値を代入する変数
		String str = null;

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.println("５文字以上の文字列を入力してください");
			System.out.print("入力:");
			str = reader.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// 入力内容が空値ならnullを返す
		if ( str.equals("") ) {
			str = null;
		}
		return str;
	}

}
