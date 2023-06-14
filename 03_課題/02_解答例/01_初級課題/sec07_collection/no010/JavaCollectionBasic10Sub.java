package mvc.java.kadai.se.cat01.sec07_collection.no010;

import java.util.ArrayList;

public class JavaCollectionBasic10Sub {

	private ArrayList<String> strArrayList = new ArrayList<>();

	public void addStr(String str) {
		strArrayList.add(str);
		System.out.println("[" + str + "]を格納しました");
	}

	public void showAllStrDesc() {
		System.out.println("◆strArrayList文字列一覧(新しく格納された順)");
		for (int i = strArrayList.size() - 1; 0 <= i; i--) {
			System.out.println(strArrayList.get(i));
		}
	}

}
