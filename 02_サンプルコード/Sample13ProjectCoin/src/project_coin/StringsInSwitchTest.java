package project_coin;

public class StringsInSwitchTest {

	static final int MEN   = 2;
	static final int WOMEN = 1;
	static final int X     = 3;


	public static void main(String[] args) {

		// Java6まで、文字列を扱えなかった(enumや定数を使ってた)
		// マジックナンバーそのまま
		int gender = 1;

		switch(gender) {
			case 1:
				System.out.println("男性です。");
				break;
			case 2:
				System.out.println("女性です。");
				break;
			case 3:
				System.out.println("男性、女性、いずれでもありません。");
				break;
			default:
				System.out.println("性別の値が正しくありません。");
				break;
		}

		// 定数
//		int gender = MEN;
//
//		switch(gender) {
//			case MEN:
//				System.out.println("男性です。");
//				break;
//			case WOMEN:
//				System.out.println("女性です。");
//				break;
//			case X:
//				System.out.println("男性、女性、いずれでもありません。");
//				break;
//			default:
//				System.out.println("性別の値が正しくありません。");
//				break;
//		}

		// Java7以降は文字列を扱える
//		String gender = "男性";
//
//		switch(gender) {
//			case "男性":
//				System.out.println("男性です。");
//				break;
//			case "女性":
//				System.out.println("女性です。");
//				break;
//			case "Xジェンダー":
//				System.out.println("男性、女性、いずれでもありません。");
//				break;
//			default:
//				System.out.println("性別の値が正しくありません。");
//				break;
//		}
	}

}
