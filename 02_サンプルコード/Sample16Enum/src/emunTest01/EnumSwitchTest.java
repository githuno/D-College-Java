package emunTest01;

public class EnumSwitchTest {

	public static void main(String[] args) {

		// enum無し
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

		// enum有り
//		Gender gender = Gender.MAN;
//
//		switch(gender) {
//			case MAN:
//				System.out.println("男性です。");
//				break;
//			case WOMAN:
//				System.out.println("女性です。");
//				break;
//			case XGENDER:
//				System.out.println("男性、女性、いずれでもありません。");
//				break;
//		}
	}

}
