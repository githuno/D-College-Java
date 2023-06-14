package basicthread;

public class NewThread3 extends Thread{

	@Override
	// Threadクラスのrunメソッドをオーバーライド
	public void run(){

		Dog dog = new Dog();
		//Dog dog = Dog.getInstance();

		while(true){

			dog.walk();
			dog.feed();

		}

	}

}