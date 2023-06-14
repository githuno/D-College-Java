package opst.mvc.collection;

public class ProblemSample {
	public static void main(String[] args) {

		// 「配列」の宣言と作成
		String[] strArray = new String[3];

		// 「配列」の各要素にデータを代入する
		strArray[0] = "あいうえお";
		strArray[1] = "かきくけこ";
		strArray[2] = "さしすせそ";
		strArray[3] = "たちつてと"; // ！4つ目の要素

		// もう一度、配列の各要素を確認
		System.out.println("strArray[0]は" + strArray[0]);
		System.out.println("strArray[1]は" + strArray[1]);
		System.out.println("strArray[2]は" + strArray[2]);
		System.out.println("strArray[3]は" + strArray[3]);

	}

}
