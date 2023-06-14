package mvc.array;

/*
 *  配列の宣言と
 *  配列生成のバリエーション
 */
public class SampleArray04 {
    public static void main(String[] args) {

    	// 配列の宣言[1]
    	int[] numbers1;
    	
    	// 配列の宣言[2]
    	int numbers2[];
    	
        // 宣言と初期化を同時に書ける(こちらが一般的)
        int[] scores1 = new int[3];
        // int scores1[] = new int[3]; // 変数右に[]をつけてもOK
        // int scores1[] = new int[]; // エラー！

        // 宣言と初期化と初期値を同時に書く
        int[] scores2 = new int[] { 100, 200, 300, 400 };
        // int scores2[] = new int[4] { 100, 200, 300, 400 }; // エラー！

        // {初期値}がある場合、new 型[]を省略することができる
        int[] scores3 = { 100, 200, 300, 400, 100 };
        /*
         * int[] scores3;
         * scores3 = { 100, 200, 300, 400 }; // エラー！
         */

        // 配列の要素数
        System.out.println("scores1の配列要素数は" + scores1.length);
        System.out.println("scores2の配列要素数は" + scores2.length);
        System.out.println("scores3の配列要素数は" + scores3.length);

        // 配列要素へのアクセス
        for (int i = 0; i < scores1.length; i++) {
            System.out.println("scores1[" + i + "]は" + scores1[i]);
        }

        for (int i = 0; i < scores2.length; i++) {
            System.out.println("scores2[" + i + "]は" + scores2[i]);
        }

        for (int i = 0; i < scores3.length; i++) {
            System.out.println("scores3[" + i + "]は" + scores3[i]);
        }

    }
}
