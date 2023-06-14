package java.kadai.se.cat02.sec02_modeling.no003;

public class KadaiIntQueue3 {
    public static void main(String args[]) {

    	IntQueue intQueue = new IntQueue();

       System.out.println("======== データを格納開始(pushメソッド) ========");
       intQueue.push(1);
       intQueue.push(2);
       intQueue.push(3);
       intQueue.push(4);
       intQueue.push(5);
       intQueue.push(6);
       intQueue.push(7);
       intQueue.push(8);
       intQueue.push(9);
       intQueue.push(10);
       intQueue.push(11);
       intQueue.push(12);
       System.out.println("======== データを格納終了 ========");

       System.out.println();

       System.out.println("======== 配列の中身を一覧で表示開始(viewメソッド) ========");
       intQueue.view();
       System.out.println("======== 配列の中身を一覧で表示終了 ========");

       System.out.println();

       System.out.println("======== 配列から中身を取り出す開始(popメソッド) ========");
       System.out.println("中身:"+intQueue.pop() + "を取り出しました。");
       System.out.println("中身:"+intQueue.pop() + "を取り出しました。");
       System.out.println("中身:"+intQueue.pop() + "を取り出しました。");
       System.out.println("中身:"+intQueue.pop() + "を取り出しました。");
       System.out.println("中身:"+intQueue.pop() + "を取り出しました。");
       System.out.println("======== 配列から中身を取り出す終了 ========");

       System.out.println();

       System.out.println("======== 配列の中身を一覧で表示開始(viewメソッド) ========");
       intQueue.view();
       System.out.println("======== 配列の中身を一覧で表示終了 ========");

    }
}
