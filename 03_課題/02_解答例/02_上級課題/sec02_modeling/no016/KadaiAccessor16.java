package mvc.java.kadai.se.cat02.sec02_modeling.no016;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * モデリング問題16 回答例
 *
 *
 */
public class KadaiAccessor16 {

	public static void main(String[] args) {

		AccessorFactory factory = new AccessorFactory();

		// try-with-resources文を使用
		try (BufferedReader nameBr = new BufferedReader(new InputStreamReader(System.in));) {

			System.out.print("フィールドの型を入力してください:");
			String typeName = nameBr.readLine();

			System.out.print("フィールドの名前を入力してください:");
			String fieldName = nameBr.readLine();

			factory.createAccessor(typeName, fieldName);
			System.out.print("ファイルを出力しました。");

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}