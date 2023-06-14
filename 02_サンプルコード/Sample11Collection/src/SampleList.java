
import java.util.ArrayList;

public class SampleList {
    public static void main(String[] args) {
        ///////////////////////////////////////////////////////
        // 注：Java 5.0 以降ではこのような書き方はしません。 //
        ///////////////////////////////////////////////////////

        // 宣言と作成を同時に書ける。
        ArrayList studentList = new ArrayList();

        // 要素の追加
        studentList.add("山田");
        studentList.add("佐藤");
        studentList.add("田中");

        // 要素数と要素へのアクセス
        for(int i = 0; i< studentList.size(); i++){
            System.out.println(i + "番目は" + (String)studentList.get(i));
        }

    }
}
