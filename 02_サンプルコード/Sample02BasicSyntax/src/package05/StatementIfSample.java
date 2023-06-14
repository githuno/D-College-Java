package package05;

class StatementIfSample {
    public static void main(String[] args) {
        // 文 選択 if
        int a = 10;
        int b = 20;
        System.out.println("a=[" + a + "]");
        System.out.println("b=[" + b + "]");

        if (a < b) {
            System.out.println("真(true)です。");
        } else {
            System.out.println("偽(false)です。");
        }

        if (a > b) {
            System.out.println("真(true)です。");
        } else {
            System.out.println("偽(false)です。");
        }

        a = 30;
        b = 30;
        System.out.println("a=[" + a + "]");
        System.out.println("b=[" + b + "]");
        if (a < b) {
            System.out.println("真(true):1です。");
        } else if (a > b) {
            System.out.println("真(true):2です。");
        } else if (a == b) {
            System.out.println("真(true):3です。");
        } else {
            System.out.println("偽(false)です。");
        }

    }
}
