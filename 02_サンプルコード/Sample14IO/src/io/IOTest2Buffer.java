package io;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class IOTest2Buffer{

	public static void main(String[] args){

		// フィルタ系OutputStream(BufferedOutputStream)クラスを使う
		FileOutputStream fos = null;
		OutputStream bos = null;

		try{

			fos = new FileOutputStream("test2.dat");

			bos = new BufferedOutputStream( fos );

			byte[] bytes = { -29, -127, -109, -29, -126, -109, -29, -127, -85,
					-29, -127, -95, -29, -127, -81 };

			// デバックモードでステップ実行してみる
			// フィールドbufの状態を見てみる
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

			bos.close();

		} catch(IOException e){
			// 例外処理
			e.printStackTrace();
		} finally {
			// リソース開放
			// 基本的には逆順でcloseする
			try {
				if ( bos != null ) {
					bos.close();
				}
				if ( fos != null ) {
					fos.close();
				}
			} catch(IOException e) {
				// 例外処理
				e.printStackTrace();
			}
		}

	}

}