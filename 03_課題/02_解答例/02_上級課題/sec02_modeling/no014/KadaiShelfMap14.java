package mvc.java.kadai.se.cat02.sec02_modeling.no014;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * モデリング問題14 回答例
 * Shelfを扱うメインクラス。
 *
 *
 */
public class KadaiShelfMap14 {

    public static void main(String args[]) {

    	HashMap<String,ShelfEntry> hashMap = new HashMap<>();
    	TreeMap<String, ShelfEntry> treeMap = new TreeMap<>();
    	LinkedHashMap<String, ShelfEntry> linkedHashMap = new LinkedHashMap<>();

        // 棚を用意
    	Shelf hashMapShelf = new Shelf(hashMap);
    	Shelf treeMapShelf = new Shelf(treeMap);
    	Shelf linkedHashMapShelf = new Shelf(linkedHashMap);

    	// 本を9冊用意
		Book book1 = new Book("本1", 1000, "著名1");
		Book book2 = new Book("本2", 2000, "著名2");
		Book book3 = new Book("本3", 3000, "著名3");
		Book book4 = new Book("本4", 4000, "著名4");
		Book book5 = new Book("本5", 5000, "著名5");
		Book book6 = new Book("本6", 6000, "著名6");
		Book book7 = new Book("本7", 7000, "著名7");
		Book book8 = new Book("本8", 8000, "著名8");
		Book book9 = new Book("本9", 9000, "著名9");

		// CDを9枚用意
        Cd cd1 = new Cd("CD1",1500,"アーティスト1");
        Cd cd2 = new Cd("CD2",2500,"アーティスト2");
        Cd cd3 = new Cd("CD3",3500,"アーティスト3");
        Cd cd4 = new Cd("CD4",4500,"アーティスト4");
        Cd cd5 = new Cd("CD5",5500,"アーティスト5");
        Cd cd6 = new Cd("CD6",6500,"アーティスト6");
        Cd cd7 = new Cd("CD7",7500,"アーティスト7");
        Cd cd8 = new Cd("CD8",8500,"アーティスト8");
        Cd cd9 = new Cd("CD9",9500,"アーティスト9");

        System.out.println("======== 本を棚にしまいます(add(ShelfEntry)メソッド) ========");

        // HashMap
        System.out.print("HashMap:");
        hashMapShelf.add(book1);
        System.out.print("HashMap:");
        hashMapShelf.add(book2);
        System.out.print("HashMap:");
        hashMapShelf.add(book3);

        // TreeMap
        System.out.print("TreeMap:");
        treeMapShelf.add(book4);
        System.out.print("TreeMap:");
        treeMapShelf.add(book5);
        System.out.print("TreeMap:");
        treeMapShelf.add(book6);

        // LinkedHashMap
        System.out.print("LinkedHashMap:");
        linkedHashMapShelf.add(book7);
        System.out.print("LinkedHashMap:");
        linkedHashMapShelf.add(book8);
        System.out.print("LinkedHashMap:");
        linkedHashMapShelf.add(book9);

        System.out.println("======== 本を棚にしまい終わりました(add(ShelfEntry)メソッド) ========");

        System.out.println();

        System.out.println("======== CDを棚にしまいます(add(ShelfEntry)メソッド) ========");

        // HashMap
        System.out.print("HashMap:");
        hashMapShelf.add(cd1);
        System.out.print("HashMap:");
        hashMapShelf.add(cd2);
        System.out.print("HashMap:");
        hashMapShelf.add(cd3);

        // TreeMap
        System.out.print("TreeMap:");
        treeMapShelf.add(cd4);
        System.out.print("TreeMap:");
        treeMapShelf.add(cd5);
        System.out.print("TreeMap:");
        treeMapShelf.add(cd6);

        // LinkedHashMap
        System.out.print("LinkedHashMap:");
        linkedHashMapShelf.add(cd7);
        System.out.print("LinkedHashMap:");
        linkedHashMapShelf.add(cd8);
        System.out.print("LinkedHashMap:");
        linkedHashMapShelf.add(cd9);

        System.out.println("======== CDを棚にしまい終わりました(add(ShelfEntry)メソッド) ========");

        System.out.println();

		System.out.println("======== 今の棚の中身を一覧で表示開始(getAllNames()メソッド) ========");

        // HashMap
        System.out.print("HashMap:");
		String[] hashMapAllNames = hashMapShelf.getAllNames();
		for (int i = 0; i < hashMapAllNames.length; i++) {
			System.out.print(hashMapAllNames[i] + " ");
		}
		System.out.println();

        // TreeMap
        System.out.print("TreeMap:");
		String[] treeMapAllNames = treeMapShelf.getAllNames();
		for (int i = 0; i < treeMapAllNames.length; i++) {
			System.out.print(treeMapAllNames[i] + " ");
		}
		System.out.println();

        // LinkedHashMap
        System.out.print("LinkedHashMap:");
		String[] linkedHashMapAllNames = linkedHashMapShelf.getAllNames();
		for (int i = 0; i < linkedHashMapAllNames.length; i++) {
			System.out.print(linkedHashMapAllNames[i] + " ");
		}
		System.out.println();

		System.out.println("======== 今の棚の中身を一覧で表示終了(getAllNames()メソッド) ========");

		System.out.println();

		System.out.println("======== 対象の本を探します(get(String name)メソッド) ========");

        System.out.print("HashMap:");
		Book retHashMapBook = (Book) hashMapShelf.get("本1");
		System.out.println(retHashMapBook.getName() + "を見つけました。価格は" + retHashMapBook.getPrice() + "で、著者は"
				+ retHashMapBook.getAuthor() + "です。");

        System.out.print("TreeMap:");
		Book retTreeMapBook = (Book) treeMapShelf.get("本4");
		System.out.println(retTreeMapBook.getName() + "を見つけました。価格は" + retTreeMapBook.getPrice() + "で、著者は"
				+ retTreeMapBook.getAuthor() + "です。");

        System.out.print("LinkedHashMap:");
		Book retLinkedHashMapBook = (Book) linkedHashMapShelf.get("本7");
		System.out.println(retLinkedHashMapBook.getName() + "を見つけました。価格は" + retLinkedHashMapBook.getPrice() + "で、著者は"
				+ retLinkedHashMapBook.getAuthor() + "です。");

		System.out.println("======== 対象の本をみつけました(get(String name)メソッド ========");

        System.out.println();

		System.out.println("======== 対象のCDを探します(get(String name)メソッド) ========");

        System.out.print("HashMap:");
		Cd retHashMapCd = (Cd) hashMapShelf.get("CD2");
		System.out.println(retHashMapCd.getName() + "を見つけました。価格は" + retHashMapCd.getPrice() + "で、著者は"
				+ retHashMapCd.getArtist() + "です。");

        System.out.print("TreeMap:");
		Cd retTreeMapCd = (Cd) treeMapShelf.get("CD5");
		System.out.println(retTreeMapCd.getName() + "を見つけました。価格は" + retTreeMapCd.getPrice() + "で、著者は"
				+ retTreeMapCd.getArtist() + "です。");

        System.out.print("LinkedHashMap:");
		Cd retLinkedHashMapCd = (Cd) linkedHashMapShelf.get("CD8");
		System.out.println(retLinkedHashMapCd.getName() + "を見つけました。価格は" + retLinkedHashMapCd.getPrice() + "で、著者は"
				+ retLinkedHashMapCd.getArtist() + "です。");

		System.out.println("======== 対象のCDをみつけました(get(String name)メソッド ========");

    }


}
