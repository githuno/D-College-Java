package mvc.array;

// 文字列の配列
public class SampleArray05 {
    public static void main(String[] args) {

        // 宣言と初期化を同時に書ける(こちらが一般的)
        String strArray1[] = new String[3];

        // 宣言と初期化と初期値を同時に書く
        String strArray2[] = new String[] { "あいうえお", "かきくけこ", "さしすせそ", "たちつてと" };

        // {初期値}がある場合、new 型[]を省略することができる
        String strArray3[] = { "あいうえお", "かきくけこ", "さしすせそ", "たちつてと", "あいうえお" };

        // 配列要素へのアクセス
        for (int i = 0; i < strArray1.length; i++) {
            System.out.println("strArray1[" + i + "]は" + strArray1[i]);
        }

        for (int i = 0; i < strArray2.length; i++) {
            System.out.println("strArray2[" + i + "]は" + strArray2[i]);
        }

        for (int i = 0; i < strArray3.length; i++) {
            System.out.println("strArray3[" + i + "]は" + strArray3[i]);
        }

    }
}
