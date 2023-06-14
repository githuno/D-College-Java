package io.object;

public class Dog extends Animal {

	public Dog() {
		System.out.println("Dogインスタンスが生成されました。");
	}

	// メソッドのオーバーライド
	@Override
	public void walk() {
		System.out.println("犬が歩きました。");
	}

	public void bark() {
		System.out.println("わんわん");
	}

}