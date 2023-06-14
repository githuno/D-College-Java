package java.kadai.se.cat02.sec02_modeling.no007;

public class Dept {

	/** 部門レコードを保持する部門表配列(最大5レコード) */
	private RowDept[] rowDeptArray = new RowDept[5];

	/**
	 * ※有効な従業員レコード(nullではないもの)数を保持するために使用する変数
	 */
	private int insIndex;

	/**
	 * 従業員表に1行レコードを追加するメソッド
	 *
	 */
	public void insert(RowDept rowDept) {

	}

	/**
	 * 従業員表に登録されている全レコードを取得するメソッド
	 */
	public RowDept[] selectAll() {
		RowDept[] selectRows = new RowDept[insIndex];

	}

}
