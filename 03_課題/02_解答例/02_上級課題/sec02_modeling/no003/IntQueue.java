package mvc.java.kadai.se.cat02.sec02_modeling.no003;
/**
 * 練習問題3_サンプル回答
 *
 *
 */
public class IntQueue {

    // キューを格納する配列を定義(最大10個まで)
    private int[] value = new int[10];

    // 現在の配列を示すための配列番号
    int counter=0;

    // popメソッド実行時カウントアップ番号
    int popCounter = 0;

    /**
     * キューに値を入れるpushメソッド
     * スタックの最大数以上の値は格納することができない
     */
    public void push(int value) {
    	System.out.println("pushメソッド実施:" + value + "を格納します。");

        if(counter >= 10) {
            System.out.println("データがいっぱいで" + value + "を格納できませんでした。");
        } else {
            this.value[counter] = value;
            counter++;
        }
    }

    /**
     * intのデータをキューから取り出すpopメソッド
     */
    public int pop() {
        int data = value[popCounter];
        popCounter++;
        return data;
    }

    /**
     * 現在の配列の中身を一覧で表示するviewメソッド
     *
     */
    public void view() {
    	System.out.print("現在、配列の中身は");
        for(int i=popCounter; i<counter; i++) {
            System.out.print(value[i]+" ");
        }
        System.out.println();
    }


}
