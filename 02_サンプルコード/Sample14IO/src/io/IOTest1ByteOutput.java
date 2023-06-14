package io;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest1ByteOutput {

	public static void main(String[] args) {

		// リソース（OutputStreamオブジェクト）用の変数宣言
		// (tryブロックのスコープがあるのでブロック外で変数を宣言)
		OutputStream fos = null;

		try {
			// リソース取得
			//fos = new FileOutputStream("test1.dat");	// 1byte毎での書込み
			fos = new ByteArrayOutputStream();		// 1byte配列での書込み


			// 10進法「-29」→ 16進法「E3」→ 2進法「11100011」
			// ※2進法の 8ケタ = 8bit = 1byte

			// 1byte配列での書込み
			byte[] bytes = { -29, -127, -109, -29, -126, -109, -29, -127, -85, -29, -127, -95, -29, -127, -81 };

			fos.write(bytes);

			// 1byteでの書込み
			int a = 0xE3; // 接頭辞0xは16進数リテラル

			fos.write(a);
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
			// 例外処理
			e.printStackTrace();

		} finally {

			// リソース開放
			try {
				// nullチェック
				if ( fos != null ) {
					fos.close();
				}
			} catch(IOException e) {
				e.printStackTrace();
			}

		}

	}

}