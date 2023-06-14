public class SimpleJanken2 {

	public static void main(String[] args) {
		System.out.println("非オブジェクト指向プログラミング：3人、じゃんけん先勝3回戦");

		// V2.ルールを変更！先に3回勝ったほうが勝ち！

		// グー
		final int STONE = 0;
		// チョキ
		final int SCISSORS = 1;
		// パー
		final int PAPER = 2;

		// プレイヤー1勝数
		int player1WinCount = 0;
		// プレイヤー2勝数
		int player2WinCount = 0;

		System.out.println();
		System.out.println("じゃんけん先勝3回戦開始");
		System.out.println();

		int count = 0;// 変更
		while (player1WinCount < 3 && player2WinCount < 3) {// 変更
			++count;// 変更

			System.out.println(count + "回戦目！！");

			int player1Hand = 0;
			double randomNum1 = Math.random() * 3;
			if (randomNum1 < 1) {
				player1Hand = STONE;
				System.out.println("プレイヤー1:グー");
			} else if (randomNum1 < 2) {
				player1Hand = SCISSORS;
				System.out.println("プレイヤー1:チョキ");
			} else if (randomNum1 < 3) {
				player1Hand = PAPER;
				System.out.println("プレイヤー1:パー");
			}

			int player2Hand = 0;
			double randomNum2 = Math.random() * 3;
			if (randomNum2 < 1) {
				player2Hand = STONE;
				System.out.println("プレイヤー2:グー");
			} else if (randomNum2 < 2) {
				player2Hand = SCISSORS;
				System.out.println("プレイヤー2:チョキ");
			} else if (randomNum2 < 3) {
				player2Hand = PAPER;
				System.out.println("プレイヤー2:パー");
			}

			if ((player1Hand == STONE && player2Hand == SCISSORS) || (player1Hand == SCISSORS && player2Hand == PAPER)
					|| (player1Hand == PAPER && player2Hand == STONE)) {
				System.out.println(count + "回戦はプレイヤー1の勝ち！");// 変更
				player1WinCount++;
			} else if ((player2Hand == STONE && player1Hand == SCISSORS)
					|| (player2Hand == SCISSORS && player1Hand == PAPER)
					|| (player2Hand == PAPER && player1Hand == STONE)) {
				System.out.println(count + "回戦はプレイヤー2の勝ち！");// 変更
				player2WinCount++;
			} else {
				System.out.println(count + "回戦は引き分け！");// 変更
			}
		}

		String winPlayerName = null;

		System.out.println();
		System.out.println("プレイヤー1:" + player1WinCount + "勝");
		System.out.println("プレイヤー2:" + player2WinCount + "勝");
		if (player1WinCount > player2WinCount) {
			winPlayerName = "プレイヤー1";
			System.out.println("結果：プレイヤー1の勝ち");
		} else if (player1WinCount < player2WinCount) {
			winPlayerName = "プレイヤー2";
			System.out.println("結果：プレイヤー2の勝ち");
		} else {
			System.out.println("引き分け");
		}

		if (winPlayerName != null) {

			// 勝プレイヤー勝数
			int winPlayerCount = 0;
			// プレイヤー3勝数
			int player3WinCount = 0;

			System.out.println();
			System.out.println("じゃんけん先勝3回戦開始");
			System.out.println();

			int count2 = 0;// 変更
			while (winPlayerCount < 3 && player3WinCount < 3) {// 変更
				++count2;// 変更

				System.out.println(count2 + "回戦目！！");// 変更

				int winPlayerHand = 0;
				double randomNum1 = Math.random() * 3;
				if (randomNum1 < 1) {
					winPlayerHand = STONE;
					System.out.println(winPlayerName + ":グー");
				} else if (randomNum1 < 2) {
					winPlayerHand = SCISSORS;
					System.out.println(winPlayerName + ":チョキ");
				} else if (randomNum1 < 3) {
					winPlayerHand = PAPER;
					System.out.println(winPlayerName + "パー");
				}

				int player3Hand = 0;
				double randomNum2 = Math.random() * 3;
				if (randomNum2 < 1) {
					player3Hand = STONE;
					System.out.println("プレイヤー3:グー");
				} else if (randomNum2 < 2) {
					player3Hand = SCISSORS;
					System.out.println("プレイヤー3:チョキ");
				} else if (randomNum2 < 3) {
					player3Hand = PAPER;
					System.out.println("プレイヤー3:パー");
				}

				if ((winPlayerHand == STONE && player3Hand == SCISSORS)
						|| (winPlayerHand == SCISSORS && player3Hand == PAPER)
						|| (winPlayerHand == PAPER && player3Hand == STONE)) {
					System.out.println(count2 + "回戦は" + winPlayerName + "の勝ち！");// 変更
					winPlayerCount++;
				} else if ((player3Hand == STONE && winPlayerHand == SCISSORS)
						|| (player3Hand == SCISSORS && winPlayerHand == PAPER)
						|| (player3Hand == PAPER && winPlayerHand == STONE)) {
					System.out.println(count2 + "回戦はプレイヤー3の勝ち！");// 変更
					player3WinCount++;
				} else {
					System.out.println(count2 + "回戦は引き分け！");// 変更
				}
			}

			System.out.println();
			System.out.println(winPlayerName + ":" + winPlayerCount + "勝");
			System.out.println("プレイヤー3:" + player3WinCount + "勝");
			if (winPlayerCount > player3WinCount) {
				System.out.println("結果：" + winPlayerName + "の勝ち");
			} else if (winPlayerCount < player3WinCount) {
				System.out.println("結果：プレイヤー3の勝ち");
			} else {
				System.out.println("引き分け");
			}
		}

	}
}
