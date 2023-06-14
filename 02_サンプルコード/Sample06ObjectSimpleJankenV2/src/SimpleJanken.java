public class SimpleJanken {

	public static void main(String[] args) {
		System.out.println("オブジェクト指向プログラミング：3人、じゃんけん先勝3回戦");

		// V2.ルールを変更！先に3回勝ったほうが勝ち！

		GameRule game = new GameRule("じゃんけん先勝3回戦");// 変更！

		Player player1 = new Player("プレイヤー1");
		Player player2 = new Player("プレイヤー2");
		Player winPlayer = game.doGame(player1, player2);

		Player player3 = new Player("プレイヤー3");
		Player winPlayer2 = game.doGame(winPlayer, player3);

	}
}
