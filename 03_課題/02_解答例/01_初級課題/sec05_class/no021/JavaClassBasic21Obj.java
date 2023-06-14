package mvc.java.kadai.se.cat01.sec05_class.no021;

public class JavaClassBasic21Obj {

	private final int GOAL_WEIGHT = 70; //このフィールド【定数】を活用しましょう
	private final int UNIT = 2; //このフィールド【定数】を活用しましょう
	private int weight;

	public JavaClassBasic21Obj(int startWeight) {
		weight = startWeight;
	}

	public void showDietPlan() {

		if (weight <= GOAL_WEIGHT) {
			System.out.println("現状あなたに提案するダイエットプランはありません");
			return;
		}

		System.out.println("現在の体重は、【" + weight + "kg】です");
		System.out.print("1か月" + UNIT + "kgのペースで減量すると、" + GOAL_WEIGHT + "kgまで");

		int counter = 0;
		for (int i = weight; GOAL_WEIGHT < i; i -= UNIT) {
			counter++;
		}
		System.out.println(counter + "か月です");

		/* 別解
		 * int iDays = (weight - GOAL_WEIGHT) / UNIT;
		 * double dDays = ((double)weight - (double)GOAL_WEIGHT) / (double)UNIT;
		 * double fraction = dDays - iDays;
		 * if (fraction >= 0.5) {
		 * 	iDays = iDays + 1;
		 * }
		 * System.out.println(iDays + "か月です");
		 */

	}

}
