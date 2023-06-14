package mvc.array;

// 基本型（プリミティブ型）と参照型（オブジェクト型）
public class SampleArray06 {
    public static void main(String[] args) {

        // int numeber = null; // 基本型にはnullは代入できない→エラー！
        // boolean flg = null; // 基本型にはnullは代入できない→エラー！

        String str = null; // nullを代入してエラーにならない
        str = new String("あいうえお");
        System.out.println(str);

        int[] intArray = new int[1];
        System.out.println(intArray[0]);

        boolean[] bArray = new boolean[1];
        System.out.println(bArray[0]);

        String[] strArray = new String[1];
        System.out.println(strArray[0]);

        intArray = null;
        bArray = null;
        strArray = null;

        // intArrayがnullの状態…
        for (int i = 0; i < intArray.length; i++) {
            System.out.println("intArray[" + i + "]は" + intArray[i]);
        }

    }
}
