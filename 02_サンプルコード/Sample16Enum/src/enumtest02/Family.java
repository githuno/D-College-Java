package enumtest02;

// 列挙子のみ定義する場合
//public enum Family {
//    FATHER,
//    MOTHER,
//    BROTHER,
//    SISTER
//}

// 定数オブジェクトにフィールド、メソッドを定義する場合
public enum Family {

	// 列挙子のオブジェクトを生成するときにコンストラクタが呼ばれる
	// カッコの値はコンストラクタへ渡す値
	FATHER(1),
	MOTHER(2),
	BROTHER(3),
	SISTER(4);

	// フィールドの定義
	private int id;

	// コンストラクタの定義
	// (コンストラクタはprivateのみ定義できる……ソース上ではnew演算子は呼べない)
	private Family(int id) {
		this.id = id;
	}

	// メソッドの定義
	public int getId() {
		return this.id;
	}
}