package java.kadai.se.cat02.sec01_algorithm.no028;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algorithm28 {

	public static void main(String[] args) {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		try {
			// 値の入力と数値への変換
			String line = reader.readLine();
			int size = Integer.parseInt(line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
