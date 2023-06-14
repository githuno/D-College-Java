
public class SampleInteger {
	public static void main(String[] args) {
		// ラッパークラスでインスタンスを作成
		Integer number1 = Integer.valueOf("100");
		System.out.println(number1);

		// 値を取り出してみる
		int number2 = number1.intValue();
		System.out.println(number2);

		// ラッパークラスのインスタンスを作り直してみる
		Integer number3 = Integer.valueOf(number1.intValue());
		System.out.println(number3);
	}
}
