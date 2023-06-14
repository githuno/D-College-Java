package enumTestStrategyPattern;


//Strategyパターンをenumで実装する
public class enumTestStrategyPattern {

	public static void main(String[] args) {

		// 列挙子の定数オブジェクトがcompareメソッドをオーバーライドしている
		System.out.println( "compare type INTEGER:" + StringCmp.INTEGER.compare("123", "234") );

		System.out.println( "compare type STRING:" + StringCmp.STRING.compare("あいうえお", "あかさたな") );

		System.out.println( "compare type REVERSE:" + StringCmp.REVERSE.compare("あいうえお", "あかさたな") );

	}
}
