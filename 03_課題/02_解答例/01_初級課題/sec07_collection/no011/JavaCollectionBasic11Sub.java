package mvc.java.kadai.se.cat01.sec07_collection.no011;

import java.util.LinkedHashMap;

public class JavaCollectionBasic11Sub {

	private LinkedHashMap<String, Integer> memMap = new LinkedHashMap<>();

	public void addMember(String name, int age) {
		memMap.put(name, age);
		System.out.println("[" + name + "]さんを格納しました");
	}

	public void showAllMember() {
		System.out.println("◆従業員一覧");
		for (String name : memMap.keySet()) {
			System.out.println(name + "(" + memMap.get(name) + ")");
		}
	}

}
