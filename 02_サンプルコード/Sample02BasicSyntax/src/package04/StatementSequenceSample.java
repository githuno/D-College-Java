package package04;

class StatementSequenceSample {

    public static void main(String[] args) {
        // 順次
        int count = 0;
        final int plus = 2;
        final int minus = -3;

        System.out.println("１．最初のcount：" + count);
        count = count + plus;

        System.out.println("２．plus：" + count);
        count += plus;

        System.out.println("３．plus：" + count);
        count = count + minus;

        System.out.println("４．minus：" + count);
        count += minus;

        System.out.println("５．minus：" + count);
    }

}
