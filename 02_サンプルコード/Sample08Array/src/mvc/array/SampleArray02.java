package mvc.array;

// 配列の使用
public class SampleArray02 {
    public static void main(String[] args) {

        // 宣言と初期化
        int[] scores;				// 配列の宣言
        scores = new int[3];		// 配列の初期化

        // 配列の各要素を確認
        // （配列の要素への参照）
        System.out.println("scores[0]は" + scores[0]);
        System.out.println("scores[1]は" + scores[1]);
        System.out.println("scores[2]は" + scores[2]);

        // 配列の各要素にデータを代入する
        // （配列の要素への代入）
        scores[0] = 1;
        scores[1] = 2;
        scores[2] = 3;

        // もう一度、配列の各要素を確認
        // （配列の要素への参照）
        System.out.println("scores[0]は" + scores[0]);
        System.out.println("scores[1]は" + scores[1]);
        System.out.println("scores[2]は" + scores[2]);

        System.out.println("---");
        System.out.println(scores); // どのように表示されるでしょうか？

    }
}
