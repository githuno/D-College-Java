package basicthread;

public class ThreadTest1{

	public static void main(String[] args){

		// 新しいスレッドを生成する
		Thread th = new Thread();

		th.start();

		System.out.println("main()終了");

	}


}