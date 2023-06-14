package basicthread;

public class ThreadTest3{

	public static void main(String[] args){


		Thread th1 = new NewThread3();
		th1.start();

		Thread th2 = new NewThread3();
		th2.start();

		Thread th3 = new NewThread3();
		th3.start();

	}

}