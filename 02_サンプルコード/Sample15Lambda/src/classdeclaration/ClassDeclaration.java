package classdeclaration;

// クラス宣言サンプル

/**
 * クラス宣言その① Top Levelクラス
 * 通常のクラス宣言
 */
public class ClassDeclaration {

	// 通常のメンバ
	public String str = "TopLevel Class";

	public void testMethod() {
		System.out.println("TopLevel Classのメソッド実行");
	}

	// staticメンバ
	public static String staticStr = "TopLevel Class(staticメンバ)";

	public static void testStaticMethod() {
		System.out.println("TopLevel Classのメソッド実行(staticメンバ)");
	}

	/**
	 * クラス宣言その② Nestedクラス
	 *static宣言するとNestedクラス
	 */
	public static class NestedClass{

		public static String str = "Nested Class";

		public static void testMethod() {
			System.out.println("Nested Classのメソッド実行");
		}
	}

	/**
	 * クラス宣言その③ Innerクラス
	 * static宣言無しだとInnerクラス
	 */
	public class InnerClass{

		public String innserStr = "Inner Class";

		public void testInnerMethod() {
			System.out.println("Inner Classのメソッド実行");
		}

		// Inner ClassはOuter Classのメンバにアクセスできる
		public void accessOuterMember() {
			// OuterClass名.this でOuterクラスのインスタンスにアクセスできる
			// (円クロージングインスタンスの参照)
			System.out.println( "////// InnerClassからOuter Classのメンバにアクセス /////");
			System.out.println( ClassDeclaration.this.str );
			ClassDeclaration.this.testMethod();

			// InnerClassとOuterClassでメンバ名が重複しない場合、OuterClass名.this は省略できる
			System.out.println( str );
			testMethod();
		}
	}

	/**
	 * クラス宣言その④ ローカルInnerクラス
	 * メソッドやコンストラクタなどの処理ブロック内で宣言されるInnserクラス
	 */
	public void localMethod() {

		class LocalClass{
			public String LocalStr = "Local Class";

			public void testLocalMethod() {
				System.out.println("Local Classのメソッド実行");
			}
		}

		// Local Classが有効なのはブロック内部のみ
		System.out.println( "////////// Local Class //////////" );
		System.out.println( "Local Classのメンバにアクセス");
		LocalClass lc = new LocalClass();
		System.out.println( lc.LocalStr );
		lc.testLocalMethod();

	}

	public void localMethodDash() {
		// ブロック外からはLocalClassは呼び出せない
//		LocalClass lc = new LocalClass();	// コンパイルエラーになる
//		System.out.println( lc.LocalStr );
//		lc.testLocalMethod();
	}

	// Inner Classのインスタンス生成(その②)
	// Outer Classのインスタンスメソッド内であれば、thisでOuter Classのインスタンスにアクセスできるので
	// Inner Classのインスタンス生成ができる
	public void instantiateInnserClass() {
		InnerClass ic = this.new InnerClass();

		// thisは省略できる
		InnerClass icDash = new InnerClass();
	}

	// Inner Classのインスタンス生成(その③)
	// staticなメソッド内でInner Classのインスタンスを生成する場合は、
	// staticメソッド内でOuterクラスのインスタンスを生成する
	public static void instantiateInnserClassDash() {
		ClassDeclaration cd = new ClassDeclaration();
		InnerClass ic = cd.new InnerClass();
	}

}
