package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.CharArrayWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOTest3WriterTWR {

	public static void main(String[] args) {

		try (CharArrayWriter caw = new CharArrayWriter();
				PrintWriter pw = new PrintWriter(caw);
				PrintWriter filePw = new PrintWriter(new BufferedWriter(new FileWriter("test3twr.dat")));
				BufferedReader br = new BufferedReader(new FileReader("test3twr.dat"));) {

			pw.print("こんにちは");
			pw.print(123);
			pw.print('!');
			pw.print(true);

			String str = caw.toString();
			System.out.println(str);

			char[] buf = caw.toCharArray();
			for (char c : buf) {
				System.out.print(c);
			}
			System.out.println();

			// -----------------------------------------------------------------------------------

			filePw.println("------------------");
			filePw.print("こんばんは");
			filePw.print(123);
			filePw.print('!');
			filePw.print(true);
			filePw.flush();

			// -----------------------------------------------------------------------------------

			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}