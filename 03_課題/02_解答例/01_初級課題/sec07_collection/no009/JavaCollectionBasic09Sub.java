package mvc.java.kadai.se.cat01.sec07_collection.no009;

import java.util.ArrayList;

public class JavaCollectionBasic09Sub {

	private ArrayList<Integer> intArrayList = new ArrayList<>();

	public void addInt(int number) {
		intArrayList.add(number);
		System.out.println("[" + number + "]を格納しました");
	}

	public int getAllSum() {
		int sum = 0;
		for (int i = 0; i < intArrayList.size(); i++) {
			sum = sum + intArrayList.get(i);
		}
		return sum;
	}

}
