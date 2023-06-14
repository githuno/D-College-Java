package classdeclaration;

import classdeclaration.ClassDeclaration.InnerClass;

public class ClassDeclarationTest {

	public static void main(String[] args) {

		// 通常のクラス
		System.out.println( "////////// 通常のクラス //////////" );

		ClassDeclaration obj = new ClassDeclaration();

		System.out.println( obj.str );
		obj.testMethod();

		// staticなアクセス
		System.out.println( "////////// staticなアクセス //////////" );

		System.out.println( ClassDeclaration.staticStr );

		ClassDeclaration.testStaticMethod();


		// Nested Class
		System.out.println( "////////// Nested Class //////////" );

		System.out.println( ClassDeclaration.NestedClass.str );

		ClassDeclaration.NestedClass.testMethod();

		// Inner Classのインスタンス生成(その①)
		InnerClass ic = obj.new InnerClass();

		// エンクロージングインスタンスへのアクセス（Inner ClassからOuter Classのメンバへアクセス）
		ic.accessOuterMember();

		/**
		 * クラス宣言その⑤ Anonymous(匿名)クラス
		 * 親クラスやInterfaceを、クラス定義はせずに実装する
		 * (実装はClassDeclarationClassのmainメソッド内を参照)
		 */
		System.out.println( "////////// Anonymouse Class //////////" );

		// Anonymouse(匿名) Classはクラスの定義を右辺に記述して、左辺で実装したクラスのインスタンスを代入する
		SuperClass ac = new SuperClass() {
			@Override public void abstractMethod() {
				System.out.println("Anonymouse Classのメソッド実行(親クラスを実装)");
			}
		};
		ac.abstractMethod();

		Interface acDash = new Interface() {
			@Override public void abstractMethod() {
				System.out.println("Anonymouse Classのメソッド実行(Interfaceを実装)");
			}
		};
		acDash.abstractMethod();
	}

}
