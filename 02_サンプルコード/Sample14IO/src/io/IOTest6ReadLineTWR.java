package io;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class IOTest6ReadLineTWR {

	public static void main(String[] args) {

		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in));) {

			System.out.println("文字列を入力してください。");

			String line = br.readLine();

			System.out.println("入力された文字列->" + line);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}