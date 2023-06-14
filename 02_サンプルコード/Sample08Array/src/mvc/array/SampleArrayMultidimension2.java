package mvc.array;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SampleArrayMultidimension2 {

    // コンソールからの入力用リーダー
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) {
        // 多次元配列サンプル

        int[][] scores = new int[3][4];

    }


    private static int inputNum(String message) throws Exception {
        System.out.print(message);

        String line = reader.readLine();
        int num = Integer.parseInt(line);

        System.out.println();

        return num;
    }
}
