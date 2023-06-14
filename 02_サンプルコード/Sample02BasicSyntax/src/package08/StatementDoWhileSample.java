package package08;

class StatementDoWhileSample {
    public static void main(String[] args) {
        int num;
        num = 10;

        do {
            System.out.println("numは" + num);
            num += 33;
        } while (num < 100);
        System.out.println("numは" + num + "になったのでdowhileを抜けました");

        // 参考：whileとの結果の違い
        //		num = 0;
        //		while(num < 100)
        //		{
        //			System.out.println("numは" + num);
        //			num +=33;
        //		}
        //		System.out.println("numは" + num + "になったのでwhileを抜けました");

        int num2 = 500;
        do {
            num2 += 1;
            System.out.println("numに加算される→" + num);
        } while (num2 < 100);

        // 参考：whileとの結果の違い
        //		while(num < 100)
        //		{
        //			num2 +=1;
        //			System.out.println("numに加算されない");
        //		}
        //		System.out.println("numは値が変化しない→" + num);

    }
}
