
import java.util.HashMap;

public class SampleAutoBoxing {
	public static void main(String[] args) {
		// 宣言と作成
		HashMap<Integer, String> studentMap = new HashMap<Integer, String>();

		// 以下keyがオートボクシングされている

		// 要素の追加
		studentMap.put(1, "山田");
		studentMap.put(2, "佐藤");
		studentMap.put(3, "田中");

		// 要素へのアクセス
		System.out.println(studentMap.get(2));
	}
}
