package io.object;

import java.io.Serializable;

public class Animal implements Serializable {

	private int age;

	public Animal() {
		age = 0;
		System.out.println("Animalのインスタンスが誕生しました。");
	}

	public void walk() {
		System.out.println("歩きました。");
	}

	public void grow() {
		age++;
		System.out.println(age + "歳になりました。");
	}

}
