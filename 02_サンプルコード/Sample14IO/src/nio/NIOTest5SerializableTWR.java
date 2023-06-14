package nio;
//ObjectInputStreamを使う

import java.io.IOException;
import java.io.ObjectInputStream;
import java.nio.file.Files;
import java.nio.file.Paths;

import nio.object.Animal;

public class NIOTest5SerializableTWR{

	public static void main(String[] args){

		try(ObjectInputStream ois = new ObjectInputStream(Files.newInputStream(Paths.get("Dog.ser")));){

			Animal animal = (Animal)ois.readObject();

			animal.grow();

		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	}

}