package mvc.java.kadai.se.cat02.sec01_algorithm.no030;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm30 {

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

			// カウントした中で最大の値を探す
			int maxCount = 0;
			for (int i = 0; i < count.length; i++) {
				if (maxCount < count[i]) {
					maxCount = count[i];
				}
			}

			System.out.println("数字文字の出現回数");

			// 表示用の配列を作成
			char[][] display = new char[10][maxCount];

			for (int counter = maxCount - 1; 0 <= counter; counter--) {
				for (int number = 0; number <= 9; number++) {
					if (count[number] <= counter) {
						//System.out.println("number->" + number + "   counter->" +counter );
						//System.out.println("count[" + number + "]->" + count[number]);
						display[number][counter] = ' ';
					} else {
						//System.out.println("number->" + number + "   counter->" +counter );
						//System.out.println("count[" + number + "]->" + count[number]);
						display[number][counter] = '*';
					}
				}
			}

			// 画面表示
			for (int y = maxCount - 1; 0 <= y; y--) {
				for (int x = 0; x < count.length; x++) {
					System.out.print(display[x][y]);
				}
				System.out.println();
			}

			for (int i = 0; i <= 9; i++) {
				System.out.print(i);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
