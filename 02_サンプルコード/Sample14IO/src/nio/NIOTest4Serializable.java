package nio;

//直列化したインスタンスを使用する
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import nio.object.Dog;

public class NIOTest4Serializable {

	public static void main(String[] args) {

		Dog dog = new Dog();
		dog.grow();
		dog.grow();
		dog.grow();
		dog.grow();

		OutputStream os = null;
		ObjectOutputStream oos = null;
		try {
			// newOutputStream:
			// FilesクラスからOutputStreamオブジェクトを取得する
			os = Files.newOutputStream(Paths.get("Dog.ser"), StandardOpenOption.CREATE);

			oos = new ObjectOutputStream(os);

			oos.writeObject(dog);

		} catch (IOException e1) {
			// 例外処理
			e1.printStackTrace();
		} finally {
			// リソース開放
			try {
				if ( oos != null ) {
					oos.close();
				}
				if ( os != null ) {
					os.close();
				}
			} catch(IOException e) {
				// 例外処理
				e.printStackTrace();
			}
		}
	}

}