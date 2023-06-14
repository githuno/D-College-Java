package nio;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

import nio.object.Dog;

public class NIOTest4SerializableTWR{

	public static void main(String[] args){

		Dog dog = new Dog();
		dog.grow();
		dog.grow();
		dog.grow();

		try(ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(Paths.get("Dog.ser"), StandardOpenOption.CREATE))){

			oos.writeObject( dog );

		}catch(IOException e){
			e.printStackTrace();
		}

	}

}