package java.kadai.se.cat02.sec02_modeling.no006;

public class Emp {

	/** レコードを保持する従業員表配列(最大5レコード) */
	private Row[] rowArray = new Row[5];

	/**
	 * ※有効な従業員レコード(nullではないもの)数を保持するために使用する変数
	 * レコード検索、追加、更新、削除などで利用します。
	 *  */
	private int insIndex;

	/**
	 * 従業員表に1行レコードを追加するメソッド
	 */
	public void insert(Row insRow) {

	}

	/**
	 * 指定した従業員番号に当てはまるレコードを更新するメソッド。
	 * 従業員番号に該当するレコードが存在し、更新が成功した場合1を、
	 * 従業員番号に該当するレコードが存在せず、更新を行わなかった場合0を返却します。
	 */
	public int updateByEmpno(int empno, Row updateRow) {

	}

	/**
	 * 指定した従業員番号に当てはまるレコードを削除するメソッド。
	 * 従業員番号に該当するレコードが存在し、削除が成功した場合1を、
	 * 従業員番号に該当するレコードが存在せず、削除を行わなかった場合0を返却します。
	 */
	public int deleteByEmpno(int empno) {

	}

	/**
	 * 従業員表に登録されている全レコードを取得するメソッド
	 */
	public Row[] selectAll() {
		Row[] selectRows = new Row[insIndex];

	}

	/**
	 * 従業員表に登録されている全レコードの従業員番号一覧を取得するメソッド
	 */
	public int[] selectAllEmpno() {
		int[] empNoArray = new int[insIndex];

	}

	/**
	 * 指定した従業員番号に当てはまるレコードを取得する
	 */
	public Row selectByPrimaryKey(int empno) {

	}

	/**
	 * 指定した従業員名に当てはまるレコードを取得する。
	 * 同じ名前の従業員がいる可能性があるため戻り値のデータ型が「Row[]」になっている。
	 */
	public Row[] selectByName(String name) {

	}

	/**
	 * 従業員表に登録されている従業員中、最も高い給料を取得するメソッド
	 */
	public int selectMaxSal() {

	}

	/**
	 * 従業員表の件数を取得するメソッド
	 */
	public int selectRowCount() {
		return insIndex;
	}
}
