package mvc.java.kadai.se.cat02.sec02_modeling.no018;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * モデリング問題18 回答例
 *
 *
 */
public class SQLFactory {

	/**
	 * フィールドの型名と変数名をパラメーターとして受け取り、
	 * sqlを生成するメソッド
	 *
	 * @param typeName
	 * @param fieldName
	 */
	public String createSQL(String tableName, String columns, String[] values) {

		// SQLを組み立てる
		String sql = "INSERT "
				+ "INTO "
				+ tableName
				+ " ("
				+ columns
				+ ")\r\n VALUES (";

		for (int i = 0; i < values.length; i++) {

			if (values[i] == null || "".equals(values[i])) {

				// null,空文字の場合「NULL」文字列を出力
				sql = sql + "NULL";

			} else if (i == 1 || i == 2 || i == 4) {

				// ENAME,JOB,HIREDATEは文字列型、日付型のためクォーテーションで囲む
				sql = sql + "'" + values[i] + "'";

			} else {
				sql = sql + values[i];
			}

			if (i != (values.length - 1)) {
				sql = sql + ",";

			} else {
				sql = sql + ");\r\n";
			}

		}

		return sql;
	}

	/**
	 * csvファイルパスを第1パラメーターで受け取り、
	 * sqlを生成してコンソール出力と、第2パラメーターで指定したファイルの両方に出力する
	 *
	 * @param inFile
	 * @param outFile
	 */
	public void createInsertFromCSV(String csvFileName, String outputFileName) {

		// try-with-resources文
		try (BufferedReader br = new BufferedReader(new FileReader(csvFileName));
				BufferedWriter bw = new BufferedWriter(new FileWriter(outputFileName));) {

			String tableName = null;
			String columns = null;

			String line = null;
			int count = 1;
			while ((line = br.readLine()) != null) {

				if (count == 1) {

					//1行目はテーブル名
					tableName = line;
					count++;

				} else if (count == 2) {

					//2行目は列名一覧
					columns = line;
					count++;

				} else {
					//splitの第2引数は「結果のしきい値」です。
					//
					String[] split = line.split(",", -1);
					//System.out.println(split[0]);
					//System.out.println(split[1]);

					String dist = createSQL(tableName, columns, split);

					bw.write(dist);
					System.out.println(dist);

				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
