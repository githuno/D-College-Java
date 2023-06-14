package mvc.java.kadai.se.cat02.sec02_modeling.no013;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * モデリング問題13 回答例
 * Shelfを扱うメインクラス。
 *
 *
 */
public class KadaiShelfList13 {

    public static void main(String args[]) {

    	ArrayList<ShelfEntry> arrayList = new ArrayList<>();
    	LinkedList<ShelfEntry> linkedList = new LinkedList<>();

        // 棚を用意
    	Shelf arrayListShelf = new Shelf(arrayList);
    	Shelf linkedListShelf = new Shelf(linkedList);

    	// 本を6冊用意
		Book book1 = new Book("本1", 1000, "著名1");
		Book book2 = new Book("本2", 2000, "著名2");
		Book book3 = new Book("本3", 3000, "著名3");
		Book book4 = new Book("本4", 4000, "著名4");
		Book book5 = new Book("本5", 5000, "著名5");
		Book book6 = new Book("本6", 6000, "著名6");

		// CDを6枚用意
        Cd cd1 = new Cd("CD1",1500,"アーティスト1");
        Cd cd2 = new Cd("CD2",2500,"アーティスト2");
        Cd cd3 = new Cd("CD3",3500,"アーティスト3");
        Cd cd4 = new Cd("CD4",4500,"アーティスト4");
        Cd cd5 = new Cd("CD5",5500,"アーティスト5");
        Cd cd6 = new Cd("CD6",6500,"アーティスト6");

        System.out.println("======== 本を棚にしまいます(add(ShelfEntry)メソッド) ========");

        //ArrayList
        System.out.print("ArrayList:");
        arrayListShelf.add(book1);
        System.out.print("ArrayList:");
        arrayListShelf.add(book2);
        System.out.print("ArrayList:");
        arrayListShelf.add(book3);

        //LinkedList
        System.out.print("LinkedList:");
        linkedListShelf.add(book4);
        System.out.print("LinkedList:");
        linkedListShelf.add(book5);
        System.out.print("LinkedList:");
        linkedListShelf.add(book6);

        System.out.println("======== 本を棚にしまい終わりました(add(ShelfEntry)メソッド) ========");

        System.out.println();

        System.out.println("======== CDを棚にしまいます(add(ShelfEntry)メソッド) ========");

        //ArrayList
        System.out.print("ArrayList:");
        arrayListShelf.add(cd1);
        System.out.print("ArrayList:");
        arrayListShelf.add(cd2);
        System.out.print("ArrayList:");
        arrayListShelf.add(cd3);

        //LinkedList
        System.out.print("LinkedList:");
        linkedListShelf.add(cd4);
        System.out.print("LinkedList:");
        linkedListShelf.add(cd5);
        System.out.print("LinkedList:");
        linkedListShelf.add(cd6);

        System.out.println("======== CDを棚にしまい終わりました(add(ShelfEntry)メソッド) ========");

        System.out.println();

		System.out.println("======== 今の棚の中身を一覧で表示開始(getAllNames()メソッド) ========");

        //ArrayList
		System.out.print("ArrayList:");
		String[] arrayListShelfAllNames = arrayListShelf.getAllNames();
		for (int i = 0; i < arrayListShelfAllNames.length; i++) {
			System.out.print(arrayListShelfAllNames[i] + " ");
		}
		System.out.println();

        //LinkedList
		System.out.print("LinkedList:");
		String[] linkedListShelfAllNames = linkedListShelf.getAllNames();
		for (int i = 0; i < linkedListShelfAllNames.length; i++) {
			System.out.print(linkedListShelfAllNames[i] + " ");
		}
		System.out.println();

		System.out.println("======== 今の棚の中身を一覧で表示終了(getAllNames()メソッド) ========");

		System.out.println();

		System.out.println("======== 対象の本を探します(get(String name)メソッド) ========");

        //ArrayList
		System.out.print("ArrayList:");
		Book retArrayListShelfBook = (Book) arrayListShelf.get("本3");
		System.out.println(retArrayListShelfBook.getName() + "を見つけました。価格は" + retArrayListShelfBook.getPrice() + "で、著者は"
				+ retArrayListShelfBook.getAuthor() + "です。");

        //LinkedList
		System.out.print("LinkedList:");
		Book retLinkedListShelfBook = (Book) linkedListShelf.get("本6");
		System.out.println(retLinkedListShelfBook.getName() + "を見つけました。価格は" + retLinkedListShelfBook.getPrice() + "で、著者は"
				+ retLinkedListShelfBook.getAuthor() + "です。");

		System.out.println("======== 対象の本をみつけました(get(String name)メソッド ========");

        System.out.println();

		System.out.println("======== 対象のCDを探します(get(String name)メソッド) ========");

        //ArrayList
		System.out.print("ArrayList:");
		Cd retArrayListShelfCd = (Cd) arrayListShelf.get("CD3");
		System.out.println(retArrayListShelfCd.getName() + "を見つけました。価格は" + retArrayListShelfCd.getPrice() + "で、アーティストは"
				+ retArrayListShelfCd.getArtist() + "です。");

        //LinkedList
		System.out.print("LinkedList:");
		Cd retLinkedListShelfCd = (Cd) linkedListShelf.get("CD6");
		System.out.println(retLinkedListShelfCd.getName() + "を見つけました。価格は" + retLinkedListShelfCd.getPrice() + "で、アーティストは"
				+ retLinkedListShelfCd.getArtist() + "です。");

		System.out.println("======== 対象のCDをみつけました(get(String name)メソッド ========");

    }


}
