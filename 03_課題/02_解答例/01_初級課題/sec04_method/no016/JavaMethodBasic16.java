package mvc.java.kadai.se.cat01.sec04_method.no016;

/*
 * ◆メソッドの定義
 * showDietPlanメソッドは、第1引数で体重(整数)を受け取ります。
 * 受け取った体重が70kg以下の場合、
 * 「現状あなたに提案するダイエットプランはありません」と表示します。
 * それ以外の場合、
 * 1か月2kgのペースで70kgまで減量すると何か月かかるか表示します。
 *
 * 以下実行結果になるように①、②を補い、
 * showDietPlanメソッドを完成させましょう。
 *
 * ===== コンソール 実行結果 =====
 * 現状あなたに提案するダイエットプランはありません
 * --------------------------------------------------
 * 現在の体重は、【71kg】です
 * 1か月2kgのペースで減量すると、70kgまで1か月です
 * --------------------------------------------------
 * 現在の体重は、【72kg】です
 * 1か月2kgのペースで減量すると、70kgまで1か月です
 * --------------------------------------------------
 * 現在の体重は、【73kg】です
 * 1か月2kgのペースで減量すると、70kgまで2か月です
 * --------------------------------------------------
 * 現在の体重は、【100kg】です
 * 1か月2kgのペースで減量すると、70kgまで15か月です
 * --------------------------------------------------
 * 現在の体重は、【115kg】です
 * 1か月2kgのペースで減量すると、70kgまで23か月です
 * --------------------------------------------------
 * ===============================
 *
 * ※mainメソッドの編集不可
 *
 */
public class JavaMethodBasic16 {

	public static void main(String[] args) {

		showDietPlan(70);

		showDietPlan(71);
		showDietPlan(72); // 1か月-2kg→70kg
		showDietPlan(73); // 1か月-2kg→71kg
		// ⇒1か月では足りない！2か月あれば70kgに到達する

		showDietPlan(100);
		showDietPlan(115);

	}

	public static void showDietPlan(int weight) {

		int goleWeight = 70;

		if (weight <= goleWeight) {
			System.out.println("現状あなたに提案するダイエットプランはありません");
			System.out.println("--------------------------------------------------");
			return;
		}

		System.out.println("現在の体重は、【" + weight + "kg】です");
		System.out.print("1か月2kgのペースで減量すると、" + goleWeight + "kgまで");

		int counter = 0;
		for (int i = weight; goleWeight < i; i -= 2) {
			counter++;
		}
		System.out.println(counter + "か月です");

		/* 別解
		 * double dWeight = weight;
		 * double dGoleWeight = goleWeight;
		 * double dDays = (dWeight - dGoleWeight) / 2;
		 *
		 * int iDays = (weight - goleWeight) / 2;
		 * double fraction = dDays - iDays;
		 * if(fraction >= 0.5) {
		 *    iDays = iDays + 1;
		 * }
		 * System.out.println(iDays + "か月です");
		 */

		System.out.println("--------------------------------------------------");

	}

}
