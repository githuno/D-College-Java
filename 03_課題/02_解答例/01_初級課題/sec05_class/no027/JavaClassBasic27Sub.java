package mvc.java.kadai.se.cat01.sec05_class.no027;

public class JavaClassBasic27Sub {

	private int[] intArray = new int[30];

	public JavaClassBasic27Sub() {
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = i + 1; // intArray配列に1~30までの整数を格納
		}
	}

	public int[] getDivisorIntArray(int number) {

		int count = 0;

		// 戻り値として返す配列に必要な要素数を算出する
		for (int i : intArray) {
			if(i % number == 0) {
				count++;
			}
		}

		int[] divisorIntArray = new int[count];
		count = 0; //カウントリセット

		for (int i = 0; i < intArray.length; i++) {
			if(intArray[i] % number == 0) {
				divisorIntArray[count] = intArray[i];
				count++;
			}
		}
		return divisorIntArray;
	}

}
