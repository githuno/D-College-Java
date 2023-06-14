package mvc.java.kadai.se.cat02.sec02_modeling.no013;

import java.util.List;

/**
 * モデリング問題13 回答例
 * Shelfクラス
 * 本を入れたり出したり、CDに入れたり出したりします。
 *
 *
 */
public class Shelf {

	/** 棚にはいるものList */
	List<ShelfEntry> shelfEntryList;

	public Shelf(List<ShelfEntry> shelfEntryList) {
		this.shelfEntryList = shelfEntryList;
	}

	/**
	 * 棚にものを格納するメソッド
	 */
	public void add(ShelfEntry entry) {
		shelfEntryList.add(entry);
		System.out.println(entry.getName() + "を格納しました");
	}

	/**
	 * 棚から指定された名前に該当するものを取り出すメソッド
	 */
	public ShelfEntry get(String name) {
		for (int i = 0; i < shelfEntryList.size(); i++) {
			if(shelfEntryList.get(i).getName().equals(name)) {
				return shelfEntryList.get(i);
			}
		}
		return null;
	}

	/**
	 * Shelfに入っているものの名前すべて取得するメソッド
	 *
	 * @return String[] Shelfに入っているすべての名前。
	 */
	public String[] getAllNames() {
		String[] allNames = new String[shelfEntryList.size()];

		for (int i = 0; i < shelfEntryList.size(); i++) {
			allNames[i] = shelfEntryList.get(i).getName();
		}

		return allNames;
	}
}
