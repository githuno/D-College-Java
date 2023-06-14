package java.kadai.se.cat02.sec02_modeling.no007;
public class KadaiDept7 {

	public static void main(String[] args) {

		Dept dept = new Dept();

		System.out.println("======= 部門表にレコードを追加する(insert(RowDept rowDept)メソッド) ========");

		// 以下コメントアウトを外して使用しましょう
		//		dept.insert(new RowDept(1,"システム開発第1部"));
		//		dept.insert(new RowDept(2,"システム開発第2部"));
		//
		//		// 部門番号0をいれる
		//		dept.insert(new RowDept(0,"システム開発第0部"));
		//
		//		// 同じ部門番号を入れる
		//		dept.insert(new RowDept(2,"システム開発第2部"));
		//
		//		dept.insert(new RowDept(3,"業務推進部"));
		//		dept.insert(new RowDept(4,"業務パートナー"));
		//		dept.insert(new RowDept(5,"経理部"));
		//
		//		// 6部門目をいれる。
		//		dept.insert(new RowDept(6,"システム開発部3部"));

		System.out.println("======= 部門表にレコードを追加する(insert(RowDept rowDept)メソッド) ========");

		System.out.println();

		// 以下コメントアウトを外して使用しましょう
		//		Emp emp = new Emp(dept);

		System.out.println("======= 従業員表にレコードを追加する(insert(Row row)メソッド) ========");

		// 以下コメントアウトを外して使用しましょう
		//		emp.insert(new Row(1111,"すみす","一般社員",800,1));
		//		emp.insert(new Row(2222,"ありす","受付係",400,2));
		//
		//		// 【追加】部門表に存在しない部門番号を入れる
		//		emp.insert(new Row(1111,"かれん","一般社員",900,6));
		//
		//		// 同じ従業員番号を入れる
		//		emp.insert(new Row(1111,"かれん","一般社員",900,1));
		//
		//		// 従業員番号0をいれる
		//		emp.insert(new Row(0,"じょーじ","派遣社員",100,4));
		//
		//		emp.insert(new Row(3333,"けん","一般社員",8400,2));
		//		emp.insert(new Row(4444,"めありー","一般社員",8000,1));
		//
		//		// 同じ名前の人をいれる
		//		emp.insert(new Row(5555,"けん","派遣社員",800,4));
		//
		//		// 6人目をいれる
		//		emp.insert(new Row(6666,"べす","一般社員",800,1));

		System.out.println("======= 従業員表にレコードを追加しました(insert(Row row)メソッド) ========");


		// ※以降、実行結果に足りない部分を実装し挙動を確認してください。

	}
}
