/**
 * 審判クラス
 *
 * @author openstream
 *
 */
public class Judgment {

	// =============================
	// ◆メソッド

	/**
	 * ジャンケン勝敗判断
	 */
	public Player judge(Player player1, Player player2) {

		int player1Hand = player1.getPlayerHand();
		int player2Hand = player2.getPlayerHand();

		if ((player1Hand == Player.STONE && player2Hand == Player.SCISSORS)
				|| (player1Hand == Player.SCISSORS && player2Hand == Player.PAPER)
				|| (player1Hand == Player.PAPER && player2Hand == Player.STONE)) {
			player1.addWinCount();
			return player1;
		} else if ((player2Hand == Player.STONE && player1Hand == Player.SCISSORS)
				|| (player2Hand == Player.SCISSORS && player1Hand == Player.PAPER)
				|| (player2Hand == Player.PAPER && player1Hand == Player.STONE)) {
			player2.addWinCount();
			return player2;
		} else {
			return null;
		}
	}

	/**
	 * 最終勝敗判断
	 */
	public Player finalJudge(Player player1, Player player2) {

		Player winPlayer = new Player("");
		if (!"".equals(player1.getPlayerName())
				&& !"".equals(player2.getPlayerName())) {

			System.out.println(player1.getPlayerName() + ":"
					+ player1.getWinCount() + "勝");
			System.out.println(player2.getPlayerName() + ":"
					+ player2.getWinCount() + "勝");

			if (player1.getWinCount() > player2.getWinCount()) {
				System.out.println("結果:" + player1.getPlayerName() + "の勝ち！");
				winPlayer = player1;
			} else if (player1.getWinCount() < player2.getWinCount()) {
				System.out.println("結果:" + player2.getPlayerName() + "の勝ち！");
				winPlayer = player2;
			} else {
				System.out.println("引き分け！");
			}

		}
		// プレイヤーのじゃんけん少数を0にリセット
		player1.setWinCount(0);
		player2.setWinCount(0);
		return winPlayer;
	}

	// =============================

}
