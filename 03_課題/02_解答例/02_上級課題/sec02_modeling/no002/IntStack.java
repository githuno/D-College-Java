package mvc.java.kadai.se.cat02.sec02_modeling.no002;


public class IntStack {

    // スタックを格納する配列を定義(最大10個まで)
    private int[] value = new int[10];

    // 現在の配列を示すための配列番号
    int counter=0;

    /**
     * スタックに値を入れるpushメソッド
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
     * intのデータをスタックから取り出すpopメソッド
     */
    public int pop() {
        counter--;
        int data = value[counter];
        return data;
    }

    /**
     * 現在の配列の中身を一覧で表示するviewメソッド
     *
     */
    public void view() {
    	System.out.print("現在、配列の中身は");
        for(int i=0; i<counter; i++) {
            System.out.print(value[i]+" ");
        }
        System.out.println();
    }


}
