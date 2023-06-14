package java.kadai.se.cat02.sec02_modeling.no018;

/**
 * モデリング問題18 回答例
 *
 *
 */
public class KadaiInsert18 {

	public static void main(String[] args) {

		SQLFactory factory = new SQLFactory();

		factory.createInsertFromCSV("emp.csv", "output.txt");

	}

}
