package package07;

class StatementWhileSample {
    public static void main(String[] args) {
        int num;
        num = 10;
        System.out.println("****while1****************************");
        while (num < 20) {
            System.out.println("numは" + num);
            num++;
        }
        System.out.println("numは" + num + "になったのでwhileを抜けました");

        System.out.println("****while2****************************");
        num = 0;

        while (num < 10) {
            System.out.println("numは" + num);
            num += 2;
            if (num >= 5) {
                break;
            }
        }
        System.out.println("numは5以上（" + num + "）になったので10になる前にwhileを抜けました");

        System.out.println("****while3****************************");
        num = 0;

        while (num < 10) {
            System.out.println("numは" + num);
            num += 2;
            if (num >= 5) {
                continue;
            }
            System.out.println("whileのブロック中 ここには途中から来なくなる。");
        }
        System.out.println("numは" + num + "になったのでwhileを抜けました");

    }
}
