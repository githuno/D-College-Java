package optional;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class OptionalSample {

	public static void main(String[] args) {

		String line = null;
		while( line ==null || !line.equals("n")) {
			// コンソールから入力
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			try {
				System.out.println("/** 何番目の名前を取得しますか？（'n'で終了） **/");
				line = reader.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			String name = NameList.get( Integer.parseInt(line)-1 );

			System.out.println( line + "番目の名前は：" + name );
			System.out.println( "名前の長さは：" + name.length() );
		}
	}

	// 名前リストを保持するクラス
	public static class NameList {

		// 名前配列にはnullが含まれている
		private static final String[] NAME_LIST = new String[] { "高橋", "四万十川", "五十嵐", null, "佐藤", "鶴ヶ屋大沼" };

		// 配列から指定された要素を返す
		public static String get(int index) {

			// nullチェックを入れない
//			return NAME_LIST[index];

//			// nullチェックを入れる
//			String name = NAME_LIST[index];
//			if (name == null) {
//				name = "";
//			}
//			return name;

//			// Optionalを使う
			return Optional.ofNullable( NAME_LIST[index] ).orElse("");

		}
	}
}
