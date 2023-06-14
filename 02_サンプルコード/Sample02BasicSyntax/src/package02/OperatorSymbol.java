package package02;

/**
 * OperatorSymbol
 * …演算子の結果を見てみる
 */
class OperatorSymbol {
    public static void main (String[] args) {

        // 算術演算子
        // 加算
        System.out.print( "1 + 1 = " );
        System.out.println( 1 + 1 );

        // 減算
        System.out.print( "1 - 1 = " );
        System.out.println( 1 - 1 );

        // 乗算
        System.out.print( "2 * 3 = " );
        System.out.println( 2 * 3 );

        // 除算
        System.out.print( "4 / 2 = " );
        System.out.println( 4 / 2 );

        // 剰余
        System.out.print( "7 % 3 = " );
        System.out.println( 7 % 3 );

        // インクリメント、デクリメント（&代入演算子）
//		int a = 1;
//		System.out.println( a++ );
//		System.out.println( a );

//		a = 1;
//		System.out.println( ++a );
//		System.out.println( a );

//		a = 1;
//		System.out.println( a-- );
//		System.out.println( a );

//		a = 1;
//		System.out.println( --a );
//		System.out.println( a );

        // 複合代入演算子
//		a = 20;
//		a += 10;
//		System.out.println( a );

//		a = 20;
//		a -= 10;
//		System.out.println( a );

//		a = 20;
//		a *= 10;
//		System.out.println( a );

//		a = 20;
//		a /= 10;
//		System.out.println( a );

//		a = 52;
//		a %= 10;
//		System.out.println( a );

        // 関係演算子
//		int b = 20;
//		int c = 20;
//		System.out.println( b < c );
//		System.out.println( b > c );
//		System.out.println( b <= c );
//		System.out.println( b <= c );
//		System.out.println( b == c );
//		System.out.println( b != c );

        // 論理演算子
//		boolean d = true;
//		boolean e = true;
//		boolean f = false;
//		boolean g = false;
//		System.out.println( d && e );
//		System.out.println( f && g );
//		System.out.println( d && f );
//		System.out.println( d || e );
//		System.out.println( f || g );
//		System.out.println( d || f );
//		System.out.println( !e );
//		System.out.println( !g );
//		System.out.println( !f );

        // 論理演算子の評価順

//		// 左辺、右辺両方評価される
//		int num1 = 1;
//		int num2 = 2;
//		int num3 = 3;
//		int num4 = 4;
//
//		System.out.println( num1 < num2 && ++num3 == num4 );
//
//		System.out.println( "num1 の値は " + num1 );
//		System.out.println( "num2 の値は " + num2 );
//		System.out.println( "num3 の値は " + num3 );
//		System.out.println( "num4 の値は " + num4 );

//		// 左辺のみ評価される
//		num1 = 1;
//		num2 = 2;
//		num3 = 3;
//		num4 = 4;
//
//		System.out.println( num1 == num2 && ++num3 == num4 );
//
//		System.out.println( "num1 の値は " + num1 );
//		System.out.println( "num2 の値は " + num2 );
//		System.out.println( "num3 の値は " + num3 );
//		System.out.println( "num4 の値は " + num4 );

//		// 左辺のみ評価される
//		num1 = 1;
//		num2 = 2;
//		num3 = 3;
//		num4 = 4;
//
//		System.out.println( num1 < num2 || ++num3 == num4 );
//
//		System.out.println( "num1 の値は " + num1 );
//		System.out.println( "num2 の値は " + num2 );
//		System.out.println( "num3 の値は " + num3 );
//		System.out.println( "num4 の値は " + num4 );

        // 演算子 3項演算子
        int x = 10;
        int y = 20;
        System.out.println("x=[" + x + "]");
        System.out.println("y=[" + y + "]");

        int z = x < y ? 30 : 40;
        System.out.println("z=[" + z + "]");

        z = x > y ? 30 : 40;
        System.out.println("z=[" + z + "]");


    }
}