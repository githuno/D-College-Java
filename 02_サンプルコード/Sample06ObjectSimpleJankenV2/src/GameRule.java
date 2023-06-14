/**
 * ゲームルールクラス
 *
 * @author openstream
 *
 */
public class GameRule {

	// =============================
	// ◆フィールド

	// ゲームタイトル
	private String gameTitle;

	// =============================

	// =============================
	// ◆コンストラクタ

	public GameRule(String gameTitle) {
		// オブジェクト生成時、「ゲームタイトル」を設定する。
		// System.out.println("ゲームルールクラスのコンストラクタが実行されました");
		this.gameTitle = gameTitle;
	}

	// =============================

	// =============================
	// ◆メソッド

	/**
	 * ゲーム実施
	 *
	 * @param player1
	 * @param player2
	 * @return
	 */
	public Player doGame(Player player1, Player player2) {

		Judgment judgment = new Judgment();

		if (!"".equals(player1.getPlayerName())
				&& !"".equals(player2.getPlayerName())) {

			System.out.println();
			System.out.println(gameTitle + "開始");
			System.out.println();

			int count = 0;// 変更！
			while (player1.getWinCount() < 3 && player2.getWinCount() < 3) {// 変更！
				++count;// 変更！

				System.out.println(count + "回戦目！！");// 変更！

				player1.decideHand();
				player2.decideHand();

				Player win = judgment.judge(player1, player2);

				if (win == null) {
					System.out.println(count + "回戦は引き分け！");// 変更！
				} else {
					System.out.println(count + "回戦は" + win.getPlayerName() + "の勝ち！");// 変更！
				}
			}

		}

		System.out.println();
		return judgment.finalJudge(player1, player2);

		// =============================
	}
}
