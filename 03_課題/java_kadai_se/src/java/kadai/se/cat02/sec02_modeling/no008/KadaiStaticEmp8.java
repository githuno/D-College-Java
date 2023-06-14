package java.kadai.se.cat02.sec02_modeling.no008;

public class KadaiStaticEmp8 {

	public static void main(String[] args) {


		// 実行結果に足りない部分を実装し挙動を確認してください。

		System.out.println("======= 従業員表に登録されている全レコード取得開始(selectAll()メソッド) ========");

		// 以下コメントアウトを外して使用しましょう
		//		Row[] allRows = Emp.selectAll();
		//		for(int i = 0; i < allRows.length; i++){
		//			System.out.println("従業員番号:" + allRows[i].getEmpno() + ",名前:" + allRows[i].getEname() + ",役職:" + allRows[i].getJob());
		//		}

		System.out.println("======= 従業員表に登録されている全レコード取得終了(selectAll()メソッド) ========");


		System.out.println();


		System.out.println("======= 給料で降順ソートした全レコードを取得開始(selectAllOrderBySal(true)メソッド) ========");

		// 以下コメントアウトを外して使用しましょう
		//		allRows = Emp.selectAllOrderBySal(true);
		//		for (int i = 0; i < allRows.length; i++) {
		//			System.out.println("従業員番号:" + allRows[i].getEmpno() + ",名前：" + allRows[i].getEname() + ",役職:"
		//					+ allRows[i].getJob() + ",給料" + allRows[i].getSal());
		//		}

		System.out.println("======= 給料で降順ソートした全レコードを取得終了(selectAllOrderBySal(true)メソッド) ========");


		System.out.println();


		System.out.println("======= 給料で昇順ソートした全レコードを取得開始(selectAllOrderBySal(false)メソッド) ========");

		// 以下コメントアウトを外して使用しましょう
		//		allRows = Emp.selectAllOrderBySal(false);
		//		for (int i = 0; i < allRows.length; i++) {
		//			System.out.println("従業員番号:" + allRows[i].getEmpno() + ",名前:" + allRows[i].getEname() + ",役職:"
		//					+ allRows[i].getJob() + ",給料" + allRows[i].getSal());
		//		}

		System.out.println("======= 給料で昇順ソートした全レコードを取得終了(selectAllOrderBySal(false)メソッド) ========");
	}
}
