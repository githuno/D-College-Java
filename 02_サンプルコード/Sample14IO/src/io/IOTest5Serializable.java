package io;

//直列化したインスタンスを使用する
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import io.object.Animal;
public class IOTest5Serializable {

	public static void main(String[] args) {

		ObjectInputStream ois = null;
		try {
			ois = new ObjectInputStream(new FileInputStream("Dog.ser"));

			// readObjectメソッドではClassNotFoundExceptionが発生する
			Animal animal = (Animal) ois.readObject();

			animal.grow();

		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				if (ois != null) {
					ois.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}