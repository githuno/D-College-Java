package sample01exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test03ExceptionNotTWR {

	public static void main(String[] args) {

		// ファイル読込オブジェクトを代入する変数
		FileReader fr = null;

		try {

			// test.csvを読込みで開く（リソースを取得）
			fr = new FileReader("test.csv");	// 「FileNotFoundException」発生の可能性あり

			int data = 0;
			// test.csvより1文字読込み
			while ((data = fr.read()) > 0) { //「IOException」発生の可能性あり
				System.out.print((char) data);
			}
			System.out.println();

		} catch (FileNotFoundException e) {
			// 例外情報を出力(詳しくはJavaVMの動きで解説)
			e.printStackTrace();
		} catch (IOException e) {
			// 例外情報を出力(詳しくはJavaVMの動きで解説)
			e.printStackTrace();
		} finally {
			// finallyブロックで後始末(リソースの開放)を行う
			System.out.println("--- finally処理 ---");
			try {
				// test.csvファイルを閉じる
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		System.out.println("--- 処理終了 ---");
	}

}
