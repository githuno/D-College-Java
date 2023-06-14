package nio;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOTest2Buffer{

	public static void main(String[] args){

		BufferedWriter bw = null;

		try {
			// newBufferedWriter:
			// FilesクラスからBufferedWriterオブジェクトを取得する

			bw = Files.newBufferedWriter(Paths.get("testNIO2_1.dat"), StandardCharsets.UTF_8 ,StandardOpenOption.CREATE);

			// 引数に指定できるのは、String、char[]、int
			bw.write("こんにちは");
			bw.write(new char[] {'こ','ん','ば','ん','は'});
			bw.write("abcdefghijklmnopqrstuvwxyz",3,5);//：defgh (substringのように、開始indexとlengthを指定している）

			// Hello
			bw.write(0x48);
			bw.write(0x65);
			bw.write(0x6C);
			bw.write(0x6C);
			bw.write(0x6F);
			bw.write(0x21);




		} catch (IOException e) {
			// 例外処理
			e.printStackTrace();
		} finally {
			// リソース開放
			try {
				if ( bw != null ) {
					bw.close();
				}
			} catch(IOException e) {
				// 例外処理
				e.printStackTrace();
			}
		}

	}

}