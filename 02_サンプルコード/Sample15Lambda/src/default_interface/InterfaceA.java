package default_interface;

public interface InterfaceA {

	// 抽象メソッド
	public void methodA(String str);

	public String methodB(String str);

//	// デフォルトメソッド
//	default public int defaultMethod( int num ) {
//		return num * 10;
//	}

//	// staticメソッド
//	public static void staticMethod(String str) {
//		System.out.println("interfaceA::staticメソッドで出力：" + str);
//	}
}
