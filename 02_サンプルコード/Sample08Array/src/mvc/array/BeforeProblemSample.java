package mvc.array;

/*
 * 複数の値をあつかう
 * （配列無し）
 */
public class BeforeProblemSample {
	
	// クラスごとのテストの平均点を求める
    public static void main(String[] args) {

        // Aクラスの点数
        int a1 = 68;
        int a2 = 54;
        int a3 = 42;
        int a4 = 76;
        int a5 = 81;
        showAvg(a1, a2, a3, a4, a5);

        System.out.println("---");

        // Bクラスの点数
        int b1 = 23;
        int b2 = 55;
        int b3 = 12;
        int b4 = 98;
        int b5 = 65;
        showAvg(b1, b2, b3, b4, b5);

        System.out.println("---");

        // Cクラスの点数
        int c1 = 39;
        int c2 = 49;
        int c3 = 85;
        int c4 = 72;
        int c5 = 57;
        showAvg(c1, c2, c3, c4, c5);

    }

    /**
     * クラス全員の点数と平均点を表示する
     */
    public static void showAvg(int a, int b, int c, int d, int e) {

        System.out.println("◆点数一覧");
        System.out.println("1人目：" + a);
        System.out.println("2人目：" + b);
        System.out.println("3人目：" + c);
        System.out.println("4人目：" + d);
        System.out.println("5人目：" + e);

        double sum = a + b + c + d + e;
        double avg = sum / 5.0;
        System.out.println("⇒平均点：" + avg);

    }

}
