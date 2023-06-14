package nio;

import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOTest3WriterTWR {

	public static void main(String[] args) {

		try (CharArrayWriter caw = new CharArrayWriter();
				PrintWriter pw = new PrintWriter(caw);
				PrintWriter filePw = new PrintWriter(Files.newBufferedWriter(Paths.get("test3twr.dat")));
				BufferedReader br = Files.newBufferedReader(Paths.get("test3.dat"));) {

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