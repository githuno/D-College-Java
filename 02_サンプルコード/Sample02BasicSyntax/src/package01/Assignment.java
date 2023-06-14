package package01;

// 変数をデータ型サンプル
class Assignment {

    public static void main(String[] args) {

        int num; // 整数型の変数の宣言
                 //
        num = 10; // 変数へ代入

        String str = "文字列"; // 文字列の変数の初期化

        System.out.println("numの値は" + num + "。");
        System.out.println("strの値は" + str + "。");

        //		// 定数
        //		final int NUM = 10;		// 整数型の定数の初期化
        //
        //		num ++;						// 変数は再代入できるが
        //		NUM ++;						// 定数はできない

        System.out.println("*****************************************");

        /*	整数型
         *  型名：int
         *  格納するデータ：普通の整数(32bit)
         *  使用頻度：◎
         */
        int salary = 152000; // 給与金額
        System.out.println("salary:" +salary);

        /*	整数型
         *  型名：byte
         *  格納するデータ：とても小さな整数（8bit=1byte）
         *  使用頻度：△
         */
        byte glasses = 2; // 所持する眼鏡の数
        System.out.println("glasses:" +glasses);

        /*	整数型
         *  型名：short
         *  格納するデータ：小さな整数（16bit）
         *  使用頻度：△
         */
        short age = 18; // 年齢
        System.out.println("age:" +age);

        /*	整数型
         *  型名：long
         *  格納するデータ：大きな整数(64bit)
         *  使用頻度：△
         */
        long worldPeople = 6900000000L; // 世界の人口
        System.out.println("worldPeople:" +worldPeople);

        /*	浮動小数型
         *  型名：float
         *  格納するデータ：単精度浮動小数点型(32bit)
         */
        float flo = 1.288e5f; // 1.288 * 10^5
        System.out.println("flo:" +flo);

        /*	浮動小数型
         *  型名：double
         *  格納するデータ：倍精度浮動小数点型(64bit)
         */
        double doub = 12.11;
        System.out.println("doub:" +doub);

        System.out.println("salary:" +salary);
        // 浮動小数型は近似値なので計算結果には注意
        double doubA = 1.1;
        double doubB = 0.2;
        double doubSum = doubA - doubB;

        System.out.println(" 1.1 - 0.2 = " + doubSum);

        System.out.println("*****************************************");

        // リテラル 整数型
        int a = 100; // 何も表記しない場合、10進数int型
        System.out.println("a=[" + a + "]");

        int b = 0x64; // 16進数リテラル
        System.out.println("b=[" + b + "]");

        // リテラル 文字型
        char c = 'A';
        System.out.println("c=[" + c + "]");

        // リテラル 文字列
        String d = "ABC";
        System.out.println("d=[" + d + "]");

        String e = "\u3042\u3044\u3046\u3048\u304A";
        System.out.println("e=[" + e + "]");

        String f = "\n\'\"\\";
        System.out.println("f=[" + f + "]");

        // リテラル 論理型
        boolean g = true;
        System.out.println("g=[" + g + "]");

        boolean h = false;
        System.out.println("h=[" + h + "]");

        System.out.println("*****************************************");

        // データ型 参照型 同じ内容でも別の場所
        char[] array1 = { 'A', 'B', 'C' };
        char[] array2 = { 'A', 'B', 'C' };

        System.out.println("array1[0]=[" + array1[0] + "]");
        System.out.println("array2[0]=[" + array2[0] + "]");

        array1[0] = 'Z';

        System.out.println("array1[0]=[" + array1[0] + "]");
        System.out.println("array2[0]=[" + array2[0] + "]");

        System.out.println("*****************************************");

        // データ型 参照型 別の変数で同じ場所
        char[] array3 = { 'A', 'B', 'C' };
        char[] array4 = array3;

        System.out.println("array1[0]=[" + array3[0] + "]");
        System.out.println("array2[0]=[" + array4[0] + "]");

        array3[0] = 'Z';

        System.out.println("array1[0]=[" + array3[0] + "]");
        System.out.println("array2[0]=[" + array4[0] + "]");

    }

}
