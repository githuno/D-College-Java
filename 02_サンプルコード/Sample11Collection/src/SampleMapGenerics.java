
import java.util.HashMap;
import java.util.Map;

public class SampleMapGenerics {
	public static void main(String[] args) {

		// 宣言と作成を同時に書ける。
		Map<String,String> studentMap = new HashMap<String,String>();

		// 要素の追加
		studentMap.put("0001", "山田");
		studentMap.put("0002", "佐藤");
		studentMap.put("0003", "田中");

		// 要素数
		System.out.println("要素数は" + studentMap.size());

		// 要素へのアクセス
		System.out.println("Key = 0001 の Value は" + studentMap.get("0001"));
		System.out.println("Key = 0002 の Value は" + studentMap.get("0002"));
		System.out.println("Key = 0003 の Value は" + studentMap.get("0003"));
	}
}
