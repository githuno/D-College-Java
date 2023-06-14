package package06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class StatementSwitchSample {
    public static void main(String[] args) {
        int num;
        num = 1;

        switch (num) {
        case 1:
            System.out.println("1です");
            break;
        case 2:
            System.out.println("2です");
            break;
        default:
            System.out.println("3以上です");
        }

        // breakを抜いてみる
        int month = 0;

        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); // 入力ストリームを生成
            System.out.print("1～12までの整数で月を入力してください：");
            String line = reader.readLine(); // 標準入力を取得
            month = Integer.parseInt(line); // 取得した入力値をInteger型に変換
        } catch (IOException e) {
            // 例外処理
        }

        switch (month) {
        case 12:
        case 1:
        case 2:
            System.out.println("冬です。");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("春です。");
            break;
        case 6:
        case 7:
        case 8:
            System.out.println("夏です。");
            break;
        case 9:
        case 10:
        case 11:
            System.out.println("秋です。");
            break;
        default:
            System.out.println("1～12までの整数で月を入力してください。");

        }

        // JDK 7リリースでは、switch文の式にStringオブジェクトを使用できる。
        String key = "A1";

        switch (key) {
        case "A1":
            System.out.println("A1です。");
            break;
        case "A2":
            System.out.println("A2です。");
            break;
        case "B1":
            System.out.println("B1です。");
            break;
        case "C1":
            System.out.println("C1です。");
            break;
        case "C2":
            System.out.println("C2です。");
            break;
        default:
            System.out.println("該当しないキーです。");

        }

    }
}
