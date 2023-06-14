package mvc.java.kadai.se.cat01.sec07_collection.no012;

import java.util.ArrayList;

public class JavaCollectionBasic12Sub {

	private ArrayList<JavaCollectionBasic12Obj> memList = new ArrayList<>();

	public void addMember(JavaCollectionBasic12Obj obj) {
		memList.add(obj);
		System.out.println("[" + obj.getfName() + obj.getlName() + "]さんを格納しました");
	}

	public void showAllMember() {
		System.out.println("◆従業員一覧");
		for (JavaCollectionBasic12Obj obj : memList) {
			System.out.print((obj.getfName() + obj.getlName()) + "(" + obj.getAge() + ")、");
			if (obj.getGender() == 'm') {
				System.out.print("男性");
			} else {
				System.out.print("女性");
			}
			System.out.println();
		}
	}

}
