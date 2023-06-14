
import java.util.HashSet;
import java.util.Set;

public class SampleSet {
	public static void main(String[] args) {

		// 宣言と作成を同時に書ける。
		Set<String> studentSet = new HashSet<String>();

		// 要素の追加
		studentSet.add("山田");
		studentSet.add("佐藤");
		studentSet.add("佐藤");
		studentSet.add("田中");

		// 要素数と要素へのアクセス
		// 拡張for文を使ってみる
		for (String student : studentSet) {
			System.out.println(student);
		}
	}
}
