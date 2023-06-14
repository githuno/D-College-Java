/**
 *
 */
package exception_class_sample;

/**
 * テスト用独自例外
 */
public class TestException extends Exception{

	// シリアルバージョンID
	private static final long serialVersionUID = 1L;
	public TestException(String message){
		super(message);
	}
	public TestException(Throwable cause){
		super(cause);
	}
	public TestException(String message,Throwable cause){
		super(message,cause);
	}
	public TestException(){
		super();
	}
}
