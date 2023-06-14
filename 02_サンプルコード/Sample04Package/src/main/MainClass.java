package main;	// パッケージはmain

import sub.TestClass;

/**
 * MainClass
 */
public class MainClass {

	public static void main(String[] args) {

		// パッケージが異なるclassはimportしなければ利用できない
		TestClass testClass = new TestClass();
		System.out.println( testClass.add(10, 5) );
	}

}
