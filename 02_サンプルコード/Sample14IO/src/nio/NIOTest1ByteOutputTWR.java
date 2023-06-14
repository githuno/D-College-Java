package nio;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class NIOTest1ByteOutputTWR {

	public static void main(String[] args) {

		/* **************************************************************************************/
		// [4] FilesクラスからOutputStreamオブジェクトを取得する

		Path dstForOS = Paths.get("testNIO1twr.dat");
		try (OutputStream os = Files.newOutputStream(dstForOS, StandardOpenOption.CREATE)) {

			byte[] bytes = { -29, -127, -109, -29, -126, -109, -29, -127, -85,
					-29, -127, -95, -29, -127, -81 };

			os.write(bytes);

			os.write(0xE3);
			os.write(0x81);
			os.write(0x93);
			os.write(0xE3);
			os.write(0x82);
			os.write(0x93);
			os.write(0xE3);
			os.write(0x81);
			os.write(0xAB);
			os.write(0xE3);
			os.write(0x81);
			os.write(0xA1);
			os.write(0xE3);
			os.write(0x81);
			os.write(0xAF);

			// System.out.println(os.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}