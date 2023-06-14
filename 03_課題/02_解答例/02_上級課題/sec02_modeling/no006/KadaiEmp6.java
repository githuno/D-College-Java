package mvc.java.kadai.se.cat02.sec02_modeling.no006;
public class KadaiEmp6 {

	public static void main(String[] args) {

		Emp emp = new Emp();

		System.out.println("======= 従業員表にレコードを追加する(insert(Row row)メソッド) ========");

		emp.insert(new Row(1111,"すみす","一般社員",800));
		emp.insert(new Row(2222,"ありす","受付係",400));

		// 同じ従業員番号を入れる
		emp.insert(new Row(1111,"かれん","一般社員",900));

		// 従業員番号0をいれる
		emp.insert(new Row(0,"じょーじ","派遣社員",100));

		emp.insert(new Row(3333,"けん","一般社員",8400));
		emp.insert(new Row(4444,"めありー","一般社員",8000));

		// 同じ名前の人をいれる
		emp.insert(new Row(5555,"けん","派遣社員",800));

		// 6人目をいれる
		emp.insert(new Row(6666,"べす","一般社員",800));

		System.out.println("======= 従業員表にレコードを追加しました(insert(Row row)メソッド) ========");


		System.out.println();


		System.out.println("======= 今の従業員表登録件数を表示開始(selectRowCount()メソッド) ========");

		System.out.println("今従業員表には" + emp.selectRowCount() + "件登録されています。");

		System.out.println("======= 今の従業員表登録件数を表示終了(selectRowCount()メソッド) ========");


		System.out.println();


		System.out.println("======= 指定した従業員番号に該当するレコードを削除開始(deleteByEmpno(int empno)メソッド) ========");

		// 存在しない従業員番号を指定し削除する
		System.out.println("削除された行は" + emp.deleteByEmpno(7777));

		// 存在する従業員番号(めありーさん)を削除する
		System.out.println("削除された行は" + emp.deleteByEmpno(4444));

		System.out.println("======= 指定した従業員番号に該当するレコードを削除終了(deleteByEmpno(int empno)メソッド) ========");


		System.out.println();


		System.out.println("======= 今の従業員表登録件数を表示開始(selectRowCount()メソッド) ========");

		System.out.println("今従業員表には" + emp.selectRowCount() + "件登録されています。");

		System.out.println("======= 今の従業員表登録件数を表示終了(selectRowCount()メソッド) ========");


		System.out.println();


		System.out.println("======= 指定した従業員番号に該当するレコードを更新開始(updateByEmpno(int empno, Row updateRow)メソッド) ========");

		Row newRow = new Row(2222,"NEWありす","受付係",500);

		// 存在しない従業員番号を指定し更新する
		System.out.println("更新された行は" + emp.updateByEmpno(7777,newRow));

		// 存在する従業員番号(ありすさん)を更新する
		System.out.println("更新行数は" + emp.updateByEmpno(2222, newRow));

		System.out.println("======= 指定した従業員番号に該当するレコードを更新終了(updateByEmpno(int empno, Row updateRow)メソッド) ========");


		System.out.println();


		System.out.println("======= 従業員名で検索開始(selectByName(String ename)メソッド) ========");

		Row[] rows = emp.selectByName("けん");
		for (int i = 0; i < rows.length; i++) {
			// 「けん」という名前の人の従業員番号を表示
			System.out.println("従業員番号:" + rows[i].getEmpno() + ",名前:" + rows[i].getEname() + ",役職:" + rows[i].getJob());
		}

		System.out.println("======= 従業員名で検索終了(selectByName(String ename)メソッド) ========");


		System.out.println();


		System.out.println("======= 従業員表に登録されている従業員中、最も高い給料検索開始(selectMaxSal()メソッド) ========");

		System.out.println("一番高いお給料は" + emp.selectMaxSal());

		System.out.println("======= 従業員表に登録されている従業員中、最も高い給料検索終了(selectMaxSal()メソッド) ========");


		System.out.println();


		System.out.println("======= 指定した従業員番号に当てはまるレコード検索開始(selectByPrimaryKey(int empno)メソッド) ========");

		Row selectRow = emp.selectByPrimaryKey(3333);
		System.out.println("従業員番号:" + selectRow.getEmpno() + ",名前:" + selectRow.getEname() + ",役職:" + selectRow.getJob());

		System.out.println("======= 指定した従業員番号に当てはまるレコード検索終了(selectByPrimaryKey(int empno)メソッド) ========");


		System.out.println();


		System.out.println("======= 従業員表に登録されている全レコード取得開始(selectAll()メソッド) ========");

		Row[] allRows = emp.selectAll();
		for(int i = 0; i < allRows.length; i++){
			System.out.println("従業員番号:" + allRows[i].getEmpno() + ",名前:" + allRows[i].getEname() + ",役職:" + allRows[i].getJob());
		}

		System.out.println("======= 従業員表に登録されている全レコード取得終了(selectAll()メソッド) ========");


		System.out.println();


		System.out.println("======= 従業員表に登録されている全レコードの従業員番号一覧取得開始(selectAllEmpno()メソッド) ========");

		int[] allEmpno = emp.selectAllEmpno();
		for(int i = 0; i < allRows.length; i++){
			System.out.println(allEmpno[i]);
		}

		System.out.println("======= 従業員表に登録されている全レコードの従業員番号一覧取得終了(selectAllEmpno()メソッド) ========");

	}
}
