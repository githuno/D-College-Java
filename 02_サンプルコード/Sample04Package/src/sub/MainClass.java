package sub;	// パッケージはsub

// パッケージが異なるので、classの識別子が同じでもエラーにならない
/**
 * MainClass
 */
public class MainClass {

	public static void main(String[] args) {

		// 同じパッケージであればパッケージをinportしなくでも使える
		TestClass testClass = new TestClass();
		System.out.println( testClass.add(10, 5) );
	}
}
