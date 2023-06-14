package mvc.array;

/*
 *  クラスの人数が増えたり
 *  クラスごとに人数が異なると大変
 */
public class ProblemSample {

    public static void main(String[] args) {

        // Aクラス(13人)
        int a1 = 68;
        int a2 = 54;
        int a3 = 42;
        int a4 = 76;
        int a5 = 81;
        int a6 = 63;
        int a7 = 52;
        int a8 = 25;
        int a9 = 51;
        int a10 = 40;
        int a11 = 61;
        int a12 = 15;
        int a13 = 12;
        showAvgA(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13);

        System.out.println("---");

        // Bクラス(24人)
        int b1 = 23;
        int b2 = 55;
        int b3 = 12;
        int b4 = 98;
        int b5 = 65;
        int b6 = 47;
        int b7 = 95;
        int b8 = 77;
        int b9 = 34;
        int b10 = 78;
        int b11 = 81;
        int b12 = 88;
        int b13 = 6;
        int b14 = 25;
        int b15 = 79;
        int b16 = 21;
        int b17 = 32;
        int b18 = 30;
        int b19 = 76;
        int b20 = 44;
        int b21 = 74;
        int b22 = 98;
        int b23 = 27;
        int b24 = 34;
        showAvgB(b1, b2, b3, b4, b5, b6, b7, b8, b9, b10,
                b11, b12, b13, b14, b15, b16, b17, b18, b19, b20, b21, b22, b23, b24);

        System.out.println("---");

        // Cクラス(36人)
        int c1 = 39;
        int c2 = 49;
        int c3 = 85;
        int c4 = 72;
        int c5 = 57;
        int c6 = 85;
        int c7 = 57;
        int c8 = 32;
        int c9 = 10;
        int c10 = 96;
        int c11 = 97;
        int c12 = 50;
        int c13 = 88;
        int c14 = 52;
        int c15 = 79;
        int c16 = 23;
        int c17 = 38;
        int c18 = 49;
        int c19 = 90;
        int c20 = 65;
        int c21 = 34;
        int c22 = 97;
        int c23 = 95;
        int c24 = 69;
        int c25 = 44;
        int c26 = 15;
        int c27 = 60;
        int c28 = 59;
        int c29 = 19;
        int c30 = 25;
        int c31 = 42;
        int c32 = 45;
        int c33 = 95;
        int c34 = 20;
        int c35 = 95;
        int c36 = 85;
        showAvgC(c1, c2, c3, c4, c5,
                c6, c7, c8, c9, c10, c11, c12, c13, c14, c15, c16, c17,
                c18, c19, c20, c21, c22, c23, c24, c25, c26, c27, c28,
                c29, c30, c31, c32, c33, c34, c35, c36);

    }

    public static void showAvgA(int a, int b, int c, int d, int e,
            int f, int g, int h, int i, int j, int k, int l, int n) {

        System.out.println("◆点数一覧");
        System.out.println("1人目：" + a);
        System.out.println("2人目：" + b);
        System.out.println("3人目：" + c);
        System.out.println("4人目：" + d);
        System.out.println("5人目：" + e);
        System.out.println("6人目：" + f);
        System.out.println("7人目：" + g);
        System.out.println("8人目：" + h);
        System.out.println("9人目：" + i);
        System.out.println("10人目：" + j);
        System.out.println("11人目：" + k);
        System.out.println("12人目：" + l);
        System.out.println("13人目：" + n);

        double sum = a + b + c + d + e + f + g + h + i + j + k + l + n;
        double avg = sum / 13.0;
        System.out.println("⇒平均点：" + avg);

    }

    public static void showAvgB(int a, int b, int c, int d, int e,
            int f, int g, int h, int i, int j, int k, int l, int n, int m, int o,
            int p, int q, int r, int s, int t, int u, int v, int w, int x) {

        System.out.println("◆点数一覧");
        System.out.println("1人目：" + a);
        System.out.println("2人目：" + b);
        System.out.println("3人目：" + c);
        System.out.println("4人目：" + d);
        System.out.println("5人目：" + e);
        System.out.println("6人目：" + f);
        System.out.println("7人目：" + g);
        System.out.println("8人目：" + h);
        System.out.println("9人目：" + i);
        System.out.println("10人目：" + j);
        System.out.println("11人目：" + k);
        System.out.println("12人目：" + l);
        System.out.println("13人目：" + n);
        System.out.println("14人目：" + m);
        System.out.println("15人目：" + o);
        System.out.println("16人目：" + p);
        System.out.println("17人目：" + q);
        System.out.println("18人目：" + r);
        System.out.println("19人目：" + s);
        System.out.println("20人目：" + t);
        System.out.println("21人目：" + u);
        System.out.println("22人目：" + v);
        System.out.println("23人目：" + w);
        System.out.println("24人目：" + x);

        double sum = a + b + c + d + e +
                f + g + h + i + j + k + l + n + m + o +
                p + q + r + s + t + u + v + w + x;
        double avg = sum / 24.0;
        System.out.println("⇒平均点：" + avg);

    }

    public static void showAvgC(int a, int b, int c, int d, int e,
            int f, int g, int h, int i, int j, int k, int l, int n, int m, int o, int p,
            int q, int r, int s, int t, int u, int v, int w, int x, int y, int z, int aa,
            int ab, int ac, int ad, int ae, int af, int ag, int ah, int ai, int aj) {

        System.out.println("◆点数一覧");
        System.out.println("1人目：" + a);
        System.out.println("2人目：" + b);
        System.out.println("3人目：" + c);
        System.out.println("4人目：" + d);
        System.out.println("5人目：" + e);
        System.out.println("6人目：" + f);
        System.out.println("7人目：" + g);
        System.out.println("8人目：" + h);
        System.out.println("9人目：" + i);
        System.out.println("10人目：" + j);
        System.out.println("11人目：" + k);
        System.out.println("12人目：" + l);
        System.out.println("13人目：" + n);
        System.out.println("14人目：" + m);
        System.out.println("15人目：" + o);
        System.out.println("16人目：" + p);
        System.out.println("17人目：" + q);
        System.out.println("18人目：" + r);
        System.out.println("19人目：" + s);
        System.out.println("20人目：" + t);
        System.out.println("21人目：" + u);
        System.out.println("22人目：" + v);
        System.out.println("23人目：" + w);
        System.out.println("24人目：" + x);
        System.out.println("25人目：" + y);
        System.out.println("26人目：" + z);
        System.out.println("27人目：" + aa);
        System.out.println("28人目：" + ab);
        System.out.println("29人目：" + ac);
        System.out.println("30人目：" + ad);
        System.out.println("31人目：" + ae);
        System.out.println("32人目：" + af);
        System.out.println("33人目：" + ag);
        System.out.println("34人目：" + ah);
        System.out.println("35人目：" + ai);
        System.out.println("36人目：" + aj);

        double sum = a + b + c + d + e +
                f + g + h + i + j + k + l + n + m + o + p + q +
                r + s + t + u + v + w + x + y + z + aa + ab + ac +
                ad + ae + af + ag + ah + ai + aj;
        double avg = sum / 36.0;
        System.out.println("⇒平均点：" + avg);

    }

}
