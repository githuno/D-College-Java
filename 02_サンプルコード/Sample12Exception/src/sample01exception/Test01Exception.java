package sample01exception;

public class Test01Exception {

	public static void main(String[] args) {

		// 0除算で例外発生
		System.out.println(10/0);

		// 例外処理を行った場合
		try {
			// nullを代入
			String str = null;

			// オブジェクトの参照は無くnullなのでメンバを呼べない
			str.length();

		} catch( NullPointerException e ) {
			System.out.println("例外が発生しました");
		}

	}

}
