
import java.util.HashMap;

public class SampleMap {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////
        // 注：Java 5.0 以降ではこのような書き方はしません。 //
        ///////////////////////////////////////////////////////

        // 宣言と作成を同時に書ける。
        HashMap studentMap = new HashMap();

        // 要素の追加
        studentMap.put("0001", "山田");
        studentMap.put("0002", "佐藤");
        studentMap.put("0003", "田中");

        // 要素数
        System.out.println("要素数は" + studentMap.size());

        // 要素へのアクセス
        System.out.println("Key = 0001 の Value は" + (String)studentMap.get("0001"));
        System.out.println("Key = 0002 の Value は" + (String)studentMap.get("0002"));
        System.out.println("Key = 0003 の Value は" + (String)studentMap.get("0003"));
    }
}
