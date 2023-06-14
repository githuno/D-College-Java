package io;

//直列化したインスタンスを使用する
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import io.object.Dog;
public class IOTest4Serializable {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.grow();
		dog.grow();
		dog.grow();

		FileOutputStream fos = null;

		ObjectOutputStream oos = null;

		try {

			fos = new FileOutputStream("Dog.ser");

			oos = new ObjectOutputStream(fos);

			oos.writeObject(dog);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {
			// リソース開放
			try {
				if ( oos != null ) {
					oos.close();
				}
				if ( fos != null ) {
					fos.close();
				}
			} catch(IOException e) {
				// 例外処理
				e.printStackTrace();
			}
		}

	}

}