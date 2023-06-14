package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOTest3Writer {

	public static void main(String[] args) {

		//
		CharArrayWriter caw = new CharArrayWriter();

		PrintWriter pw = new PrintWriter(caw);

		pw.print("こんにちは");
		pw.print(123);
		pw.print('!');
		pw.print(true);

		pw.close();

		String str = caw.toString();
		System.out.println(str);

		char[] buf = caw.toCharArray();
		for (char c : buf) {
			System.out.print(c);
		}
		System.out.println();

		// -----------------------------------------------------------------------------------

		PrintWriter filePw = null;
		BufferedReader br = null;
		try {
			filePw = new PrintWriter(new BufferedWriter(new FileWriter("test3.dat")));

			filePw.println("------------------");
			filePw.print("こんばんは");
			filePw.print(123);
			filePw.print('!');
			filePw.print(true);
			filePw.flush();

			// -----------------------------------------------------------------------------------

			br = new BufferedReader(new FileReader("test3.dat"));

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			// 例外処理
			e.printStackTrace();
		} finally {
			// リソース開放
			try {
				if (br != null) {
					br.close();
				}
				if (filePw != null) {
					filePw.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}