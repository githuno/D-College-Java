package java.kadai.se.cat02.sec02_modeling.no003;


public class IntQueue {

    /** キューを格納する配列を定義(最大10個まで) */
    private int[] value = new int[10];


    /**
     * キューに値を入れるpushメソッド
     * スタックの最大数以上の値は格納することができない
     */
    public void push(int value) {
    	System.out.println("pushメソッド実施:" + value + "を格納します。");

    }

    /**
     * intのデータをキューから取り出すpopメソッド
     */
    public int pop() {

    }

    /**
     * 現在の配列の中身を一覧で表示するviewメソッド
     *
     */
    public void view() {

    }


}
