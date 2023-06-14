package mvc.java.kadai.se.cat02.sec02_modeling.no001;

public class Car {

	/** 累積走行距離(int型 distance) */
	private int distance;

	/** 燃費(int型 efficency) */
	private int efficency;

	/** 燃料(int型 gas) */
	private int gas;


	/** 燃費と燃料はコンストラクタの引数で渡します。 */
	public Car(int efficency, int gas) {
		this.efficency = efficency;
		this.gas = gas;
	}

	/** メソッドには走る(public void run(int distance))メソッドを作成してください */
	public void run(int distance) {

		/**
		 * このメソッドでおこなうことは…
		 * 引数で渡された距離だけ走った後、累積走行距離と残っている燃料を表示する。
		 */

		//累計走行距離を算出
		this.distance += distance;

		//残燃料を算出
		int afterGas = gas - (this.distance / efficency);

		System.out.print("累積走行距離は" + this.distance + "km 残燃料" + afterGas + "l");

	}

}
