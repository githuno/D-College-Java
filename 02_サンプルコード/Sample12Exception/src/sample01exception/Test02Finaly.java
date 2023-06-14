package sample01exception;

public class Test02Finaly {

	public static void main(String[] args) {

		// 例外処理
		try {
			System.out.println("tryブロック");

			// nullを代入
			String str = null;

			// オブジェクトの参照は無くnullなのでメンバを呼べない
			str.length();

		} catch( NullPointerException e ) {			// catchブロック
			System.out.println("catchブロック");
			System.out.println("例外が発生しました");
		} finally {									// finalyブロック
			// 後処理
			// tryブロックが正常終了した時も、例外発生してcatchした時も
			// 最後に必ず実行される

			System.out.println("finallyブロック");
		}

	}

}
