package io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import io.object.Dog;
public class IOTest4SerializableTWR{

	public static void main(String[] args){

		Dog dog = new Dog();
		dog.grow();
		dog.grow();
		dog.grow();

		try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Dog.ser"))){

			oos.writeObject( dog );

		}catch(IOException e){
			e.printStackTrace();
		}

	}

}