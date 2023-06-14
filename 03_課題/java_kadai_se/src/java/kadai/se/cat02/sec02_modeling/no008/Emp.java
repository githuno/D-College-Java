package java.kadai.se.cat02.sec02_modeling.no008;

public class Emp {

	/** レコードを保持する従業員表配列(最大5レコード) */
	private Row[] rowArray = new Row[5];

	/**
	 * ※有効な従業員レコード(nullではないもの)数を保持するために使用する変数
	 * レコード検索、追加、更新、削除などで利用します。
	 *  */
	private int insIndex;

	/**
	 * 従業員表(Emp)クラスのインスタンスはEmpクラス外からnewできないように、
	 * 従業員表(Emp)クラスのコンストラクタはpriveteにします。
	 */
	private Emp() {}

	/**
	 * 給料でソートし、全レコードを取得するメソッド
	 * descがtrueの場合、降順でソートする。
	 * descがfalseの場合、昇順でソートする。
	 */
	public Row[] selectAllOrderBySal(boolean desc) {
		Row[] selectRows = new Row[insIndex];

	}
}
