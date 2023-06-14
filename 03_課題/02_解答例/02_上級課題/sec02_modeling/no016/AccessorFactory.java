package mvc.java.kadai.se.cat02.sec02_modeling.no016;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * モデリング問題16 回答例
 *
 *
 */
public class AccessorFactory {

	private static final String FILE_NAME = "accessor.txt";

	/**
	 * フィールドの型名と変数名をパラメーターとして受け取り、
	 * setter/getterのコードを生成してファイルに出力するメソッド
	 *
	 * @param typeName
	 * @param fieldName
	 */
	public void createAccessor(String typeName, String fieldName) {

		// 文字列
		String upperField = getUpperString(fieldName);

		// アクセサ全体を組み立てる
		String acc = "public void set" + upperField + "(" + typeName + " " + fieldName + "){"
				+ "\r\n"
				+ "  this." + fieldName + " = " + fieldName + ";"
				+ "\r\n"
				+ "}"
				+ "\r\n"
				+ "public " + typeName + " get" + upperField + "(){"
				+ "\r\n"
				+ "  return " + fieldName + ";"
				+ "\r\n"
				+ "}"
				+ "\r\n";

		// try-with-resources文を使用
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(FILE_NAME));){

			// ファイル出力
			bw.write(acc);

		} catch (IOException e) {
			e.printStackTrace();
		}

	}


	/**
	 * 指定された１文字目を大文字に変換する
	 * 例) name ⇒ Name
	 * @param str
	 * @return
	 */
	private String getUpperString(String str) {

		// substring(int beginIndex, int endIndex)メソッド
		// この文字列の部分文字列である文字列を返します。
		// 部分文字列は、指定されたbeginIndexから始まり、インデックスendIndex - 1にある文字までです。
		//
		// 例)
		// 「name」という文字列のIndexは「n[0]」「a[1]」「m[2]」「e[3]」になります。
		// substring(0, 1)の指定は「Index0から(1-1)までの部分文字列」となり
		// Index0から0 ⇒ 【先頭1文字】です。
		//
		// toUpperCaseはStringクラスから提供されているメソッドで、
		// String内のすべての文字を大文字に変換します。
		//
		// substring(int beginIndex)メソッドは指定されたbeginIndexの文字を含み、末尾までの
		// 部分文字列を返します。
		//
		// よって以下lowerStrは「N + ame」 ⇒ 「Name」となります

		String upperStr = str.substring(0, 1).toUpperCase() + str.substring(1);
		return upperStr;
	}

}
