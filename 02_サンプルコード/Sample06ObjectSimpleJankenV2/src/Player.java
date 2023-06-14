/***
 * プレイヤークラス
 *
 * @author openstream
 */
public class Player {

	// =============================
	// ◆フィールド

	// クラス変数(static付与)且つ定数(final付与)：グー
	public final static int STONE = 0;
	// クラス変数(static付与)且つ定数(final付与)：チョキ
	public final static int SCISSORS = 1;
	// クラス変数(static付与)且つ定数(final付与)：パー
	public final static int PAPER = 2;

	// プレイヤー名
	private String playerName;

	// プレイヤーの手
	private int playerHand;

	// じゃんけん勝数
	private int winCount;

	// =============================

	// =============================
	// ◆コンストラクタ

	public Player(String playerName) {
		// オブジェクト生成時、「プレイヤー名」を設定する。
		// System.out.println("プレイヤークラスのコンストラクタが実行されました");
		this.playerName = playerName;
	}

	// =============================

	// =============================
	// ◆メソッド

	/**
	 * 出す手を決める
	 */
	public void decideHand() {
		double randomNum1 = Math.random() * 3;
		if (randomNum1 < 1) {
			playerHand = STONE;
			System.out.println(playerName + ":グー");
		} else if (randomNum1 < 2) {
			playerHand = SCISSORS;
			System.out.println(playerName + ":チョキ");
		} else if (randomNum1 < 3) {
			playerHand = PAPER;
			System.out.println(playerName + ":パー");
		}
	}

	/**
	 * プレイヤーの名前を参照する(アクセサ:ゲッター)
	 */
	public String getPlayerName() {
		return this.playerName;
	}

	/**
	 * プレイヤーの手を参照する(アクセサ:ゲッター)
	 */
	public int getPlayerHand() {
		return this.playerHand;
	}

	/**
	 * プレイヤーのじゃんけん勝数を参照する(アクセサ:ゲッター)
	 */
	public int getWinCount() {
		return this.winCount;
	}

	/**
	 * プレイヤーのじゃんけん勝数を設定する(アクセサ:セッター)
	 */
	public void setWinCount(int winCount) {
		this.winCount = winCount;
	}

	/**
	 * じゃんけん勝数加算
	 */
	public void addWinCount() {
		winCount++;
	}
	// =============================
}
