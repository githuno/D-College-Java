package executor_service;

public enum SingletonEnumType {

	// 列挙子インスタンスを用いる
	INSTANCE;

	private int num = 0;

	// コンストラクタはprivate
	private SingletonEnumType() {
		// コンストラクタ処理
	}

	public void incrementNum() {
		this.num ++;
	}

	public int getNum() {
		return this.num;
	}
}
