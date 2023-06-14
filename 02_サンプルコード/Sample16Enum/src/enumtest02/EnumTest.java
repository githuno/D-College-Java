package enumtest02;

public class EnumTest {

    public static void main(String[] args) {
    	// 列挙子の一つをEnumクラスの変数に代入
    	// (その時にコンストラクタが呼ばれ、フィールドに初期値が入る)
    	Family family = Family.BROTHER;

    	// 列挙子を出力
        System.out.println(family);

        // メソッド呼び出し
        System.out.println(family.getId());


        // enum apiのメソッドを使ってみる
        // 文字列から列挙子を取得
        System.out.println(Family.valueOf("FATHER"));

        // 全ての列挙子を取得(その１)
        for (Family fl : Family.values() ) {
        	System.out.println(fl);
        }

        // 全ての列挙子を取得（その２）
        for (Family fl : Family.values() ) {
        	System.out.println(fl.name() + "の値は" +fl.getId());
        }

    }
}
