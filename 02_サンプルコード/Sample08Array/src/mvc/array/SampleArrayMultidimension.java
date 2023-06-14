package mvc.array;

public class SampleArrayMultidimension {

    public static void main(String[] args) {
        // 多次元配列サンプル
        int maxX = 12;
        int maxY = 21;

        // 2次元配列の生成
        int[][] scores = new int[maxY][maxX];

        // 初期化
        for( int y = 0; y < scores.length; y++ ) {
            for( int x = 0; x < scores[y].length; x++ ) {
                scores[y][x] = y * 10 + x;
            }
        }

        // コンソールへの出力
        for( int y = 0; y < scores.length; y++ ) {
            for( int x = 0; x < scores[y].length; x++ ) {
                System.out.print(scores[y][x]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
