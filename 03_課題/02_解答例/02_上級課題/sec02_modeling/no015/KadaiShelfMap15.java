package mvc.java.kadai.se.cat02.sec02_modeling.no015;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * モデリング問題15 回答例
 * Shelfを扱うメインクラス。
 *
 *
 */
public class KadaiShelfMap15 {

	public static void main(String args[]) {

		// !例外A発生時に新規作成した棚を格納していくための棚List!
		List<Shelf> shelfList = new ArrayList<>();

		// 棚を用意
		HashMap<String, ShelfEntry> hashMap = new HashMap<>();
		Shelf hashMapShelf = new Shelf(hashMap);
		shelfList.add(hashMapShelf);

		// 本を6冊用意
		Book book1 = new Book("本1", 1000, "著名1");
		Book book2 = new Book("本2", 2000, "著名2");
		Book book3 = new Book("本3", 3000, "著名3");
		Book book4 = new Book("本4", 4000, "著名4");
		Book book5 = new Book("本5", 5000, "著名5");
		Book book6 = new Book("本5", 5000, "著名5"); //book5と同じ名前

		// CDを6枚用意
		Cd cd1 = new Cd("CD1", 1500, "アーティスト1");
		Cd cd2 = new Cd("CD2", 2500, "アーティスト2");
		Cd cd3 = new Cd("CD3", 3500, "アーティスト3");
		Cd cd4 = new Cd("CD4", 4500, "アーティスト4");
		Cd cd5 = new Cd("CD5", 5500, "アーティスト5");
		Cd cd6 = new Cd("CD6", 6500, "アーティスト6");

		try {

			System.out.println("======== 本を棚にしまいます(add(ShelfEntry)メソッド) ========");

			shelfList.get(shelfList.size()-1).add(book1);
			shelfList.get(shelfList.size()-1).add(book2);
			shelfList.get(shelfList.size()-1).add(book3);
			shelfList.get(shelfList.size()-1).add(book4);
			shelfList.get(shelfList.size()-1).add(book5);
			shelfList.get(shelfList.size()-1).add(book6); //例外発生

			System.out.println("======== 本を棚にしまい終わりました(add(ShelfEntry)メソッド) ========");

			System.out.println();

			System.out.println("======== CDを棚にしまいます(add(ShelfEntry)メソッド) ========");

			shelfList.get(shelfList.size()-1).add(cd1);
			shelfList.get(shelfList.size()-1).add(cd2);
			shelfList.get(shelfList.size()-1).add(cd3);
			shelfList.get(shelfList.size()-1).add(cd4);
			shelfList.get(shelfList.size()-1).add(cd5);
			shelfList.get(shelfList.size()-1).add(cd6); //例外発生

			System.out.println("======== CDを棚にしまい終わりました(add(ShelfEntry)メソッド) ========");

		} catch (FullShelfException e) {
			// 新しい棚を作成
			HashMap<String, ShelfEntry> newHashMap = new HashMap<>();
			shelfList.add(new Shelf(newHashMap));
			System.out.println("新しい棚を追加しました(現在の棚数:" + shelfList.size() + ")");

		} catch (SameNameShelfEntryAlreadyException e) {
			System.out.println("警告メッセージ:同名のShelfEntryはすでに棚に存在しています");
		}

	}

}
