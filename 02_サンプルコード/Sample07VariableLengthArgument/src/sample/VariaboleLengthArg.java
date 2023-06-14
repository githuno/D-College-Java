package sample;

public class VariaboleLengthArg {

	/**
	 * 可変長引数
	 * @param vals
	 */
	public void method1(String... vals) {

		if (vals.length > 0) {
			// 配列と同様のアクセス方法
			System.out.println(vals[0]);
		} else {
			System.out.println("Empty argument");
		}
		if (vals.length > 3) {
			System.out.println(vals[3]);
		}

		for (String value : vals) {
			System.out.println(value);
		}

		//例外発生。mainメソッドにて、method1に対し10個以上の引数をセットすれば例外にはならない。
		// 考え方はやはり配列と同様
		//System.out.println(vals[10]);
	}

	public static void main(String[] args) {
		VariaboleLengthArg sm = new VariaboleLengthArg();
		sm.method1();
		System.out.println("***************************");
		sm.method1("abc","cde","efg","hij");

		System.out.println("***************************");
		// 配列も引数として認識される
		// コマンドライン引数に「aaa bbb ccc ddd eee fff」を指定
		sm.method1(args);

	}

}
