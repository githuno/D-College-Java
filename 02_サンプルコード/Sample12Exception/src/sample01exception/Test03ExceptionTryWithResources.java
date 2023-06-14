package sample01exception;

import java.io.FileReader;
import java.io.IOException;

public class Test03ExceptionTryWithResources {

	public static void main(String[] args) {

		// Java7から追加されたtry-with-resources文
		// リソース取得をtryの引数で受け取る
		// TryWithResourcesが使えるのはAutoCloseインタフェースを実装しているクラスのみ
		try(FileReader fr = new FileReader("test.csv")) {

			// 読込み処理
			int data = 0;
			while ((data = fr.read()) > 0) {
				System.out.println((char) data);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// tryブロックが正常終了でも例外発生でもfinallyブロックに処理が遷移する
			// finallyブロックが実行される前にリソースが開放される
			System.out.println("--- finally処理 ---");
			// TryWithResourcesで、通常リソース管理でfinally句を書く必要が無くなった
		}
	}

}
