package mvc.java.kadai.se.cat02.sec01_algorithm.no025;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm25 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("配列のサイズを入力してください。");

			// 値の入力と数値への変換
			System.out.print("サイズ:");
			String line = reader.readLine();
			int size = Integer.parseInt(line);

			System.out.println("配列を初期化する値を入力してください。");

			System.out.print("値:");
			line = reader.readLine();
			int value = Integer.parseInt(line);

			int[] intArray = new int[size];
			fillArray(intArray, value);

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
	public static void fillArray(int[] x, int value) {
		for (int i = 0; i < x.length; i++) {
			x[i] = value;
		}
	}
}
