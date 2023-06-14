package io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import io.object.Animal;

public class IOTest5SerializableTWR{

	public static void main(String[] args){

		try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Dog.ser"));){

			Animal animal = (Animal)ois.readObject();

			animal.grow();

		}catch(IOException e){
			e.printStackTrace();
		}catch(ClassNotFoundException e){
			e.printStackTrace();
		}

	}

}