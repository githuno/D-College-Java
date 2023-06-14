package nio;
import java.io.BufferedReader;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NIOTest3Writer {

	public static void main(String[] args) {

		// ※IOTest3Writerと同内容↓
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
		// ※IOTest3Writerと同内容↑

		// -----------------------------------------------------------------------------------



		PrintWriter filePw = null;
		BufferedReader br = null;

		try {
			// newBufferedWriter:
			// FilesクラスからBufferedWriterオブジェクトを取得する
			filePw = new PrintWriter(Files.newBufferedWriter(Paths.get("test3.dat")));

			filePw.println("------------------");
			filePw.print("こんばんは");
			filePw.print(123);
			filePw.print('!');
			filePw.print(true);
			filePw.flush();

			// newBufferedReader:
			// FilesクラスからBufferedReaderオブジェクトを取得する
			br = Files.newBufferedReader(Paths.get("test3.dat"));
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