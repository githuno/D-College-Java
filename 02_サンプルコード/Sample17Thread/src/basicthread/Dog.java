package basicthread;

public class Dog {

	//体力
	private int power = 1;

	//えさを与える。
	public void feed(){
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

	//歩く
	public void walk(){

		if( power == 1 ){
			System.out.println("今から歩きます。");
			power--;
			System.out.println("歩きました。現在のpower->"+power);
		}

	}



}