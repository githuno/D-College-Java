package project_coin;

public class BinaryLiteralsTest {

	public static void main(String[] args) {

		// 0bを接頭辞にすると2進数表現が可能
		int bl = 0b10011001010011;		// 9811
		int il = 9811;

		if ( bl == il ) {
			System.out.println("0b10011001010011 と 9811 は同じだよ");
		}

		// その他のリテラル表現

		// 0を接頭辞にすると8進数表現
		int ol = 02715;					// 1485
		il = 1485;

		if ( ol == il ) {
			System.out.println("02715 と 1485 は同じだよ");
		}

		// 0xを接頭辞にすると16進数表現
		int hl = 0xF5A91;				// 1006225
		il = 1006225;

		if ( hl == il ) {
			System.out.println("0xF5A91 と 1006225 は同じだよ");
		}

		// 小数点のある数値はdouble型
		double dl = 10.5;

		// 接尾辞がfはfloat型
		float fl = 200f;
//		il = 200f;			// float型なのでint型には入らない

		// 接尾辞がdはdouble型
		dl = 200d;
//		il = 200d;			// float型なのでint型には入らない

		// 接尾辞がlはlong型（整数型）
		long ll = 100l;

	}

}
