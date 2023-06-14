package mvc.java.kadai.se.cat02.sec01_algorithm.no020;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 * Javaアルゴリズム問題20
 */
public class Algorithm20 {

	public static void main(String[] args) {


		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("5人の点数を入力してください。");

			// 5人分の点数を格納する配列
			int[] pointArray = new int[5];

			for (int i = 0; i < pointArray.length; i++) {

				System.out.print(i + 1 + "人目:");
				// 値の入力と数値への変換
				String line = reader.readLine();
				pointArray[i] = Integer.parseInt(line);

			}

			// 描画
			System.out.println("最低点は" + minOf(pointArray) + "点です。");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 引数で指定されたint型配列の中で
	 * 最も低い点数を返却するメソッド
	 */
	public static int minOf(int[] x) {

		int min = x[0];

		for (int i = 0; i < x.length; i++) {
			if (x[i] <= min) {
				min = x[i];
			}
		}

		return min;

	}
}
