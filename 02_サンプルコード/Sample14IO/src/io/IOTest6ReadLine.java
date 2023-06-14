package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest6ReadLine {

	public static void main(String[] args) {

		BufferedReader br = null;
		try {

			System.out.println("文字列を入力してください。");

			br = new BufferedReader(new InputStreamReader(System.in));

			String line = br.readLine();

			System.out.println("入力された文字列->" + line);

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if( br != null ) {
					br.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}