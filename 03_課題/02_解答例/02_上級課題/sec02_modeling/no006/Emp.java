package mvc.java.kadai.se.cat02.sec02_modeling.no006;

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

		if (insRow.getEmpno() == 0) {
			System.out.println("従業員番号に0は挿入できません");
			return;
		}

		for (int i = 0; i < insIndex; i++) {
			if (rowArray[i] == null) {
				continue;
			}

			if (insRow.getEmpno() == rowArray[i].getEmpno()) {
				System.out.println("主キーが重なっているので挿入できません");
				return;
			}
		}

		if (insIndex == rowArray.length) {
			System.out.println("もう挿入できません");
			return;

		} else if (insIndex < rowArray.length) {
			rowArray[insIndex] = insRow;
			insIndex++;
			System.out.println(insRow.getEname() + "さんの情報が一行挿入されました");
		}
	}

	/**
	 * 指定した従業員番号に当てはまるレコードを更新するメソッド。
	 * 従業員番号に該当するレコードが存在し、更新が成功した場合1を、
	 * 従業員番号に該当するレコードが存在せず、更新を行わなかった場合0を返却します。
	 */
	public int updateByEmpno(int empno, Row updateRow) {
		for (int i = 0; i < insIndex; i++) {
			if (empno == rowArray[i].getEmpno()) {
				rowArray[i] = updateRow;
				return 1;
			}
		}
		return 0;
	}

	/**
	 * 指定した従業員番号に当てはまるレコードを削除するメソッド。
	 * 従業員番号に該当するレコードが存在し、削除が成功した場合1を、
	 * 従業員番号に該当するレコードが存在せず、削除を行わなかった場合0を返却します。
	 */
	public int deleteByEmpno(int empno) {
		for (int i = 0; i < rowArray.length; i++) {

			if (rowArray[i] == null) {
				continue;
			}

			if (empno == rowArray[i].getEmpno()) {
				rowArray[i] = null;

				if (i < rowArray.length - 1) {
					for (int j = i; j < rowArray.length - 1; j++) {
						rowArray[j] = rowArray[j + 1];
					}
					rowArray[rowArray.length - 1] = null;
				}

				insIndex--;
				return 1;
			}
		}
		return 0;
	}

	/**
	 * 従業員表に登録されている全レコードを取得するメソッド
	 */
	public Row[] selectAll() {
		Row[] selectRows = new Row[insIndex];

		for(int i=0; i < selectRows.length; i++) {
			selectRows[i] = rowArray[i];
		}

		return selectRows;
	}

	/**
	 * 従業員表に登録されている全レコードの従業員番号一覧を取得するメソッド
	 */
	public int[] selectAllEmpno() {
		int[] empNoArray = new int[insIndex];
		for (int i = 0; i < insIndex; i++) {
			empNoArray[i] = rowArray[i].getEmpno();
		}
		return empNoArray;
	}

	/**
	 * 指定した従業員番号に当てはまるレコードを取得する
	 */
	public Row selectByPrimaryKey(int empno) {
		Row pk = null;

		for (int i = 0; i < insIndex; i++) {
			if (rowArray[i] == null) {
				continue;
			}

			if (empno == rowArray[i].getEmpno()) {
				pk = rowArray[i];
				break;
			}
		}
		return pk;
	}

	/**
	 * 指定した従業員名に当てはまるレコードを取得する。
	 * 同じ名前の従業員がいる可能性があるため戻り値のデータ型が「Row[]」になっている。
	 */
	public Row[] selectByName(String name) {
		int rowCount = 0;
		for (int i = 0; i < insIndex; i++) {
			if (name.equals(rowArray[i].getEname())) {
				rowCount++;
			}
		}

		Row[] selectRows = new Row[rowCount];
		int selectRowCount = 0;
		for (int i = 0; i < insIndex; i++) {
			if (name.equals(rowArray[i].getEname())) {
				selectRows[selectRowCount] = rowArray[i];
				selectRowCount++;
			}
		}
		return selectRows;
	}

	/**
	 * 従業員表に登録されている従業員中、最も高い給料を取得するメソッド
	 */
	public int selectMaxSal() {

		int maxSal = 0;

		for (int i = 0; i < insIndex; i++) {
			if (rowArray[i].getSal() > maxSal) {
				maxSal = rowArray[i].getSal();
			}
		}
		return maxSal;
	}

	/**
	 * 従業員表の件数を取得するメソッド
	 */
	public int selectRowCount() {
		return insIndex;
	}
}
