package mvc.java.kadai.se.cat02.sec01_algorithm.no024;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm24 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			System.out.print("整数を入力してください:");
			// 値の入力と数値への変換
			String line = reader.readLine();
			int num = Integer.parseInt(line);

			System.out.println( num + "!=" + factorical(num));

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/***
	 * int型の整数nの階乗を返すメソッド
	 */
	public static int factorical(int num) {
		int result = 1;
		if (num == 1 || num == 0) {
			return result;
		} else if (num > 1) {

			for (int i = num; i > 0; i--) {
				result *= i;
			}
		}
		return result;
	}
}
