package sample01exception;

public class Test04Throw {

	public static void main(String[] args) {

		// 例外処理を行った場合
		try {
			// 例外オブジェクトを生成し例外を投げる
			NullPointerException nullpo = new NullPointerException();
			throw nullpo;

//			// 独自例外を投げる場合
//			SampleException e = new SampleException();
//			throw e;
//
//			// 1行で書く場合
//			throw new SampleException();

		} catch( NullPointerException e ) {
			System.out.println("例外が発生しました");
			System.out.println( e.toString() );
		} catch( Exception e ) {
			System.out.println("例外が発生しました");
			System.out.println( e.toString() );
		}

	}

}
