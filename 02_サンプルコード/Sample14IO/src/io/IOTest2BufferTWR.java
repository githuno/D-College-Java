package io;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTest2BufferTWR {

	public static void main(String[] args) {

		try (BufferedOutputStream bos = new BufferedOutputStream(
				new FileOutputStream("test2twr.dat"));) {

			byte[] bytes = { -29, -127, -109, -29, -126, -109, -29, -127, -85,
					-29, -127, -95, -29, -127, -81 };

			bos.write(bytes);

			bos.write(0xE3);
			bos.write(0x81);
			bos.write(0x93);
			bos.write(0xE3);
			bos.write(0x82);
			bos.write(0x93);
			bos.write(0xE3);
			bos.write(0x81);
			bos.write(0xAB);
			bos.write(0xE3);
			bos.write(0x81);
			bos.write(0xA1);
			bos.write(0xE3);
			bos.write(0x81);
			bos.write(0xAF);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}