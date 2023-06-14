package java.kadai.se.cat02.sec02_modeling.no004;

public class KadaiShelf4 {

    public static void main(String args[]) {

        // 棚を用意
    	Shelf shelf = new Shelf();

    	// 本を11冊用意(以下コメントアウトを外して使用しましょう)
		//		Book book1 = new Book("本1", 1000, "著名1");
		//		Book book2 = new Book("本2", 2000, "著名2");
		//		Book book3 = new Book("本3", 3000, "著名3");
		//		Book book4 = new Book("本4", 4000, "著名4");
		//		Book book5 = new Book("本5", 5000, "著名5");
		//		Book book6 = new Book("本6", 6000, "著名6");
		//		Book book7 = new Book("本7", 7000, "著名7");
		//		Book book8 = new Book("本8", 8000, "著名8");
		//		Book book9 = new Book("本9", 9000, "著名9");
		//		Book book10 = new Book("本10", 10000, "著名10");
		//		Book book11 = new Book("本11", 11000, "著名11");

		// CDを11枚用意(以下コメントアウトを外して使用しましょう)
		//        Cd cd1 = new Cd("CD1",1500,"アーティスト1");
		//        Cd cd2 = new Cd("CD2",2500,"アーティスト2");
		//        Cd cd3 = new Cd("CD3",3500,"アーティスト3");
		//        Cd cd4 = new Cd("CD4",4500,"アーティスト4");
		//        Cd cd5 = new Cd("CD5",5500,"アーティスト5");
		//        Cd cd6 = new Cd("CD6",6500,"アーティスト6");
		//        Cd cd7 = new Cd("CD7",7500,"アーティスト7");
		//        Cd cd8 = new Cd("CD8",8500,"アーティスト8");
		//        Cd cd9 = new Cd("CD9",9500,"アーティスト9");
		//        Cd cd10 = new Cd("CD10",1050,"アーティスト10");
		//        Cd cd11 = new Cd("CD11",1150,"アーティスト11");

        System.out.println("======== 本を棚にしまいます(add(Book)メソッド) ========");
        // 以下コメントアウトを外して使用しましょう
		//        shelf.add(book1);
		//        shelf.add(book2);
		//        shelf.add(book3);
		//        shelf.add(book4);
		//        shelf.add(book5);
		//        shelf.add(book6);
		//        shelf.add(book7);
		//        shelf.add(book8);
		//        shelf.add(book9);
		//        shelf.add(book10);
		//        shelf.add(book11);
        System.out.println("======== 本を棚にしまい終わりました(add(Book)メソッド) ========");

        System.out.println();

		System.out.println("======== CDを棚にしまいます(add(Cd)メソッド) ========");
		// 実行結果の通りになるように、add(Cd)メソッドを使用しましょう。

		System.out.println("======== CDを棚にしまい終わりました(add(Cd)メソッド) ========");

        System.out.println();

		System.out.println("======== 今の棚の中身を一覧で表示開始(getAllNames()メソッド) ========");
		// 実行結果の通りになるように、getAllNames()メソッドを使用しましょう。

		System.out.println("======== 今の棚の中身を一覧で表示終了(getAllNames()メソッド) ========");

		System.out.println();

		System.out.println("======== 対象の本を探します(searchBook(String name)メソッド) ========");
		// 実行結果の通りになるように、searchBook(String name)メソッドを使用しましょう。

		System.out.println("======== 対象の本をみつけました(searchBook(String name)メソッド ========");

        System.out.println();

		System.out.println("======== 対象のCDを探します(searchCd(String name)メソッド) ========");
		// 以下コメントアウトを外して使用しましょう
		//		Cd retCd = shelf.searchCd("CD4");
		//		System.out.println(retCd.getCdName() + "を見つけました。価格は" + retCd.getCdPrice() + "で、アーティストは"
		//				+ retCd.getCdArtist() + "です。");
		System.out.println("======== 対象のCDをみつけました(searchCd(String name)メソッド ========");

    }


}
