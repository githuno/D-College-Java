package mvc.array;

/*
 *  効率的な配列の使用[1]
 *  ※lengthプロパティとfor文の利用
 */
public class SampleArray03 {
    public static void main(String[] args) {

        // 宣言と初期化
        int[] scores;
        scores = new int[3];

        int count = scores.length; // 配列の要素数を取得できる

        // 配列の各要素を確認
        for (int i = 0; i < count; i++) {
            System.out.println("scores[" + i + "]は" + scores[i]);
        }

        // 配列の各要素にデータを代入する
        for (int i = 0; i < count; i++) {
            scores[i] = i + 1;
        }

        // もう一度、配列の各要素を確認
        for (int i = 0; i < count; i++) {
            System.out.println("scores[" + i + "]は" + scores[i]);
        }

    }
}
