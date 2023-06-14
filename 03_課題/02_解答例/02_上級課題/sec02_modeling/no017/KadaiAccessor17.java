package mvc.java.kadai.se.cat02.sec02_modeling.no017;

/**
 * モデリング問題17 回答例
 *
 *
 */
public class KadaiAccessor17 {

	public static void main(String[] args) {

		AccessorFactory factory = new AccessorFactory();
		factory.createAccessorFromCSV("src.csv", "output.txt");

	}

}
