package package03;

/**
 * 特別なコメント：javadoc
 * @author 田中太郎
 * @version 1.0
 */
class StatementCommentSample {

    /**
     * mainメソッド
     * @param args mainメソッドの引数
     * @return なし
     */
    public static void main(String[] args) {
        // 実行されない文
        //以下のコメントを外すとコンパイルエラーになります。
        // int a = 1

        int b = /* 2 */ 1;
        System.out.println("bの値：" + b);

        String message = "こんにちは";

        System.out.println(message);
        /*
        message = "こんばんは";
        message = "さようなら";
        */

        System.out.println(message);

    }

}
