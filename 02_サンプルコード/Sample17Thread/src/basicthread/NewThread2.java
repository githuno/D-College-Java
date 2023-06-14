package basicthread;

public class NewThread2 extends Thread{


	@Override
	// Threadクラスのrunメソッドをオーバーライド
	public void run(){

		for(int i = 0; i < 100; i++){

			System.out.println(Thread.currentThread().getName() + "がrunメソッドを実行中");
		}
		System.out.println(Thread.currentThread().getName() + "がrunメソッドを終了しました");
	}


}