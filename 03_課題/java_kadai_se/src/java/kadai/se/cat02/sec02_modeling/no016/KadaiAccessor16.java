package java.kadai.se.cat02.sec02_modeling.no016;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KadaiAccessor16 {

	public static void main(String[] args) {

		// try-with-resources文を使用
		try (BufferedReader nameBr = new BufferedReader(new InputStreamReader(System.in));) {

			System.out.print("フィールドの型を入力してください:");
			String typeName = nameBr.readLine();

			System.out.print("フィールドの名前を入力してください:");
			String fieldName = nameBr.readLine();


		} catch (IOException e) {
			e.printStackTrace();
		}



	}

}
