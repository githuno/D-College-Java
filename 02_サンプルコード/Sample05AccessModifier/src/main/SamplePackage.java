package main;

import sub.Person1;
import sub.Person2;
import sub.Person3child;
import sub.Person3parent;;

public class SamplePackage {

    public static void main(String[] args) {

        // このような書き方をすればimportせずともクラスを利用できますが、通常はこの書き方はしません。
        //jp.co.opst.mvc.sub.Person1 p1 = new jp.co.opst.mvc.sub.Person1();

        // ◆ public
        // public は「どのクラスからでも利用可能」。
        Person1 p1 = new Person1();
        p1.setMemory("書き換えられた");
        p1.printMemory();

        // ◆ private
        // private は「同一クラス内からのみ利用可能」。
        Person2 p2 = new Person2();
        //p2.setMemory("書き換えられた"); // このメソッドはprivateであるので外部からは利用できない。[コンパイルエラー]
        p2.printMemory();

        // ◆ protected (その1)
        // protected は「そのクラスを継承したサブクラス または 同一パッケージ内のクラスから利用可能」。
        Person3parent p3p = new Person3parent();
        //p3p.setMemory("書き換えられた"); // このメソッドはprotectedであるので、上記以外からは利用できない。[コンパイルエラー]
        p3p.printMemory();

        // ◆ protected (その2)
        // protected は「そのクラスを継承したサブクラス または 同一パッケージ内のクラスから利用可能」。
        Person3child p3c = new Person3child();
        p3c.setMemoryChild("サブクラス経由で書き換えられた");
        p3c.printMemory();
    }
}
