
public class SampleForExt {
	public static void main(String[] args) {
		// 「データの集まり」を用意
		int scores[] = new int[] { 100, 200, 300, 400 };

		// 拡張for文を使ってみる
		for (int score : scores) {
			System.out.println(score);
		}
	}
}
