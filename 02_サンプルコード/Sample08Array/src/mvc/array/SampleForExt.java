package mvc.array;
// 拡張for文
public class SampleForExt {
    public static void main(String[] args) {

        // 「データの集まり」を用意
        int[] scores = { 100, 200, 300, 400 };
        String[] strArray = { "あいうえお", "かきくけこ", "さしすせそ", "たちつてと" };

        // 拡張for文を使ってみる
        for (int score : scores) {
            System.out.println(score);
        }

        for (String str : strArray) {
            System.out.println(str);
        }

    }
}
