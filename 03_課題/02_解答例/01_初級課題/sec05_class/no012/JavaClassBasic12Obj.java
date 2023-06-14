package mvc.java.kadai.se.cat01.sec05_class.no012;

public class JavaClassBasic12Obj {

	private int nowWeight = 100;

	public int running() {
		// int nowWeight = 100;(変更前)
		System.out.println("現在の体重：" + nowWeight + "kg");
		System.out.println("ランニングをしました");

		nowWeight = nowWeight - 5;
		return nowWeight;
	}

	public int working() {
		//int nowWeight = 100;(変更前)
		System.out.println("現在の体重：" + nowWeight + "kg");
		System.out.println("ウォーキングをしました");

		nowWeight = nowWeight - 3;
		return nowWeight;

	}

}
