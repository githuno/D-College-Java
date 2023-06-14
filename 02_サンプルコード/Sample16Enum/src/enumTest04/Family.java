package enumTest04;

public enum Family {

	// 列挙子毎に別々のメソッドを定義したい場合、メソッドをオーバーライドする
	FATHER(1){
		@Override public void doMethod() {
			System.out.println("FATHER doMethod :" + id);
		}
	},
	MOTHER(2){
		@Override public void doMethod() {
			System.out.println("MOTHER doMethod :" + id);
		}
	},
	BROTHER(3){
		@Override public void doMethod() {
			System.out.println("BROTHER doMethod :" + id);
		}
	},
	SISTER(4){
		@Override public void doMethod() {
			System.out.println("SISTER doMethod :" + id);
		}
	};

	// フィールドの定義
	protected int id;

	// コンストラクタの定義
	private Family(int id) {
		this.id = id;
	}

	// メソッドの定義
	public void start() {
		System.out.println("start :" + this.id);
	}

	public abstract void doMethod();

	public void end() {
		System.out.println("end :" + this.id);
	}
}