package package09;

class StatementForSample {
	public static void main(String[] args) {
		// 文 繰り返し for
		int max = 10;
		System.out.println("max=[" + max + "]");

		for (int i = 0; i < max; i++) {
			System.out.println("forのブロック中 i=[" + i + "]");
		}

		System.out.println("max=[" + max + "]");

		for (int i = 0; i < max; i++) {
			System.out.println("forのブロック中 i=[" + i + "]");
			if (i >= 5) {
				break;
			}
		}

		System.out.println("max=[" + max + "]");

		for (int i = 0; i < max; i++) {
			System.out.println("forのブロック中 i=[" + i + "]");
			if (i >= 5) {
				continue;
			}
			System.out.println("forのブロック中 ここには途中から来なくなる。");
		}


		int min =10;
		System.out.println("min=[" + min + "]");

		for (int i = 20; i >= min; i--) {
			System.out.println("forのブロック中 i=[" + i + "]");
		}

	}
}
