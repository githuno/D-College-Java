package mvc.java.kadai.se.cat02.sec01_algorithm.no027;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm27 {

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

			int[] newArray = reverseArrayCopy(intArray);

			System.out.println("コピーしてリバースしました");
			for (int i = 0; i < newArray.length; i++) {
				System.out.println("y[" + i + "]=" + newArray[i]);
			}

			System.out.println("元の配列を表示します");
			for (int i = 0; i < intArray.length; i++) {
				System.out.println("x[" + i + "]=" + intArray[i]);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * int型の配列xを受け取り、
	 * 値を逆に入れ替えた新しい配列を作成しその参照を返すメソッド
	 */
	public static int[] reverseArrayCopy(int[] x) {

		// 一時保管領域の作成
		int tmpSize = x.length;
		int[] tmpArray = new int[tmpSize];

		// 一時保管配列に反転して格納していく
		int count = tmpArray.length - 1;
		for (int i = 0; i < tmpArray.length; i++) {
			tmpArray[i] = x[count];
			count--;
		}

		return tmpArray;
	}
}
