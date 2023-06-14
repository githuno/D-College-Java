package basicthread;

// インスタンスが常に一つだけとなるシングルトン・パターン
public class DogSingleton{


	//②staticフィールドが初期化されるタイミングでnewする。
	private static DogSingleton dog = new DogSingleton();
	//public static final Dog INSTANCE = new Dog();

	//①コンストラクタをprivateにする
	private DogSingleton(){}

	//③インスタンスの参照を返すメソッドを用意
	public static DogSingleton getInstance(){
		return dog;
	}

	//体力
	private int power = 1;

	private Object lock = new Object();

	//えさを与える。（排他制御により複数のスレッドによる同時処理は不可）
	synchronized public void feed(){

		if( power == 0 ){
				System.out.println("お腹がすいているのでえさを与えます。");
				power++;
				System.out.println("えさを与えました。現在のpower->"+power);
		}

	}

	//体力を調べる。
	public int checkPower(){
		System.out.println("現在のpower->"+power);
		return	power;
	}

	//歩く（排他制御により複数のスレッドによる同時処理は不可）
	synchronized public void walk(){

		if( power == 1 ){
			System.out.println("今から歩きます。");
			power--;
			System.out.println("歩きました。現在のpower->"+power);
		}

	}



}