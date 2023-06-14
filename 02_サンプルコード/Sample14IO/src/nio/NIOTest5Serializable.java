package nio;

//直列化したインスタンスを使用する
import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import nio.object.Animal;

public class NIOTest5Serializable {

	public static void main(String[] args) {


		ObjectInputStream ois = null;
		try {
			// newInputStream:
			// FilesクラスからInputStreamオブジェクトを取得する
			ois = new ObjectInputStream(Files.newInputStream(Paths.get("Dog.ser")));

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