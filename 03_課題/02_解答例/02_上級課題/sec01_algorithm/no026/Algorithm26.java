package mvc.java.kadai.se.cat02.sec01_algorithm.no026;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm26 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("配列のサイズを入力してください");

			// 値の入力と数値への変換
			System.out.print("サイズ:");
			String line = reader.readLine();
			int size = Integer.parseInt(line);

			int[] intArray = new int[size];

			System.out.println("値を入力してください");
			for (int i = 0; i < intArray.length; i++) {
				System.out.print("x[" + i + "]=");
				line = reader.readLine();
				int value = Integer.parseInt(line);
				intArray[i] = value;
			}

			reverseArray(intArray);

			System.out.println("リバースしました");

			for (int i = 0; i < intArray.length; i++) {
				System.out.println("x[" + i + "]=" + intArray[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * int型の配列xの全要素にvalueを代入するメソッド
	 */
	public static void reverseArray(int[] x) {

		// 一時保管領域の作成
		int tmpSize = x.length;
		int[] tmpArray = new int[tmpSize];

		// 一時保管配列に反転して格納していく
		int count = tmpArray.length - 1;
		for (int i = 0; i < tmpArray.length; i++) {
			tmpArray[i] = x[count];
			count--;
		}

		// 一時保管配列の内容をはじめの配列に上書きコピーする
		for (int i = 0; i < x.length; i++) {
			x[i] = tmpArray[i];
		}

		// System.arraycopy()を使用した場合
		// System.arraycopy(tmpArray, 0, x, 0, x.length);

	}
}
