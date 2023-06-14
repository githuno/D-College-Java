package mvc.java.kadai.se.cat02.sec01_algorithm.no021;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm21 {
	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("小数を入力してください。");

			System.out.print("小数:");
			// 値の入力と数値への変換
			String line = reader.readLine();
			double num = Double.parseDouble(line);

			System.out.println("四捨五入すると" + round(num) + "です。");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * double型の値の小数第1位を四捨五入して整数を返すメソッド
	 */
	public static int round(double x) {

		//小数第１位を取り出す
		int value = (int) (x * 10 % 10);

		if (x < 0) {
			// 負の数の場合

			// -4～0ならそのままintにキャスト
			if (-5 < value && value <= 0) {
				return (int) x;
			} else {
				return (int) x - 1;
			}
		} else {
			// 正の数の場合

			//0～4ならそのままintにキャスト
			if (0 <= value && value < 5) {
				return (int) x;
			} else {
				return (int) x + 1;
			}
		}
	}

}
