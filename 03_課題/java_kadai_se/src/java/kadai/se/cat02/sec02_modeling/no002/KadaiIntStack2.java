package java.kadai.se.cat02.sec02_modeling.no002;



public class KadaiIntStack2 {
    public static void main(String args[]) {

       IntStack intStack = new IntStack();

       System.out.println("======== データを格納開始(pushメソッド) ========");
       intStack.push(1);
       intStack.push(2);
       intStack.push(3);
       intStack.push(4);
       intStack.push(5);
       intStack.push(6);
       intStack.push(7);
       intStack.push(8);
       intStack.push(9);
       intStack.push(10);
       intStack.push(11);
       intStack.push(12);
       System.out.println("======== データを格納終了 ========");

       System.out.println();

       System.out.println("======== 配列の中身を一覧で表示開始(viewメソッド) ========");
       intStack.view();
       System.out.println("======== 配列の中身を一覧で表示終了 ========");

       System.out.println();

       System.out.println("======== 配列から中身を取り出す開始(popメソッド) ========");
       System.out.println("中身:"+intStack.pop() + "を取り出しました。");
       System.out.println("中身:"+intStack.pop() + "を取り出しました。");
       System.out.println("中身:"+intStack.pop() + "を取り出しました。");
       System.out.println("中身:"+intStack.pop() + "を取り出しました。");
       System.out.println("中身:"+intStack.pop() + "を取り出しました。");
       System.out.println("======== 配列から中身を取り出す終了 ========");

       System.out.println();

       System.out.println("======== 配列の中身を一覧で表示開始(viewメソッド) ========");
       intStack.view();
       System.out.println("======== 配列の中身を一覧で表示終了 ========");

    }
}
