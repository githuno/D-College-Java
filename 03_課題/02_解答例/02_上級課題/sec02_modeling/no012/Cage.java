package mvc.java.kadai.se.cat02.sec02_modeling.no012;

/**
 *
 * モデリング問題12 回答
 *
 */
import java.util.ArrayList;

public class Cage {

	/** 動物List */
	private ArrayList<Animal> list = new ArrayList<Animal>();

	/** 動物を檻にいれる(Listに追加する)メソッド */
	public void add(Animal animal) {
		list.add(animal);
		System.out.println(animal.getName() + "を捕まえて檻にいれました");
	}

	/** 指定した名前に該当する動物を取得するメソッド */
	public Animal get(String name) {

		for (int i = 0; i < list.size(); i++) {
			Animal animal = list.get(i);
			if (name.equals(animal.getName())) {
				System.out.println(animal.getName() + "を呼び出しました");
				return animal;
			}
		}
		// 該当なし
		return null;
	}

	/** 全動物を歩かせるメソッド(Listに格納されている全動物のwalk()メソッドを実行する) */
	public void doAllWalk() {
		for (Animal animal : list) {
			animal.walk();
		}
	}

}
