package mvc.java.kadai.se.cat02.sec01_algorithm.no022;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm22 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("2つの整数を入力してください。");

			// 値の入力と数値への変換
			System.out.print("整数1:");
			String line = reader.readLine();
			int num1 = Integer.parseInt(line);

			System.out.print("整数2:");
			line = reader.readLine();
			int num2 = Integer.parseInt(line);

			System.out.println("中間値は" + medium(num1, num2) + "です。");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * int型の値x,yの中間の値を返すメソッド
	 */
	public static int medium(int x, int y) {
		return round((double) (x + y) / 2);

	}

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
