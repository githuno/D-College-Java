package java.kadai.se.cat02.sec02_modeling.no002;


public class IntStack {

    /** スタックを格納する配列を定義(最大10個格納) */
	private int[] value = new int[10];


    /**
     * スタックに値を入れるpushメソッド
     * スタックの最大数以上の値は格納することができない
     */
    public void push(int value) {
        System.out.println("pushメソッド実施:" + value + "を格納します。");


    }

    /**
     * intのデータをスタックから取り出すpopメソッド
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
