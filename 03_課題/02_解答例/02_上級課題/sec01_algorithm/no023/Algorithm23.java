package mvc.java.kadai.se.cat02.sec01_algorithm.no023;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm23 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("平行四辺形を作りましょう。");

			// 値の入力と数値への変換
			System.out.print("横幅:");
			String line = reader.readLine();
			int width = Integer.parseInt(line);

			System.out.print("高さ:");
			line = reader.readLine();
			int height = Integer.parseInt(line);

			for (int i = height - 1; i >= 0; i--) {
				for (int j = 0; j < i; j++) {
					System.out.print(" ");
				}
				putChars('+', width);
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 文字chをn個連続して出力するメソッド
	 */
	public static void putChars(char ch, int n) {
		for (int i = 0; i < n; i++) {
			System.out.print(ch);
		}

	}

}
