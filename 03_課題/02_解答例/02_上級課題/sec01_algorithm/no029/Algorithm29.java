package mvc.java.kadai.se.cat02.sec01_algorithm.no029;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm29 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {

			System.out.println("文字を入力してください。");

			String line = reader.readLine();
			int length = line.length();
			int[] count = new int[10];

			// 文字列の中の数字の個数を数える
			for (int i = 0; i < length; i++) {
				char c = line.charAt(i);

				for (int j = 0; j < count.length; j++) {
					if (String.valueOf(c).equals(String.valueOf(j))) {
						count[j]++;
					}
				}
			}

			// 画面描画
			System.out.println("数字文字の出現回数");
			for (int i = 0; i < count.length; i++) {
				System.out.print("'" + i + "' : ");
				for (int j = 0; j < count[i]; j++) {
					System.out.print("*");
				}
				System.out.println();
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
