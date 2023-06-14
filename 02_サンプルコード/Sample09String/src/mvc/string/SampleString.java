package mvc.string;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SampleString {

    public static void main(String[] args) {

        /***************************
         *  Stringオブジェクトの比較
         */

        ////////
        // その1
        System.out.println("■文字列リテラルの代入");
        
        // 文字列リテラル"asdf"自体がString Poolのオブジェクトとして作成される
        String strAssignmentL = "asdf";   // 変数にはString Poolの参照が入る
        // String Poolに文字列リテラル"asdf"のオブジェクトが存在するので、
        // 文字列リテラルにはString Poolの参照が割り当てられる
        String strAssignmentR = "asdf";   // 変数にはString Poolの参照が入る

        // 左辺と右辺の参照が同じ
        if (strAssignmentL == strAssignmentR) {
            System.out.println("左辺と右辺の参照は等しい");
        } else {
            System.out.println("左辺と右辺の参照は等くない");
        }

        ////////
        // その2
        System.out.println("■文字列リテラルをStringクラスのコンストラクタの引数に");

        // 文字列リテラルにはString Poolの参照が割り当てられる
        // しかし、参照を元にStringクラスのオブジェクトが生成する
        String strConstructorL = new String("asdf");   // 生成したStringオブジェクトの参照が入る
        // 同じく、参照を元に新しいStringクラスのオブジェクトが生成する
        String strConstructorR = new String("asdf");   // 生成したStringオブジェクトの参照が入る

        // 別々のStringオブジェクトの参照なので異なる
        if (strConstructorL == strConstructorR) {
            System.out.println("左辺と右辺の参照は等しい");
        } else {
            System.out.println("左辺と右辺の参照は等くない");
        }

        ////////
        // その3
        System.out.println("■文字列リテラルを文字列連結する…コンパイラが連結後の文字列に変換");

        // 文字列リテラルにはString Poolの参照が割り当てられる
        String strConcatL = "asdf";   // 変数にはString Poolの参照が入る
        // asとdfの文字列リテラルにそれぞれString Poolの参照が割り当てられる、と推測するが
        // 実際はJavaコンパイラが"as"+"df"を"asdf"にしてくれるので
        // asdfのString Poolの参照が割り当てられる
        String strConcatR = "as" + "df";   // 変数にはString Poolの参照が入る

        // 左辺と右辺の参照は同じ
        if (strConcatL == strConcatR) {
            System.out.println("左辺と右辺の参照は等しい");
        } else {
            System.out.println("左辺と右辺の参照は等くない");
        }


        /***************************
         * 文字列の比較はequalsを使う
         */

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.println("比較したい文字列を入力してください。1つめ");
            String strInputL = reader.readLine();
            System.out.println("比較したい文字列を入力してください。2つめ");
            String strInputR = reader.readLine();

            // 同じ文字列を入力しても参照は異なる
            if (strInputL == strInputR) {
                System.out.println("左辺と右辺の参照は等しい");
            } else {
                System.out.println("左辺と右辺の参照は等くない");
            }

            // 文字列の同値を見る時にはStringクラスのequalsメソッドを使う
            if ( strInputL.equals(strInputR) ) {
                System.out.println("左辺と右辺の文字列は等しい");
            } else {
                System.out.println("左辺と右辺の文字列は等くない");
            }
        } catch( Exception e) {
            System.out.println("エラーが発生しました。");
            return;
        }


        /***************************
         * Stringクラスのメソッド
         */

        String strTest = "テスト文字列";

        /*
         * 文字列の長さを調べるのはStringクラスのlengthメソッドを使う
         */
        int length = strTest.length();
        System.out.println("文字列：" + strTest + " の長さは：" + length);

        /*
         * 文字列の特定の1文字を切り出すにはStringクラスのcharAtメソッドを使う
         */
        char char2 = strTest.charAt(1);
        char char4 = strTest.charAt(3);
        System.out.println("文字列：" + strTest + " の2文字目は：" + char2);
        System.out.println("文字列：" + strTest + " の4文字目は：" + char4);

        /*
         * 指定した書式での出力はformatメソッドを使う
         */
        String strFormat = String.format("%s%c%d%5d%05d", "文字列", '字', 100, 200, 300);
        System.out.println(strFormat);

        /*
         * 文字列連結は加算演算子か、StringBuilderクラスを使う
         */
        String strL = "文字列", strR = "連結", strSum;

        // 加算演算子の場合
        strSum = strL + strR;
        System.out.println("加算演算子での連結:" + strSum);

        // StringBuilderの場合
        StringBuilder sb = new StringBuilder(); // StringBuilderのオブジェクト生成
        sb.append(strL);                        // appendで繋げてゆき
        sb.append(strR);
        System.out.println("StringBuilderでの連結:" + sb.toString());      // toStringで出力

        /*
         * StringBufferクラスもStringBuilderクラスと同じく文字列を連結する
         * 主に以下の違いがある
         * 
         * StringBuilderクラス
         * 	各メソッドがsynchronizedによる同期を行っていない
         * 	→スレッドセーフではない、高速
         * StringBufferクラス
         * 	各メソッドがsynchronizedによる同期を行っている
         * 	→スレッドセーフである、StringBuilderよりは遅い
         * 
         * マルチスレッドを意識しない通常のプログラムの場合はStringBuilderで良い
         * ※詳しくはスレッドの講義で解説します
         */

        /*
         * 文字列に変換はvalueOfメソッドを使う
         */
        int num = 12300;
        boolean bool = true;
        double db = 2.1233;
        String numStr = String.valueOf(num);
        String boolStr = String.valueOf(bool);
        String dbStr = String.valueOf(db);
        System.out.println("numStr:" + numStr);
        System.out.println("boolStr:" + boolStr);
        System.out.println("dbStr:" + dbStr);
    }
}
