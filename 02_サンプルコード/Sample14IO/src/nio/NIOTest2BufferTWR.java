package nio;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOTest2BufferTWR {

	public static void main(String[] args) {

		try (BufferedWriter bw  = Files.newBufferedWriter(Paths.get("testNIO2_3.dat"), StandardCharsets.UTF_8 ,StandardOpenOption.CREATE)) {

			bw.write("こんにちは");
			bw.write(new char[] {'こ','ん','ば','ん','は'});
			bw.write("abcdefghijklmnopqrstuvwxyz",3,5);

			bw.write(0x48);
			bw.write(0x65);
			bw.write(0x6C);
			bw.write(0x6C);
			bw.write(0x6F);
			bw.write(0x21);


		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}