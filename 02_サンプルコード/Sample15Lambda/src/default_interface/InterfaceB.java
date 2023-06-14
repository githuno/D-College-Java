package default_interface;

public interface InterfaceB {

	// 抽象メソッド

	public String methodB(String str);

	public void methodC();

//	// デフォルトメソッド
//	default public int defaultMethod( int num ) {
//		return num * 100;
//	}

//	// staticメソッド
//	public static void staticMethod(String str) {
//		System.out.println("interfaceB::staticメソッドで出力：" + str);
//	}

}
