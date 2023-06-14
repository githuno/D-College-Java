package basicthread;

public class ThreadTest2{

	public static void main(String[] args){

		// スレッド生成
		Thread th = new NewThread2();
		th.start();

		// スレッド生成
		Thread th2 = new NewThread2();
		th2.start();

		// 現在実行しているスレッドにgetName()メソッドを実行させる
		for(int i = 0; i < 100; i++){
			System.out.println(Thread.currentThread().getName());
		}
	}


}