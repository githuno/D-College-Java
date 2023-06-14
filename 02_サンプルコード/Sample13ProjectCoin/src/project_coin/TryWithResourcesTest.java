package project_coin;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TryWithResourcesTest {

	public static void main(String[] args) {
		// ファイルパスを指定
		String inputFilePath = "C://研修/input.txt";
		String outputFilePath = "C://研修/output.txt";


		// Java6まで(finallyを使ってリソース開放)

		// 変数の宣言
		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			// リソース取得
			in = new FileInputStream(inputFilePath);
			out = new FileOutputStream(outputFilePath);

			// 読みだす変数
			int code;

			// 文字を読み出して書き込む
			while ( (code = in.read()) != -1 ) {
				out.write(code);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// finally句でリソースを開放します
			if ( in != null ) {
				try {
					in.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			if ( out != null ) {
				try {
					out.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

		// Java7以降(try with resouses)
//		try(
//			FileInputStream in = new FileInputStream(inputFilePath);
//			FileOutputStream out = new FileOutputStream(outputFilePath);
//			){
//			// 読みだす変数
//			int code;
//
//			// 文字を読み出して書き込む
//			while ( (code = in.read()) != -1 ) {
//				out.write(code);
//			}
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
	}
}
