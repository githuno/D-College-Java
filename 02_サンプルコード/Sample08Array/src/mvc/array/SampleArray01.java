package mvc.array;

/*
 * 配列で対応する
 * ・クラスの人数が増えても対応可能
 * ・クラスごとに人数が異なっても対応可能
 */
public class SampleArray01 {

    public static void main(String[] args) {

        // Aクラス(13人)
        int[] aArray = { 68, 54, 42, 76, 81,
                63, 52, 25, 51, 40, 61, 15, 12 };
        showAvg(aArray);

        System.out.println("---");

        // Bクラス(24人)
        int[] bArray = { 23, 55, 12, 98, 65,
                47, 95, 77, 34, 78, 81, 88, 6, 25, 79,
                21, 32, 30, 76, 44, 74, 98, 27, 34 };
        showAvg(bArray);

        System.out.println("---");

        // Cクラス(36人)
        int[] cArray = { 39, 49, 85, 72, 57,
                85, 57, 32, 10, 96, 97, 50, 88, 52, 79,
                23, 38, 49, 90, 65, 34, 97, 95, 69, 44,
                15, 60, 59, 19, 25, 42, 45, 95, 20, 95, 85 };
        showAvg(cArray);

    }

    /**
     * 配列の全ての要素（生徒）の点数を表示し、
     * 平均点を表示する
     * @param int[] array	1クラスの生徒毎の点数
     */
    public static void showAvg(int[] array) {
        System.out.println("◆点数一覧(" + array.length + "人)");

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            System.out.println((i + 1) + "人目：" + array[i]);
            sum = sum + array[i];
        }

        double avg = sum / array.length;
        System.out.println("⇒平均点：" + avg);
    }

}
