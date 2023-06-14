package io;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest1ByteOutputTWR {

	public static void main(String[] args) {

		try (OutputStream fos = new FileOutputStream("test1twr.dat");) {
			// try (OutputStream fos = new ByteArrayOutputStream();) {

			byte[] bytes = { -29, -127, -109, -29, -126, -109, -29, -127, -85,
					-29, -127, -95, -29, -127, -81 };

			fos.write(bytes);

			fos.write(0xE3);
			fos.write(0x81);
			fos.write(0x93);
			fos.write(0xE3);
			fos.write(0x82);
			fos.write(0x93);
			fos.write(0xE3);
			fos.write(0x81);
			fos.write(0xAB);
			fos.write(0xE3);
			fos.write(0x81);
			fos.write(0xA1);
			fos.write(0xE3);
			fos.write(0x81);
			fos.write(0xAF);

			// System.out.println(fos.toString());

		} catch (IOException e) {
			e.printStackTrace();

		}

	}

}