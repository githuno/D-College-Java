package mvc.java.kadai.se.cat02.sec02_modeling.no014;

import java.util.Map;

/**
 * モデリング問題14 回答例
 * Shelfクラス
 * 本を入れたり出したり、CDに入れたり出したりします。
 *
 *
 */
public class Shelf {

	/** 棚にはいるものMap */
	Map<String,ShelfEntry> shelfEntryMap = null;

	public Shelf(Map<String,ShelfEntry> shelfEntryMap) {
		this.shelfEntryMap = shelfEntryMap;
	}

	/**
	 * 棚にものを格納するメソッド
	 */
	public void add(ShelfEntry entry) {
		//！キーを「名前」にして格納すると、getメソッドの実装が簡単になります。
		shelfEntryMap.put(entry.getName(), entry);
		System.out.println(entry.getName() + "を格納しました");
	}

	/**
	 * 棚から指定された名前に該当するものを取り出すメソッド
	 */
	public ShelfEntry get(String name) {
		return shelfEntryMap.get(name);
	}

	/**
	 * Shelfに入っているものの名前すべて取得するメソッド
	 *
	 * @return String[] Shelfに入っているすべての名前。
	 */
	public String[] getAllNames() {
		String[] allNames = new String[shelfEntryMap.size()];

		// HashMapクラスから提供されているメソッド「keySet()」はMapに
		// 保持されているデータの全キーをSet型で返却します。
		//
		// 「Set」はList、Map同様に「コレクション」のひとつです。
		//
		// そしてSetクラスのtoArrayメソッドは、引数で指定した配列に
		// Setのデータ内容を格納して返却します。

		return shelfEntryMap.keySet().toArray(allNames);
	}
}
