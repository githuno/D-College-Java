package sample03runtime_exception_class;

public class ArithmeticExceptionSample {

	public static void main(String[] args) {

		// 実行時例外「ArithmeticException」の発生
		for ( int i = 10;  i >= 0 ; i-- ) {
			System.out.println( 10 / i );		// 0除算になると発生
		}
	}

}
